package com.example.tp04_login_with_navigation.ui.foto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp04_login_with_navigation.R;
import com.example.tp04_login_with_navigation.databinding.FragmentFotoBinding;

public class FotoFragment extends Fragment {

    private FragmentFotoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FotoViewModel fotoViewModel =
                new ViewModelProvider(this).get(FotoViewModel.class);

        binding = FragmentFotoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //binding.imFoto.setImageResource(R.drawable.avatar1);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}