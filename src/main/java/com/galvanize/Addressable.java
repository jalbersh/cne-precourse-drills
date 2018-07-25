package com.galvanize;

import java.util.List;

/**
 * Created by jalbersh on 7/25/18.
 */
public interface Addressable {
    public List<Address> getAddresses();
    public void addAddress(Address address);
}
