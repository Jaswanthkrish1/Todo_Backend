package com.Api_test.API.Unusedstuff;
public class course {
   private int id;
   private String name;
   private int salary;
 
public course(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getSalary() {
	return salary;
}
@Override
public String toString() {
	return "course [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
   
}
