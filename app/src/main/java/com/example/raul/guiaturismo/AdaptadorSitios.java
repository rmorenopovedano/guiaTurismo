package com.example.raul.guiaturismo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Raul on 04/03/2016.
 */
public class AdaptadorSitios extends BaseAdapter{

    private Activity activity;
    private ArrayList<Sitio> sitios;

    public AdaptadorSitios(Activity activity, ArrayList<Sitio> sitios) {
        this.sitios = sitios;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return sitios.size();
    }

    @Override
    public Object getItem(int position) {
        return sitios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = inflater.inflate(R.layout.listitem_titular, null);

        final Sitio sitio = sitios.get(position);

        TextView lblTitulo = (TextView)view.findViewById(R.id.LblTitulo);
        lblTitulo.setText(sitio.getTitulo());

        ImageView image = (ImageView)view.findViewById(R.id.image);
        image.setImageResource(sitio.getIdDrawable());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, Main2Activity.class);
                intent.putExtra("sitio", sitio);
                activity.startActivity(intent);
            }
        });

        return view;
    }
}
