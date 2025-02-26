package com.ict.model;

// DB 에 들어갈 정보를 저장하거나 
// DB에서 나온 결과를 저장하는 용도로 사용 
public class BookVO {
    private int bookid, price;
    private String bookname, publisher;

	public BookVO(int bookid, int price, String bookname, String publisher) {
		this.bookid = bookid;
		this.price = price;
		this.bookname = bookname;
		this.publisher = publisher;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return bookid +"\t" + bookname + "\t" + publisher + "\t" + price;
	}
    
    
}
