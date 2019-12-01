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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public double getWage() {
        return wage;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    
}
