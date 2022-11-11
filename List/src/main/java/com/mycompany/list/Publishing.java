package com.mycompany.list;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jane
 */
public class Publishing {
    String name;
    String city;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        if(name.isEmpty()) throw new IllegalArgumentException("Название издательства не должно быть пустой строкой");
        this.name = name;
    }

    public void setCity(String city) {
        if(city.isEmpty()) throw new IllegalArgumentException("Город издания не долен быть пустой строкой");
        this.city = city;
    }

    public Publishing(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
