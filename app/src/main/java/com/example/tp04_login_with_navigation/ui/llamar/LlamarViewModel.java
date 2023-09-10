package com.example.tp04_login_with_navigation.ui.llamar;

import android.app.Application;
import android.content.Context;
import android.content.Intent;


import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import android.net.Uri;


public class LlamarViewModel extends AndroidViewModel {
    private MutableLiveData<String> mensajeError = new MutableLiveData<>();
    private final Context context;
    public LlamarViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }

    public LiveData<String> getMensajeError() {
        if (mensajeError == null){
            mensajeError = new MutableLiveData<>();
        }
        return mensajeError;
    }

    public void llamar(String telefono) {
        mensajeError.setValue("");
        if (telefono.isEmpty()) {
            mensajeError.setValue("Por favor, introduce un número de teléfono válido");
        } else {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:" + telefono));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            try {
                context.startActivity(intent);
            } catch (Exception e) {
                mensajeError.setValue("ERROR DE PERMISO o la función de llamada no está disponible en este dispositivo.");
            }
        }
    }

}