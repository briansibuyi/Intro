package com.example.brian.intro;

import java.io.Serializable;

/**
 * Created by Brian on 2017/08/15.
 */

public class Contact implements   Serializable {

    String Name;
    String Surname;
    String Email;
    String Number;
   int myImage, myLng, myLat;


    public Contact() {
    }


    //access Modifiers
    //Getters
    public int getMyImage() {return myImage; }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getEmail() {
        return Email;
    }

    public String getNumber() {
        return Number;
    }

    //Setters

    public void setMyImage(int myImage) { this.myImage = myImage;  }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public int getMyLng() {
        return myLng;
    }

    public void setMyLng(int myLng) {
        this.myLng = myLng;
    }

    public int getMyLat() {
        return myLat;
    }

    public void setMyLat(int myLat) {
        this.myLat = myLat;
    }
}
