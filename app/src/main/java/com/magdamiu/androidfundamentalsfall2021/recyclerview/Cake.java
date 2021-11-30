package com.magdamiu.androidfundamentalsfall2021.recyclerview;

public class Cake {
    private String name;
    private String image;

    public Cake(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
