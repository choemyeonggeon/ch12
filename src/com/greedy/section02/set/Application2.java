package com.greedy.section02.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

	public static void main(String[] args) {
		
		/* LinkedHashSet Ŭ����
		 * HashSet�� ������ �ִ� ����� ��� ������ �ְ�
		 * �߰������� ���� ������ �����ϴ� Ư¡�� ������ �ִ�.
		 * JDK 1.4���� �����Ѵ�.
		 * */
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		lhset.add("java");
		lhset.add("oracle");
		lhset.add("jdbc");
		lhset.add("html");
		lhset.add("css");
		
		System.out.println("lhset : " + lhset);
		
		TreeSet<String> tset = new TreeSet<>(lhset);
		System.out.println("tset : " + tset);

	}

}
