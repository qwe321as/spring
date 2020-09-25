package com.spring.ex;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class BookDTO {
	
	@NotEmpty(message="���� �Է� ����")
	private String title;
	
	@Length(min = 5,message = "5���� �̻� �Է�")
	//@Min(value = 5 , message="") 
	@NotEmpty(message="���� �Է� ����")
	private String author;
	
	@Pattern(regexp ="^[0-9]+$",message="���ڸ� �Է� ����") 
	private String price;
	
	@NotEmpty(message="���ǻ� �Է� ����")
	private String publisher;

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
}



