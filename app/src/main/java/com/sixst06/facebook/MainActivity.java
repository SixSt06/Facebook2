package com.sixst06.facebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.sixst06.facebook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Publicacion> publicaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(new Publicacion("", "Toby", "6:00", "El Doge esta Feliz", "", "Me Gusta", "Comentar", "Compartir"));
        publicaciones.add(new Publicacion("", "Toby", "6:30", "El Doge sigue feliz", "", "Me Gusta", "Comentar", "Compartir"));
        publicaciones.add(new Publicacion("", "Toby", "7:00", "Ya me aburrio este dude", "", "Me Gusta", "Comentar", "Compartir"));

        binding.rclvFace.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.rclvFace.setLayoutManager(layoutManager);
        FacebookAdapter adapter = new FacebookAdapter(publicaciones);
        binding.rclvFace.setAdapter(adapter);
    }
}