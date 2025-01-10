package es.ada.u3.hibernate.entities;

//package ada.u3p1.exemples.entities;
public class Employee {
private Integer id;
private String firstName;
private String lastName;
private Integer salary;
public Employee() {}
public Employee(String fname, String lname, Integer salary) {
 this.firstName = fname;
 this.lastName = lname;
 this.salary = salary;
}
public Integer getId() {
 return id;
}
public void setId( Integer id ) {
 this.id = id;
}
public String getFirstName() {
 return firstName;
}
public void setFirstName( String first_name ) {
 this.firstName = first_name;
}
public String getLastName() {
 return lastName;
}
public void setLastName( String last_name ) {
 this.lastName = last_name;
}
public Integer getSalary() {
 return salary;
}
public void setSalary( Integer salary ) {
 this.salary = salary;
}
}
