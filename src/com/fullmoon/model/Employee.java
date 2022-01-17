/**
 * 
 */
package com.fullmoon.model;

/**
 * @author sali When a member do not have access modifier its defaulted to so
 *         called fiends level read Access Modifiers
 */
public class Employee {
	// members vs instance members types ?
	// Field or Attribute find difference
	/**
	 * This is a id filed to maintain uniqueness of employees in the system
	 */
	private int id;

	private String name;

	private double salary;

	private String email;
	
	private String department;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name.isEmpty())
			this.name = "Error";
		else
			this.name = name;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() +"\n" +"    Attributes :\n"
		+ "\tid: " + this.id +" \n"
		+ "\tname: " + this.name +" \n"
		+ "\tsalary: " +this.salary +" \n"
		+ "\temail: " +this.email +" \n"
		+ "\tdepartment: " +this.department +" \n";
		
		
	}


}
