package com.arisglobal.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="author")
public class Author {
    @Id
    private int id;
	@Column(name="author_name")
	private String author_name;
	@Column(name = "date")
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String author_name, Date date) {
		super();
		this.id = id;
		this.author_name = author_name;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", author_name=" + author_name + ", date=" + date + "]";
	}
	
}
