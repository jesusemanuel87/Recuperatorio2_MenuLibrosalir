package com.example.tp04_login_with_navigation.ui.foto;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FotoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FotoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}