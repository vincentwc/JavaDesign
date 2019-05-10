package factory.AbstractFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {

    public static Object getBean() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            String path = XMLUtil.class.getResource("").getPath();
            Document doc = builder.parse(new File(path + "config.xml"));
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String nodeValue = classNode.getNodeValue();
            //通过类名生成实例对象
            Class<?> clazz = Class.forName(nodeValue);
            Object o = clazz.newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
