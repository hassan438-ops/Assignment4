package com.example.assign4;

public class User {

    String Name;
    String LastM;
    String Time;
    int Image;

    public User(String name, String lastM, int image,String time) {
        Name = name;
        LastM = lastM;
        Time = time;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastM() {
        return LastM;
    }

    public void setLastM(String lastM) {
        LastM = lastM;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
    public String getTime() {
        return Time;
    }

    public void setTime(String time) { Time = time; }

}
