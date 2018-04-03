package com.example.sidra.gdgkolaachi_1;

/**
 * Created by Sidra on 10/19/2017.
 */

public class ModelClass {
    private int album_image;
    private String album_name;
    private String song_number;
    //private int setting;

    public ModelClass(int album_image, String album_name, String song_number) {
        this.album_image = album_image;
        this.album_name = album_name;
        this.song_number = song_number;
        //this.setting = setting;
    }

    public int getAlbum_image() {
        return album_image;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public String getSong_number() {
        return song_number;
    }

    /*public int getSetting() {
        return setting;
    }*/

    public void setAlbum_image(int album_image) {
        this.album_image = album_image;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public void setSong_number(String song_number) {
        this.song_number = song_number;
    }
}
