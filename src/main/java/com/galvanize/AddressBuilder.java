package com.galvanize;

/**
 * Created by jalbersh on 3/4/17.
 */
public class AddressBuilder {
    // Builders are better than setters
    private String street;
    private String city;
    private String state;
    private String zip;

    public AddressBuilder() {}

    public AddressBuilder street(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder city(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder state(String state) {
        this.state = state;
        return this;
    }

    public AddressBuilder zip(String zip) {
        this.zip = zip;
        return this;
    }

    public Address build() {
        return new Address(this);
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
}
