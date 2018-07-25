package com.galvanize;

/**
 * Created by jalbersh on 7/25/18.
 */
public class AddressBuilder {
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
        return new Address(street, city, state, zip);
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
