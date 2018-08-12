package es.rtyx.AndaluciaTourApp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rafael on 11/08/2018.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> location) {
        super(context, 0, location);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name_text_view);
        nameTextView.setText(currentLocation.getName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.location_description_text_view);
        descriptionTextView.setText(currentLocation.getDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.location_image);
        imageView.setImageResource(currentLocation.getImageResourceId());

        return listItemView;
    }
}
