package Employee;
/**
 *
 * @author garre
 */
public class Employee {
    
    String name;
    int age;
    String title;
    int id;
    double wage;
    static int nextID = 1;
    
    public Employee() {
        
    }
    
    public Employee (String name, int age, String title, int id, double wage) {
        this.name = name;
        this.age = age;
        this.title = title;
        this.id = id;
        this.wage = wage;
        nextID += 1;
    }

    public String getEmployeeName() {
        return name;
    }

    public int getEmployeeAge() {
        return age;
    }

    public String getEmployeeTitle() {
        return title;
    }

    public int getEmployeeID() {
        return id;
    }

    public double getEmployeeWage() {
        return wage;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }
    
    public void setEmployeeAge(int age) {
        this.age = age;
    }

    public void setEmployeeTitle(String title) {
        this.title = title;
    }

    public void setEmployeeWage(double wage) {
        this.wage = wage;
    }
    
    public static int getNextID() {
        return nextID;
    }
}
