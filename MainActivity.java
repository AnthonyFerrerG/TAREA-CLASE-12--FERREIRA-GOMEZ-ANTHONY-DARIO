package com.example.customlistviewapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewAlumnos;
    private ArrayList<Alumno> alumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewAlumnos = findViewById(R.id.listViewAlumnos);

        alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan Pérez", "Ingeniería Informática", R.drawable.ic_launcher_foreground));
        alumnos.add(new Alumno("María Gómez", "Ingeniería Industrial", R.drawable.ic_launcher_foreground));
        alumnos.add(new Alumno("Carlos López", "Derecho", R.drawable.ic_launcher_foreground));
        alumnos.add(new Alumno("Ana Martínez", "Medicina", R.drawable.ic_launcher_foreground));
        alumnos.add(new Alumno("Pedro Fernández", "Arquitectura", R.drawable.ic_launcher_foreground));

        AlumnoAdapter adapter = new AlumnoAdapter(this, alumnos);
        listViewAlumnos.setAdapter(adapter);
    }
}
