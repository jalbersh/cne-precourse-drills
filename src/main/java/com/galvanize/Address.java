package com.galvanize;

/**
 * Created by jalbersh on 3/4/17.
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address (String street,
                    String city,
                    String state,
                    String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // builders are betters than setters
    public Address(AddressBuilder builder) {
        this.street = builder.getStreet();
        this.city = builder.getCity();
        this.state = builder.getState();
        this.zip = builder.getZip();
    }

    // getters
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

    // setters, as instructed
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Address address = (Address) object;

        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (state != null ? !state.equals(address.state) : address.state != null) return false;
        return zip != null ? zip.equals(address.zip) : address.zip == null;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        return result;
    }

    // toString, as instructed
    @java.lang.Override
    public java.lang.String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }

}
