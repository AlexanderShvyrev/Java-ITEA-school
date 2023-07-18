package Homework.Data.SAXParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element rootElement = document.createElement("root");
            document.appendChild(rootElement);

            Element cityElement = document.createElement("city");
            cityElement.setAttribute("size", "big");
            cityElement.appendChild(document.createTextNode("Kiev"));
            rootElement.appendChild(cityElement);

            Element streetElement = document.createElement("street");
            streetElement.appendChild(document.createTextNode("Main Street"));
            rootElement.appendChild(streetElement);

            Element houseElement = document.createElement("house");
            houseElement.appendChild(document.createTextNode("123"));
            rootElement.appendChild(houseElement);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            File outputFile = new File("/Users/alexandershvyrev/Desktop/ITEA/Lesson 1/Java Lesson 1/src/Homework/Data/SAXParser/output.xml");
            StreamResult result = new StreamResult(new FileOutputStream(outputFile));
            DOMSource source = new DOMSource(document);
            transformer.transform(source, result);

            System.out.println("XML file generated successfully.");
        } catch (ParserConfigurationException | TransformerException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
