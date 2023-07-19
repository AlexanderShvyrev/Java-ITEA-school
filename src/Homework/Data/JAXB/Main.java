package Homework.Data.JAXB;

import Practice.JAXB.Catalog;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(new City("New York", "big"), "USA", "Wall st");

        try{
            File f = new File("/Users/alexandershvyrev/Desktop/ITEA/Lesson 1/Java Lesson 1/src/Homework/Data/JAXB/output.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Address.class);

            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(address, f);
            marshaller.marshal(address, System.out);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            address = (Address) unmarshaller.unmarshal(f);
            System.out.println(address);
        }catch(JAXBException e){
            e.printStackTrace();
        }
    }
}
