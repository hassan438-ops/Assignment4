package com.example.assign4;

public class Caller {
    String CName;
    String CTime;
    int CImage;
    int CIcon;
    public Caller(String CName, String CTime, int CImage, int CIcon) {
        this.CName = CName;
        this.CTime = CTime;
        this.CImage = CImage;
        this.CIcon = CIcon;
    }
    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCTime() {
        return CTime;
    }

    public void setCTime(String CTime) {
        this.CTime = CTime;
    }

    public int getCImage() {
        return CImage;
    }

    public void setCImage(int CImage) {
        this.CImage = CImage;
    }

    public int getCIcon() {
        return CIcon;
    }

    public void setCIcon(int CIcon) {
        this.CIcon = CIcon;
    }


}
