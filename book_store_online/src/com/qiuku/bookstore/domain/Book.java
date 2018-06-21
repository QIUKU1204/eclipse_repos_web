package com.qiuku.bookstore.domain;

import java.sql.Date;

/**
 * @TODO: Book实体类 
 * @author:QIUKU
 */
public class Book {
	// 实体类的属性
	private Integer id;
	private String author;
	private String title;
	private float price;
	private Date publishingDate;
	private int salesAmount;
	private int storeNumber;
	private String remark;
	
	
	// 属性的getter、setter方法
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getPublishingDate() {
		return publishingDate;
	}
	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}
	public int getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}
	public int getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * 有参构造器
	 */
	public Book(Integer id, float price, int storeNumber) {
		super();
		this.id = id;
		this.price = price;
		this.storeNumber = storeNumber;
	}
	
	public Book(){
		super();
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title
				+ ", price=" + price + ", publishingDate=" + publishingDate
				+ ", salesAmount=" + salesAmount + ", storeNumber="
				+ storeNumber + ", remark=" + remark + "]\n\n";
	}
	
}