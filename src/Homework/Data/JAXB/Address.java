package Homework.Data.JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="address")
public class Address {
    private City city;
    private String country;
    private String street;

    public Address() {
    }

    public Address(City city, String country, String street) {
        this.city = city;
        this.country = country;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address: " + country + ", " + city + ", " + street;
    }

    public City getCity() {
        return city;
    }

    @XmlElement
    public Address setCity(City city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    @XmlElement
    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getStreet() {
        return street;
    }

    @XmlElement
    public Address setStreet(String street) {
        this.street = street;
        return this;
    }
}
