package com.greedy.section01.list.comparator;

import java.util.Comparator;

import com.greedy.section01.list.dto.BookDTO;

public class AscendingPrice implements Comparator<BookDTO> {

	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		
		/* sort()���� ���������� ����ϴ� �޼ҵ��̴�.
		 * �������̽��� ��ӹ޾Ƽ� �޼ҵ� �������̵� �ϴ� ���� ����ȭ �س��Ҵ�.
		 * */
		
		/* �� ��� �� �ν��Ͻ��� ������ �������� ������ �Ǳ� ���ؼ���
		 * ���� ������ �� ���� �����̾�� �Ѵ�.
		 * ���� ���� ������ �� ���� ��� �� �ν��Ͻ��� ������ �ٲ�� �Ѵ�.
		 * �� �� �� ���� �ٲٶ�� ��ȣ�� ����� �����ְ� �Ǹ� �� ���� �ٲ��ش�.
		 * */
//		int result = 0;
//		
//		if(o1.getPrice() > o2.getPrice()) {
//			result = 1;
//		} else if(o1.getPrice() < o2.getPrice()) {
//			result = -1;
//		} else {
//			result = 0;
//		}
//		
//		return result;
		
		if(o1.getPrice() > o2.getPrice()) {
			return 1;
		}
		
		return -1;
	}

}
