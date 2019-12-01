import Menu.*;
import Table.*;
import Employee.*;
import Check.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 *
 * @author garre
 */
public class Driver {
    
    static Menu menu = new Menu();
    static ArrayList<Employee> employees = new ArrayList<Employee>();
    
    
    public static void main(String args[]) {
        buildMenu();
        buildTables();
        buildEmployees();
        new MainGUI().setVisible(true);
    }
    
    private static void buildTables() {
        
    }
    
    private static void buildEmployees() {
        System.out.println("-----Building employees-----");
        employees.add(new Chef("Rob", 37, "Head Chef", 0055, 17.50));
        employees.add(new Chef("Dominic", 29, "Assistant Chef", 0056, 14.50));
        employees.add(new Waiter("April", 40, "Waiter", 0057, 9.50));
        employees.add(new Waiter("Nicole", 20, "Waiter", 0061, 9.50));
        employees.add(new Manager("Victor", 50, "Manager", 0062, 25.00));
        
        for (Employee i : employees) {
            System.out.println(i.getName());
        }
    }
    
    private static void buildMenu() {
        System.out.println("-----Building menu items-----");
        String filePath = "menu_items.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("MenuItem");
            for (int i = 0; i < nodeList.getLength(); i++) {
                menu.addToMenu(getMenuItem(nodeList.item(i)));
            }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }
        
        menu.getAllMenuItems();
    }
    
    private static MenuItem getMenuItem(Node node) {
        MenuItem menitem = new MenuItem();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            int itemID = Integer.parseInt(getTagValue("id", element));
            String name = getTagValue("name", element);
            double price = Double.parseDouble(getTagValue("price", element));
            int calories = Integer.parseInt(getTagValue("calories", element));
            
            if (getTagValue("type", element).equals("Food")) {
                boolean appetizer = Boolean.parseBoolean(getTagValue("appetizer", element));
                boolean spicy = Boolean.parseBoolean(getTagValue("spicy", element));
                FoodItem fooItem = new FoodItem(itemID, name, price, calories, appetizer, spicy);
                
                return fooItem;
            }
            else if (getTagValue("type", element).equals("Drink")) {
                boolean straw = Boolean.parseBoolean(getTagValue("straw", element));
                String size = getTagValue("size", element);
                DrinkItem drinItem = new DrinkItem(itemID, name, price, calories, straw, size);
                
                return drinItem;
            }
        }
        return menitem;
    }   
    
    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
    
}
