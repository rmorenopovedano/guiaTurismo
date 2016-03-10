package com.example.raul.guiaturismo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lstOpciones;

    private ArrayList<Sitio> sitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sitios = new ArrayList<>();
        sitios.add(new Sitio("Mezquita", "La Mezquita-Catedral de Córdoba es el monumento más importante de todo el Occidente islámico y uno de los más asombrosos del mundo. En su historia se resume la evolución completa del estilo omeya en España, además de los estilos gótico, renacentista y barroco de la construcción cristiana.", R.drawable.mezquita));
        sitios.add(new Sitio("Puente Romano", "El puente romano de Córdoba está situado sobre el río Guadalquivir a su paso por Córdoba, y une el barrio del Campo de la Verdad con el Barrio de la Catedral. También conocido como \"el Puente Viejo\" fue el único puente con que contó la ciudad durante 20 siglos, hasta la construcción del puente de San Rafael, a mediados del siglo XX.", R.drawable.puenteromano));
        sitios.add(new Sitio("Calahorra", "La Torre de la Calahorra (en árabe: qala’at al-hurriya) es una fortaleza de origen islámico concebida como entrada y protección del Puente Romano de Córdoba (España).", R.drawable.calahorra));
        sitios.add(new Sitio("Alcázar de los Reyes Cristianos", "El Alcázar de los Reyes Cristianos, es un edificio de carácter militar ordenado construir por el rey Alfonso XI de Castilla en el año 1328, sobre construcciones anteriores (el Alcázar andalusí, antes residencia del Gobernador Romano y la Aduana, ubicada en uno de los márgenes del río Guadalquivir), en Córdoba, España", R.drawable.alcazar));
        sitios.add(new Sitio("Medina Azahara", "Medina Azahara, castellanización del nombre en árabe: مدينة الزهراء Madīnat al-Zahrā' (‘la ciudad brillante’),1 es una ciudad palatina o áulica que mandó edificar Abderramán III (Abd al-Rahman III, al-Nasir) a unos 8 km en las afueras de Córdoba en dirección oeste, más concretamente, en Sierra Morena.", R.drawable.medina));


        lstOpciones = (ListView)findViewById(R.id.LstOpciones);

        //Adaptador
        AdaptadorSitios adaptador = new AdaptadorSitios(this, sitios);

        lstOpciones.setAdapter(adaptador);
    }
}