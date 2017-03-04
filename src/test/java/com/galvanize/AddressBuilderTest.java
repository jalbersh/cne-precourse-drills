package com.galvanize;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddressBuilderTest {

    @Test
    public void test04_addressClass_useBuilder() {
        AddressBuilder addressBuilder = new AddressBuilder();
        addressBuilder = setFields(addressBuilder);
        Address address = addressBuilder.build();
        assertEquals(address.getStreet(), "Street1");
        assertEquals(address.getCity(), "City1");
        assertEquals(address.getState(), "State1");
        assertEquals(address.getZip(), "Zip1");
    }

    private AddressBuilder setFields(AddressBuilder addressBuilder) {
        addressBuilder
                .street("Street1")
                .city("City1")
                .state("State1")
                .zip("Zip1");
        return addressBuilder;
    }

}
