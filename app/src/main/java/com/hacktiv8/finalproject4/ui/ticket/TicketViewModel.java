package com.hacktiv8.finalproject4.ui.ticket;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class TicketViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TicketViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}