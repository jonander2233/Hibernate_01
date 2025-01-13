package es.ada.u3.hibernate;

import es.ada.u3.hibernate.dao.EmployeeDAO;
import es.ada.u3.hibernate.dao.utils.HibernateSessionFactory;
import es.ada.u3.hibernate.entities.Employee;

import java.util.Iterator;
import java.util.List;

public class Main {
    private static EmployeeDAO EM_DAO = EmployeeDAO.getInstance();

    public static void main(String[] args) {
//        addEmployee("Fernando","Vargas", 3000);
        printEmployees(EM_DAO.loadEmployees());
    }
    private static void addEmployee(String fname, String iname, int salary){
        Employee emp = EM_DAO.addEmployee(new Employee(fname, iname, salary));
    }


    private static void baseExample(){
        // Add few employee records in database
        Employee emp1 = EM_DAO.addEmployee(new Employee("Alfred", "Vincent", 4000));
        Employee emp2 = EM_DAO.addEmployee(new Employee("Jhon", "Gordon", 3000));
        // List down all the employees
        printEmployees(EM_DAO.loadEmployees());
        // Update employee's records
        EM_DAO.updateEmployeeSalary(emp1.getId(), 5000);
        // Delete an employee from the database
        EM_DAO.deleteEmployee(emp2.getId());
        // List down new list of the employees
        printEmployees(EM_DAO.loadEmployees());
        HibernateSessionFactory.shutdown();
    }



    private static void printEmployees(List<Employee> employees) {
        if (employees.isEmpty()){
            System.out.println("******** No items found");
        }else{
            for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
                Employee employee = (Employee) iterator.next();
                System.out.print("First Name: " + employee.getFirstName() + " | ");
                System.out.print("Last Name: " + employee.getLastName() + " | ");
                System.out.println("Salary: " + employee.getSalary());
            }
        }
    }
}



