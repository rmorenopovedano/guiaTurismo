package com.example.raul.guiaturismo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView nombre;
    private TextView parrafo;
    private ImageView foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        foto = (ImageView) findViewById(R.id.foto);
        nombre=(TextView)findViewById(R.id.nombre);
        parrafo=(TextView)findViewById(R.id.parrafo);

        Sitio sitio = (Sitio) getIntent().getExtras().getSerializable("sitio");

        foto.setImageResource(sitio.getIdDrawable());
        nombre.setText(sitio.getTitulo());
        parrafo.setText(sitio.getDescripcion());
    }
}
