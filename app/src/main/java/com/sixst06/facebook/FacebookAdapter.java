package com.sixst06.facebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FacebookAdapter extends RecyclerView.Adapter<FacebookAdapter.ViewHolder>{
    private List<Publicacion> publicaciones;
    private Context context;

    public FacebookAdapter(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_facebook, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Publicacion publicacion = publicaciones.get(position);
        holder.imgPerfil.setImageResource(R.drawable.selfie);
        holder.txtTitulo.setText(publicacion.getTitulo());
        holder.txtHora.setText(publicacion.getHora());
        holder.txtComentario.setText(publicacion.getComentario());
        holder.imgFoto.setImageResource(R.drawable.publicacion);
        holder.btnMeGusta.setText(publicacion.getBtnMeGusta());
        holder.btnComentar.setText(publicacion.getBtnComentar());
        holder.btnCompartir.setText(publicacion.getBtnCompartir());

    }

    @Override
    public int getItemCount() {
        return publicaciones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPerfil;
        private TextView txtTitulo;
        private TextView txtHora;
        private TextView txtComentario;
        private ImageView imgFoto;
        private Button btnMeGusta;
        private Button btnComentar;
        private Button btnCompartir;
        private View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPerfil = itemView.findViewById(R.id.imgPerfil);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtHora = itemView.findViewById(R.id.txtHora);
            txtComentario = itemView.findViewById(R.id.txtComentario);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            btnMeGusta = itemView.findViewById(R.id.btnMeGusta);
            btnComentar = itemView.findViewById(R.id.btnComentar);
            btnCompartir = itemView.findViewById(R.id.btnCompartir);
            view = itemView;
        }
    }
}
