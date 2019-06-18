package com.example.examfinal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDatosRecycler extends RecyclerView.Adapter<AdapterDatosRecycler.ViewHolderDatos> {

    ArrayList<String> listDatos;

    public AdapterDatosRecycler(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_personas,
                null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        //holder.EtNombre.setText(listDatos.get(position).getNombre());
        //holder.EtEdad.setText(listDatos.get(position).getEdad());
        //holder.EtCorreo.setText(listDatos.get(position).getCorreo());
        //holder.foto.setImageResource(listDatos.get(position).getFoto());
        //viewHolderDatos.n.setText(listDatos.get(i).getId().toString());
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView    EtNombre, EtEdad, EtCorreo;
        ImageView foto;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            EtNombre=(TextView) itemView.findViewById(R.id.idNombreee);
            EtEdad=(TextView) itemView.findViewById(R.id.idEdadddd);
            EtCorreo=(TextView) itemView.findViewById(R.id.idCorreoooo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }

        //public void asignarDatos(String datos) {
          //  dato.setText(datos);
        //}
    }
}
