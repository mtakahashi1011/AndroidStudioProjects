package com.example.android.trackmysleepquality.sleeptracker;

import java.lang.System;

/**
 * ViewModel for SleepTrackerFragment.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\"\u001a\u00020#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020#J\u0013\u0010\'\u001a\u0004\u0018\u00010\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\b\u0010(\u001a\u00020#H\u0002J\u0019\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020#J\u0006\u0010-\u001a\u00020#J\u0006\u0010.\u001a\u00020#J\u0019\u0010/\u001a\u00020#2\u0006\u0010*\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00160\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u000fR\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u000b0\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR\u001f\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u000b0\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000fR\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00060"}, d2 = {"Lcom/example/android/trackmysleepquality/sleeptracker/SleepTrackerViewModel;", "Landroidx/lifecycle/ViewModel;", "dataSource", "Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;Landroid/app/Application;)V", "_navigateToSleepQuality", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "_showSnackbarEvent", "", "clearButtonVisible", "Landroidx/lifecycle/LiveData;", "getClearButtonVisible", "()Landroidx/lifecycle/LiveData;", "database", "getDatabase", "()Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "navigateToSleepQuality", "getNavigateToSleepQuality", "nights", "", "nightsString", "Landroid/text/Spanned;", "kotlin.jvm.PlatformType", "getNightsString", "showSnackBarEvent", "getShowSnackBarEvent", "startButtonVisible", "getStartButtonVisible", "stopButtonVisible", "getStopButtonVisible", "tonight", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doneNavigating", "doneShowingSnackbar", "getTonightFromDatabase", "initializeTonight", "insert", "night", "(Lcom/example/android/trackmysleepquality/database/SleepNight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClear", "onStart", "onStop", "update", "app_debug"})
public final class SleepTrackerViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * Hold a reference to SleepDatabase via SleepDatabaseDao.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepDatabaseDao database = null;
    private androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> tonight;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> nights = null;
    
    /**
     * Converted nights to Spanned for displaying.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.text.Spanned> nightsString = null;
    
    /**
     * If tonight has not been set, then the START button should be visible.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> startButtonVisible = null;
    
    /**
     * If tonight has been set, then the STOP button should be visible.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> stopButtonVisible = null;
    
    /**
     * If there are any nights in the database, show the CLEAR button.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> clearButtonVisible = null;
    
    /**
     * Request a toast by setting this value to true.
     *
     * This is private because we don't want to expose setting this value to the Fragment.
     */
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showSnackbarEvent;
    
    /**
     * Variable that tells the Fragment to navigate to a specific [SleepQualityFragment]
     *
     * This is private because we don't want to expose setting this value to the Fragment.
     */
    private final androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> _navigateToSleepQuality = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepDatabaseDao getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.text.Spanned> getNightsString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStartButtonVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStopButtonVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getClearButtonVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowSnackBarEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.trackmysleepquality.database.SleepNight> getNavigateToSleepQuality() {
        return null;
    }
    
    /**
     * Call this immediately after calling `show()` on a toast.
     *
     * It will clear the toast request, so if the user rotates their phone it won't show a duplicate
     * toast.
     */
    public final void doneShowingSnackbar() {
    }
    
    /**
     * Call this immediately after navigating to [SleepQualityFragment]
     *
     * It will clear the navigation request, so if the user rotates their phone it won't navigate
     * twice.
     */
    public final void doneNavigating() {
    }
    
    private final void initializeTonight() {
    }
    
    /**
     * Executes when the START button is clicked.
     */
    public final void onStart() {
    }
    
    /**
     * Executes when the STOP button is clicked.
     */
    public final void onStop() {
    }
    
    /**
     * Executes when the CLEAR button is clicked.
     */
    public final void onClear() {
    }
    
    public SleepTrackerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepDatabaseDao dataSource, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}