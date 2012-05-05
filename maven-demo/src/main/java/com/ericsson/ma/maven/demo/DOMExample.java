/**
 * Created : 02.25, 2012
 *
 * Copyright : (C) 2012 by Honnix
 * Email     : hxliang1982@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.ericsson.ma.maven.demo;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author honnix
 */
public class DOMExample {
    public static void main(String[] args) {
        // create a factory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = null;
        try {
            // create a builder
            DocumentBuilder builder = factory.newDocumentBuilder();
            try {
                // load external xml file, convert to document
                document = builder.parse(new File("demo.xml"));
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {
        }

        Transformer transformer = null;
        try {
            // create a transformer
            transformer = TransformerFactory.newInstance().newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        StreamResult result = new StreamResult(new StringWriter());
        DOMSource source = new DOMSource(document);
        try {
            // transform and store into stream result
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        // finally get the string out
        String xmlString = result.getWriter().toString();
        System.out.println(xmlString);

        // get the root element
        Element root = document.getDocumentElement();
        // retrieve attribute on root element
        root.getAttribute("root1");

        // get the "a" element
        NodeList nodeList = root.getElementsByTagName("a");
        Element a = (Element) nodeList.item(0);
        // add a new attribute
        a.setAttribute("a1", "a1");

        // so what is the first child
        Node node = a.getFirstChild();
        System.out.println(node.getNodeName()); // output as #text
        
        Node next = a.getFirstChild().getNextSibling();
        System.out.println(next.getNodeName()); // now it is "b"
    }
}
