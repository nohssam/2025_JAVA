package com.library.service;

import java.util.Iterator;
import java.util.List;

import com.library.model.BookData;
import com.library.model.Loan;
import com.library.repository.BookRepository;
import com.library.repository.LoanRepository;

public class LibraryService {
	
	public static void showBorrowedBooks() {
		// 일 처리 = 요구사항 처리 = 비즈니스 로직
		// 대출된 도서 목록 보기 (DB) 
		List<Loan> loans = LoanRepository.getBorroweBooks();
		if(loans.isEmpty()) {
			System.out.println("대출 중인 도서 가 없습니다.");
		}else {
			System.out.println("대출된 도서 목록");
			Iterator<Loan> it = loans.iterator();
			while (it.hasNext()) {
				Loan loan = (Loan) it.next();
				System.out.println(loan.toString());
//				System.out.print(loan.getLoan_id());
//				System.out.print(loan.getBookdata_id());
//				System.out.print(loan.getMember_id());
//				System.out.print(loan.getStatus());
//				System.out.println(loan.getLoan_date());
			}
		}
	}
	
	public static void showBooks() {
		List<BookData> bookdatas = BookRepository.showBooks();
		if(bookdatas.isEmpty()) {
			System.out.println("도서 가 없습니다.");
		}else {
			System.out.println("도서 목록");
			Iterator<BookData> it = bookdatas.iterator();
			while (it.hasNext()) {
				BookData bookdata = (BookData) it.next();
				System.out.println(bookdata.toString());
			}
		}
	}
	
	public static void borrowBook(int bookdata_id, int member_id) {
		// 대출 할 수 있는지, book  상태
		// 0 이면 대출 불가, 1이면 대출 가능
		// 0 , 1, 404 
	    int res = BookRepository.borrowBook(bookdata_id) ;
	    if(res == 0 || res == 404) {
	    	System.out.println("대출 불가 또는 대출 중");
	    }else {
	    	int result =
	    		LoanRepository.insertBorrowBook(bookdata_id,member_id);
	    	
	    	if(result == 1) {
	    		System.out.println("대출 성공");
	    		// 대출 성공 시 bookdata 테이블도 대출로 수정해야 된다. 
	    		BookRepository.updateBook(bookdata_id);
	    	}else{
	    		System.out.println("대출 실패");
	    	}
	    }
	}
	
	public static void returnBook(int bookdata_id, int member_id) {
		// bookdata_id 가 대출 상태 인지 (available 가 0일때 = 대출상태)
		// 0 => 대출중, 1=> 대출가능 , 404 => 불가 
		int res = BookRepository.borrowBook(bookdata_id) ;
		if(res == 0) {
			int result =
					LoanRepository.updateBorrowBook(bookdata_id,member_id);
			if(result == 1) {
				BookRepository.updateBook(bookdata_id);
				System.out.println("반납 성공");
			}else {
				System.out.println("반납 실패");
			}
		}else {
			System.out.println("반납 불가");
		}
	}
}






