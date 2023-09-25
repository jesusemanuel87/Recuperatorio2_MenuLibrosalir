package com.example.tp04_login_with_navigation.ui.libros;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tp04_login_with_navigation.databinding.FragmentDetalleLibrosBinding;


public class DetalleLibros extends Fragment {
    private FragmentDetalleLibrosBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDetalleLibrosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Bundle bundle = getArguments();
        Libros libros = (Libros) bundle.getSerializable("libros");
        binding.tvTitulo.setText("Titulo: " + libros.getTitulo());
        binding.tvAutor.setText("Autor: " + libros.getAutor());
        binding.tvEditorial.setText("Editorial: " + libros.getEditorial());
        binding.tvAnio.setText("Año " + libros.getAnio());

        return root;
    }

}