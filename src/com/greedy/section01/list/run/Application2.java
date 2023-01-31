package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.greedy.section01.list.comparator.AscendingPrice;
import com.greedy.section01.list.dto.BookDTO;

public class Application2 {

	public static void main(String[] args) {
		
		List<BookDTO> bookList = new ArrayList<>();
		
		bookList.add(new BookDTO(1, "ȫ�浿��", "���", 50000));
		bookList.add(new BookDTO(2, "��νɼ�", "�����", 30000));
		bookList.add(new BookDTO(3, "���Ǻ���", "����", 40000));
		bookList.add(new BookDTO(4, "�ﱹ���", "��ν�", 46000));
		bookList.add(new BookDTO(5, "�ﱹ����", "�Ͽ�", 58000));
		
//		for(int i = 0; i < bookList.size(); i++) {
//			System.out.println(bookList.get(i));
//		}
		
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
//		bookList.forEach(System.out::println);
		
		bookList.sort(new AscendingPrice());
		
		System.out.println("���� �� �������� ���� =================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* �͸�Ŭ������ {}�� ���� ��ġ Comparator �������̽��� ��ӹ��� Ŭ������ �ۼ��ϴ°Ͱ� ���� ���ȴ�. */
		bookList.sort(new Comparator<BookDTO>() {
			
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				
				return o1.getPrice() >= o2.getPrice()? -1: 1;
			}
		});
		
		/* ���ٽ� Ȱ�� */
//		bookList.sort((BookDTO b1, BookDTO b2) -> b1.getPrice() >= b2.getPrice()? -1: 1);
		
		System.out.println("���� �� �������� ���� ===================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* ���� �� �������� ���� */
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				
				/* compareTo() : ���� ���� �� ���� ��� ���� ��ȯ,
				 * ������ 0 ��ȯ, ���� ���� ū ��� ��� ��ȯ
				 * */
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		});
		
		System.out.println("���� �� �������� ���� =================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* ���� �� �������� ���� */
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				
				return o1.getTitle().compareTo(o2.getTitle()) * -1;
			}
		});
		
		System.out.println("���� �� �������� ���� ==================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
	}

}








