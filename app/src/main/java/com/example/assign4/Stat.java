package com.example.assign4;

public class Stat {
    String SName;
    String STime;
    int SImage;

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSTime() {
        return STime;
    }

    public void setSTime(String STime) {
        this.STime = STime;
    }

    public int getSImage() {
        return SImage;
    }

    public void setSImage(int SImage) {
        this.SImage = SImage;
    }

    public Stat(String SName, String STime, int SImage) {
        this.SName = SName;
        this.STime = STime;
        this.SImage = SImage;
    }
}
