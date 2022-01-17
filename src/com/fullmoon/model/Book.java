/**
 * 
 */
package com.fullmoon.model;

/**
 * @author sali
 *
 */
public class Book {
	
	private String title;
	private String author;
	private int noOfPages;
	private String publisher;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the noOfPages
	 */
	public int getNoOfPages() {
		return noOfPages;
	}

	/**
	 * @param noOfPages the noOfPages to set
	 */
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() +"\n" +"    Attributes :\n"
				+ "\ttitle :"+ this.title +" \n"
				+ "\tauthor :"+ this.author +" \n"
				+ "\tpages :"+ this.noOfPages +" \n"
				+ "\tpublisher :"+ this.publisher; 
	}
}
