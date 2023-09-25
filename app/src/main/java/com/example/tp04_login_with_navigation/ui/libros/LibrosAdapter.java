package com.example.tp04_login_with_navigation.ui.libros;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tp04_login_with_navigation.R;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class LibrosAdapter extends RecyclerView.Adapter<LibrosAdapter.ViewHolder> {
    private List<Libros> libros;
    private final Context context;
    private final LayoutInflater layoutInflater;
    public LibrosAdapter(List<Libros> libros, Context context, LayoutInflater layoutInflater){
        this.libros = libros;
        this.context = context;
        this.layoutInflater=layoutInflater;
    }
    public void setLibros(List<Libros> libros){
        this.libros=libros;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_libros,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Libros libro = libros.get(position);
        if (libro !=null){
            holder.titulo.setText(libros.get(position).getTitulo());
            holder.autor.setText(libros.get(position).getAutor());

        }
    }
    @Override
    public int getItemCount() {
        return libros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView titulo;
        private final TextView autor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tvTitulo);
            autor = itemView.findViewById(R.id.tvAutor);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("libros", libros.get(getAdapterPosition()));
                    Navigation.findNavController(view).navigate(R.id.nav_detalleLibros, bundle);
                }
            });

        }
    }
}
