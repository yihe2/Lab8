package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }


    @Test
    public void hasCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        boolean has = list.hasCity(newCity);
        assertEquals(has,true);
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        list.deleteCity(newCity);
        assertEquals(list.getCount(),listSize);
    }

    @Test
    public void countCityTest(){
        list = MockCityList();
        City newCity = new City("Estevan", "SK");
        City newCity2 = new City("Leduc", "AB");
        City newCity3 = new City("Nisku", "AB");
        list.addCity(newCity);
        list.addCity(newCity2);
        list.addCity(newCity3);
        assertEquals(3,list.countCities());
    }



}

