package com.example.tp04_login_with_navigation.ui.llamar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp04_login_with_navigation.databinding.FragmentLlamarBinding;

public class LlamarFragment extends Fragment {

    private FragmentLlamarBinding binding;
    private LlamarViewModel mv;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mv = new ViewModelProvider(this).get(LlamarViewModel.class);

        binding = FragmentLlamarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mv.getMensajeError().observe(getViewLifecycleOwner(), s -> binding.tvLlamar.setText(s));

        binding.btLlamar.setOnClickListener(view -> mv.llamar(binding.etTelefono.getText().toString()));

       /* binding.btLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mv.llamar(binding.etTelefono.getText().toString());
            }
        });*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}