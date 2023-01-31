package com.greedy.section02.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {
		
		/* Set �������̽��� ������ Set �÷��� Ŭ������ Ư¡
		 * 1. ����� ���� ������ �������� �ʴ´�.
		 * 2. ���� ����� �ߺ� ������ ������� �ʴ´�. (null���� �ߺ����� �ʰ� �ϳ��� null�� �����Ѵ�)
		 * */
		
		/* HashSet Ŭ���� 
		 * Set �÷��� Ŭ�������� ���� ���� ���Ǵ� Ŭ���� �� �ϳ��̴�.
		 * JDK 1.2���� �����ǰ� ������ �ؽ� �˰����� ����Ͽ� �����ٴ� ������ ������.
		 * */
		
//		HashSet<String> hset = new HashSet<>();
		Set<String> hset = new HashSet<>();
//		Collection<String> cset = new HashSet<>();
		
		hset.add("java");
		hset.add("oracle");
		hset.add("jdbc");
		hset.add("html");
		hset.add("css");
		
		/* ���� ���� ���� �ȵ� */
		System.out.println("hset : " + hset);
		
		hset.add("java");
		
		/* �ߺ� ��� ���� */
		System.out.println("hset : " + hset);
		System.out.println("����� ��� �� : " + hset.size());
		System.out.println("���� Ȯ�� : " + hset.contains(new String("oracle")));
		
		/* Set�� ������ ��Ҹ� ����ó���� �� �ִ� ����� ����
		 * �ε����� ������� �ʱ� ����
		 * */
		/* 1. toArray() �迭�� �ٲ㼭 ��� */
		Object[] arr = hset.toArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		/* 2. iterator()�� ��� ���� ó�� */
		Iterator<String> iter = hset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		hset.clear();
		System.out.println("empty? : " + hset.isEmpty());
	}

}










