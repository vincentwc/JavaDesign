package factory.SimpleFactory.four;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {

    public static String getChartType() {
        try {
            //创建文档对象
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            //获取当前类路径
            String path = XMLUtil.class.getResource("").getPath();
            Document doc = builder.parse(new File(path +"config.xml"));

            //获取文本节点
            NodeList nl = doc.getElementsByTagName("chartType");
            Node node = nl.item(0).getFirstChild();
            String chartType = node.getNodeValue().trim();
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
