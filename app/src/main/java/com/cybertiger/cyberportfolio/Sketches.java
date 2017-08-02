package com.cybertiger.cyberportfolio;

/**
 * Created by Tadhg Deeney on 03/05/2017.
 */

public class Sketches {
    private String name;
    private String description;
    private int imageResourceID;

    //sketches is an Array of com.cybertiger.cyberportfolio.Sketches
    public static final Sketches[] sktch = {
            new Sketches("Chameleon", "Something I saw Brona draw once",
                    R.drawable.chameleon),
            new Sketches("Ratchet & Clank", "A Tribute to Insomniac Games",
                    R.drawable.ratchet),
            new Sketches("Big Friendly Golem", "A Peaceful Giant in Uncharted Territory",
                    R.drawable.golem)
    };

    private Sketches(String name, String description, int imageResourceID){
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }
    public String getDesc(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageResourceID;
    }
    public String toString(){
        return this.name;
    }
}
