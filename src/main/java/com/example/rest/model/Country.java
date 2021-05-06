package com.example.rest.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "countries")
public class Country {

    @Id
    private ObjectId id;
    @Indexed(unique = true)
    private String code;
    private String name;
    private String capital;
    private int area;
    private long population;

    public Country() {
        super();
    }

    public Country(String code, String name, String capital, int area, long population) {
        this.code = code;
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public void setCountryCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
