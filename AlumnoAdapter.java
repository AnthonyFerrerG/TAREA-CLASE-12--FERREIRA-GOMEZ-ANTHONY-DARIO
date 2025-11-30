package com.example.customlistviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AlumnoAdapter extends ArrayAdapter<Alumno> {

    private Context context;
    private List<Alumno> alumnos;

    public AlumnoAdapter(@NonNull Context context, @NonNull List<Alumno> alumnos) {
        super(context, 0, alumnos);
        this.context = context;
        this.alumnos = alumnos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;

        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        Alumno alumnoActual = alumnos.get(position);

        ImageView imageView = itemView.findViewById(R.id.imageViewAlumno);
        TextView textViewNombre = itemView.findViewById(R.id.textViewNombre);
        TextView textViewCarrera = itemView.findViewById(R.id.textViewCarrera);

        imageView.setImageResource(alumnoActual.getImagenResId());
        textViewNombre.setText(alumnoActual.getNombre());
        textViewCarrera.setText(alumnoActual.getCarrera());

        return itemView;
    }
}
