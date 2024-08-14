package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlParserExample {
    public static void main(String[] args) {
        try {
            // parse file
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = factory.newDocumentBuilder();
            File file = new File("voorbeeld.xml");
            Document doc = db.parse(file);

            // grab whole document
            Element root = doc.getDocumentElement();

            // deal with document content
            System.out.println(root.getNodeName());
            NodeList users = root.getElementsByTagName("user");
             for(int i = 0; i < users.getLength(); i++) {
                if(users.item(i) instanceof Element e) {
                    System.out.println(e.getElementsByTagName("name").item(0).getTextContent());
                }
             }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }

    }
}
