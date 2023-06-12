package com.example.testapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FootballViewModel : ViewModel() {

    private val _submittedText : MutableLiveData<String> =
        MutableLiveData<String>().also {mutableLiveData ->
            mutableLiveData.value = "ここに出力されるはずです"
        }
    val submittedText: LiveData<String> get() = _submittedText


    private val _buttonText: MutableLiveData<String> =
        MutableLiveData<String>().also { mutableLiveData ->
            mutableLiveData.value = "Ready"
        }
    val buttonText : LiveData<String> get() = _buttonText

    fun updateButton(isBlank: Boolean) {
        //_isEnabled.value = !isBlank

        if (!isBlank) {
            _buttonText.value = "Set!!!"
        } else {
            _buttonText.value = "Ready!!!"
        }
    }

    fun submitText(text: String) {
        _submittedText.value = text
    }
}