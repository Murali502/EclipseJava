package company.com.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.ElementNameQualifier;
import org.custommonkey.xmlunit.XMLUnit;
import org.custommonkey.xmlunit.examples.RecursiveElementNameAndTextQualifier;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import company.com.enums.ENUMQualifier;

public class XMLUtil {

	
	
	public static Document removeNode(String filePath,String nodeName) throws ParserConfigurationException, SAXException, IOException
	{
		DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
		factory.setFeature("", false);
		factory.setFeature("", false);
		factory.setFeature("", false);
		
		DocumentBuilder builder = factory.newDocumentBuilder();
		Node parentNode =null;
		NodeList childNodes;
		Node childNode =null;
		//Build Document 
		Document document = builder.parse(filePath);
		//Noramalize the XML Structure its too important 
		document.getDocumentElement().normalize();
		
		Document resultDoc =document;
		String[] node =nodeName.split(",");
		for(int i=0;i<node.length;i++)
		{
			NodeList nList = resultDoc.getElementsByTagName(node[i]);
			int length =nList.getLength();
			if(length > 0) {
				int temp =0;
				while (temp < length) {
					
					parentNode =nList.item(temp);
					childNodes = parentNode.getChildNodes();
					while(childNodes.getLength() > 0)
					{
						childNode = childNodes.item(0);
						childNode.getParentNode().removeChild(childNode);
					}
					resultDoc.normalize();
					temp++;
				}
			}
		}
		
		return null;
		
	}


	public static final void writeDocToXMLFile(Document xml,String exportFileName) throws TransformerFactoryConfigurationError, TransformerException, IOException {
		
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		Writer out = new StringWriter();
		tf.transform(new DOMSource(xml), new StreamResult(out));
		FileWriter fw = new FileWriter(new File(exportFileName));
		fw.write(out.toString());
		fw.close();
	}
	
	public static List<String> compareXMLVersionAndDoctype(String soureFilePath,String targetFilePath) throws FileNotFoundException
	{
		
		List<String> xmlVerAndDoctypeMismatch= new ArrayList<String>();
		String soucrDocTypeTag = "";
		String targetDocTypeTag ="";
		String sourceXmlTypeTag = "";
		String targetXmlTypeTag = "";
		String xmlVersionRegExp = "<\\?xml.*>";
		String DocTypeRegExp = "<!DOCTYPE.*>";
		
		FileReader sourceReader = new FileReader(new File(soureFilePath));
		FileReader targetReader = new FileReader(new File(targetFilePath));
		String str ="";
		try 
		{
			BufferedReader sourceBr = new BufferedReader(sourceReader);
			
			while((str = sourceBr.readLine()) !=null) {
				if(str.trim().matches(xmlVersionRegExp)) {
					sourceXmlTypeTag = str;
					break;
				}
			}
			sourceBr.close();
			sourceReader.close();
			sourceReader = new FileReader(new File(soureFilePath));
			sourceBr = new BufferedReader(sourceReader);
			
			while((str = sourceBr.readLine()) !=null) {
				if(str.trim().matches(DocTypeRegExp)) {
					targetXmlTypeTag = str;
					break;
				}
			
			}
			
			
		}catch(Exception e) {
			
		}
		
		
		
		return null;
		
	}
	
	public static List compareXML(String sourceFilePath,String targetFilePath,ENUMQualifier elementnamequalifier) throws SAXException, IOException {
		
		// reading two xml file to compare in Java program
		FileInputStream testFile = new FileInputStream(sourceFilePath);
		FileInputStream prodFile = new FileInputStream(sourceFilePath);
		
		// Using BufferedReader for improved performance
		BufferedReader source = new BufferedReader(new InputStreamReader(testFile));
		BufferedReader target = new BufferedReader(new InputStreamReader(prodFile));
		
		XMLUnit.setNormalizeWhitespace(true);
		XMLUnit.setIgnoreWhitespace(true);
		XMLUnit.setIgnoreAttributeOrder(true);
		XMLUnit.setIgnoreComments(true);
		
		Diff xmlDiff = new Diff(source,target);
		//for getting detailed differences between two xml fiels 
		
		DetailedDiff detailXmlDiff = new DetailedDiff(xmlDiff);
		
		if(elementnamequalifier == ENUMQualifier.ElementNameQualifier)
			detailXmlDiff.overrideElementQualifier(new ElementNameQualifier());
		else if(elementnamequalifier == ENUMQualifier.RecursiveElementNameAndTextQualifier)
			detailXmlDiff.overrideElementQualifier(new RecursiveElementNameAndTextQualifier());
		
		return detailXmlDiff.getAllDifferences();
	}
	
}
