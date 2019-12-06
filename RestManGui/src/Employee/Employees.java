/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author schne
 */
public class Employees {
    
    ArrayList<Employee> employees = new ArrayList<Employee>();

    public Employees() {
    }
    
    public void addEmployee(Employee newItem) {
        employees.add(newItem);
    }
    
    public void removeEmployee(Employee itemToDelete) {
        employees.remove(itemToDelete);
    }
    
    public void updateEmployee(int index, Employee itemToUpdate) {
        employees.set(index, itemToUpdate);
    }
    
    public Employee getEmployee(String targetName) {
        Employee employee = new Employee();
        for (Employee i : employees) {
            if (i.getEmployeeName().equals(targetName)) {
                return i;
            }
        }
        return employee;
    }
    
    public Employee getEmployee(int index) {
        return employees.get(index);
    }
    
    public Employee getRandomEmployee() {
        int randomInt = ThreadLocalRandom.current().nextInt(1, employees.size());
        Employee choice = employees.get(randomInt);
    
        return choice;
    }
    
    public ArrayList<Employee> getAllEmployees() {
        for (Employee i : employees) {
            System.out.println(i.getEmployeeName());
        }
        return employees;
    }
    
}
