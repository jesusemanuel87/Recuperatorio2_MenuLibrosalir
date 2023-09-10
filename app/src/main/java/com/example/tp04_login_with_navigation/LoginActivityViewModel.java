package com.example.tp04_login_with_navigation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginActivityViewModel extends ViewModel {
    private final MutableLiveData<Boolean> isValidCredentials = new MutableLiveData<>();

    public boolean isValidCredentials(String username, String password) {
        isValidCredentials.setValue(username.equals("user") && password.equals("123"));
        return isValidCredentials.getValue();
    }

    public LiveData<Boolean> getIsValidCredentials() {
        return isValidCredentials;
    }
}