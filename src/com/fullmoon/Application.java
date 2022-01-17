/**
 * 
 */
package com.fullmoon;

import com.fullmoon.model.Book;
import com.fullmoon.model.Employee;

/**
 * @author sali
 *
 */
public class Application {

	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.setId(1);
		em1.setName("Abu Bakr");
		em1.setSalary(1000);
		em1.setEmail("abubakr@company.org.uk");
		em1.setDepartment("Customer Service");

		System.out.println(em1);

		int i = 3;
		Book book = new Book();
		book.setTitle("Book " + i);
		book.setAuthor("Author " + i);
		book.setNoOfPages(i * 300);
		book.setPublisher("Exam Cram TM 2");
		System.out.println(book);

	}
}
