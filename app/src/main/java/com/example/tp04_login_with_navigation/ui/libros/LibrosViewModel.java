package com.example.tp04_login_with_navigation.ui.libros;

import android.app.Application;
import android.content.Context;
import android.content.Intent;


import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;


public class LibrosViewModel extends AndroidViewModel {
    private MutableLiveData<List<Libros>> mLibros;
    private final Context context;
    public LibrosViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }

    public LiveData<List<Libros>> getMLibros() {
        if (mLibros == null){
            mLibros = new MutableLiveData<>();
        }
        return mLibros;
    }

    public void cargarDatosDeLibros() {
        List<Libros> lista=new ArrayList<>();
        lista.add(new Libros("La Sombra del Viento", "Carlos Ruiz Zafón", "Planeta", 2001));
        lista.add(new Libros("Cien años de soledad", "Gabriel García Márquez", "Sudamericana", 1967));
        lista.add(new Libros("1984", "George Orwell", "Secker & Warburg", 1949));
        lista.add(new Libros("El Gran Gatsby", "F. Scott Fitzgerald", "Scribner", 1925));
        lista.add(new Libros("Matar un ruiseñor", "Harper Lee", "J. B. Lippincott & Co.", 1960));

        mLibros.setValue(lista);
    }

}