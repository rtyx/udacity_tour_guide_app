package es.rtyx.AndaluciaTourApp;

/**
 * Created by Rafael on 11/08/2018.
 */

public class Location {

    private String name;
    private String description;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String name, String description, int imageResourceId) {
        name = name;
        description = description;
        imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
