package com.galvanize;

import java.util.ArrayList;

/**
 * Created by jalbersh on 3/4/17.
 */
public class Business implements Addressable {
    private final ArrayList<Address> addresses;
    private final String name;

    public Business(String name) {
        this.name = name;
        addresses = new ArrayList<Address> ();
    }

    public String getName() {
        return name;
    }

    @java.lang.Override
    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    @java.lang.Override
    public void addAddress(Address address) {
        addresses.add(address);
    }
}
