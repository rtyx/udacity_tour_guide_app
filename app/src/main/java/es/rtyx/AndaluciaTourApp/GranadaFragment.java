package es.rtyx.AndaluciaTourApp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import es.rtyx.granadatourguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GranadaFragment extends Fragment {


    public GranadaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TextView textView = new TextView(getActivity());
        // textView.setText(R.string.hello_blank_fragment);
        // return textView;

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("La Alhambra", "La Alhambra es una ciudad palatina andalusí situada en Granada, en la comunidad autónoma de Andalucía, España. Consiste en un conjunto de palacios, jardines y fortaleza (alcázar o al-qasr القصر) que albergaba una verdadera ciudadela dentro de la propia ciudad de Granada, que servía como alojamiento al monarca y a la corte del Reino nazarí de Granada.", R.drawable.granada_alhambra));
        locations.add(new Location("El Albaicin", "El Albaicín o Albayzín es un barrio del este de la ciudad española de Granada, en la comunidad autónoma de Andalucía. Está situado a una altitud de 700 a 800 m sobre el nivel del mar.", R.drawable.granda_albaicin));
        locations.add(new Location("La Catedral", "La Santa Iglesia Catedral Metropolitana de la Encarnación de Granada es un templo católico de la ciudad española de Granada, sede de la archidiócesis de la ciudad. El templo es una de las obras cumbres del Renacimiento español.", R.drawable.granda_catedral));
        locations.add(new Location("El Cubo", "El edificio, culminado en 2001, se organiza alrededor de un patio central con oficinas distribuidas en siete plantas y está construido con una trama de hormigón armado que en la cubierta sirve de mecanismo para recoger la luz.", R.drawable.granada_cubo));
        locations.add(new Location("La Cartuja", "El monasterio de Nuestra Señora de la Asunción, con nombre oficial, Real Monasterio de La Cartuja, situado en la ciudad española de Granada, comunidad autónoma de Andalucía. Albergó a una comunidad de monjes cartujos desde su fundación en el siglo XVI hasta la exclaustración del año 1835.", R.drawable.granada_cartuja));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }

}
