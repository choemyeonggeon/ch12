package com.greedy.section02.set;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {

	public static void main(String[] args) {
		
		/* TreeSet Ŭ����
		 * �����͸� ���� Ʈ�� ���·� ��Ҹ� �����Ѵ�.
		 * ���� �˻� Ʈ���� �����͸� �߰��ϰų� �����ϴ� ���� �⺻ ���� �ð��� ���� �� ������
		 * Ž�� ����� �̿��Ͽ� �ڵ� ������������ �����͸� �����ϰ� �ȴ�.
		 * ���� �����͸� Ž���� �� ���� �ӵ��� ���δ�.
		 * Set �������̽��� ������ Ư¡�� �״�� �������� ���ĵ� ���¸� �����Ѵٴ� ���� �ٸ� ���̴�.
		 * */
		Set<String> tset = new TreeSet<>();
		tset.add("java");
		tset.add("oracle");
		tset.add("jdbc");
		tset.add("html");
		tset.add("css");
		
		System.out.println(tset);
		
		/* �ζ� ��ȣ �߻� */
		Set<Integer> lotto = new TreeSet<>();
		while(lotto.size() < 6) {
			lotto.add(((int) (Math.random() * 45)) + 1);
		}
		
		System.out.println("lotto : " + lotto);
	}

}
