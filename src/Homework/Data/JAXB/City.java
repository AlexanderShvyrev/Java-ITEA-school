package Homework.Data.JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class City {
    private String name;
    private String size;

    public City() {
    }

    public City(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    @XmlValue
    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return name;
    }
}