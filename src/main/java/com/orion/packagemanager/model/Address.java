package com.orion.packagemanager.model;

public class Address {

    private final String City;
    private final String StreetName;
    private final Integer ParcelNumber;
    private final String postcode;

    public Address(String city, String streetName, Integer parcelNumber, String postcode) {
        City = city;
        StreetName = streetName;
        ParcelNumber = parcelNumber;
        this.postcode = postcode;
    }

    public String getCity() {
        return City;
    }

    public String getStreetName() {
        return StreetName;
    }

    public Integer getParcelNumber() {
        return ParcelNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                ", StreetName='" + StreetName + '\'' +
                ", ParcelNumber=" + ParcelNumber +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
