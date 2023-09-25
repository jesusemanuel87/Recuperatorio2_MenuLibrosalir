package com.example.tp04_login_with_navigation.ui.libros;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tp04_login_with_navigation.databinding.FragmentLibrosBinding;

import java.util.ArrayList;
import java.util.List;

public class LibrosFragment extends Fragment {

    private FragmentLibrosBinding binding;
    private LibrosViewModel mv;
    private LibrosAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mv = new ViewModelProvider(this).get(LibrosViewModel.class);

        binding = FragmentLibrosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RecyclerView rv = binding.rvLibros;

        GridLayoutManager glm = new GridLayoutManager(requireContext(), 1, GridLayoutManager.VERTICAL, false);
        rv.setLayoutManager(glm);

        adapter = new LibrosAdapter(new ArrayList<>(), requireContext(), getLayoutInflater());
        rv.setAdapter(adapter);

        mv.getMLibros().observe(getViewLifecycleOwner(), new Observer<List<Libros>>() {
            @Override
            public void onChanged(List<Libros> libros) {
                adapter.setLibros(libros);
            }
        });

        mv.cargarDatosDeLibros();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}