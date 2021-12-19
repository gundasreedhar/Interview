

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.*;

public class XML_PARSER {
	public static void main(String[] args) {
		getXMLNodes("/home/srinivasmb/Desktop/test_xml/getRequisition201807091720.xml", "updatedOn");
	}

	public static void getXMLNodes(String xmlFileName, String tagName) {
		try {
			File xmlFile = new File(xmlFileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			NodeList list = doc.getElementsByTagName("*");
			System.out.println("XML Elements: ");
			for (int i = 0; i < list.getLength(); i++) {
				Element element = (Element) list.item(i);
				System.out.println(element.getNodeName());
			}
			doc.getDocumentElement().normalize();
			// XPath xpath = XPathFactory.newInstance().newXPath();
			// NodeList nodes = (NodeList) xpath.evaluate("//Report_Entry", doc,
			// XPathConstants.NODESET);
			// for (int i = 1; i <= nodes.getLength(); i++) {
			// Node node = nodes.item(i - 1);
			// NodeList childNodes = node.getChildNodes();
			// String candidateDisplayId = "";
			// for (int j = 0; j < childNodes.getLength(); j++) {
			// Node childNode = childNodes.item(j);
			// // WDdisplayId//WDReqId
			// if ("updatedOn".equalsIgnoreCase(childNode.getNodeName())) {
			// candidateDisplayId = childNode.getTextContent();
			// System.out.println(candidateDisplayId);
			// break;
			// }
			// }
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
