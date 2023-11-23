package com.orion.packagemanager.model;

import java.util.List;

import static java.util.Collections.*;

public class PackageBox {

    private final long id;
    private final List<Box> boxes = emptyList();
    private final Address address;
    private final String name;

    public PackageBox(long id, Address address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PackageBox{" +
                "id=" + id +
                ", boxes=" + boxes +
                ", address=" + address +
                ", name='" + name + '\'' +
                '}';
    }
}
