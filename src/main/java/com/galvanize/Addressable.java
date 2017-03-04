package com.galvanize;

import java.util.List;

/**
 * Created by jalbersh on 3/4/17.
 */
public interface Addressable {
    public List<Address> getAddresses();
    public void addAddress(Address address);
}
