package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		
		/* �÷��� �����ӿ�ũ(Collection Framework)
		 * ���� ���� �پ��� �����͵��� ���� ȿ�������� ó���� �� �ֵ��� ǥ��ȭ�� ����� �����ϴ� Ŭ�������� �����̴�.
		 * ��, �����͸� ȿ�������� �����ϴ� �ڷᱸ����, �����͸� ó���ϴ� �˰����� �̸� �����س��� Ŭ������ ���Ѵ�.
		 * 
		 * 1. List �������̽�
		 *  - ������ �ִ� �������� �������� �������� �ߺ� ������ ����Ѵ�.
		 *  - Vector, ArrayList, LinkedList, Stack, Queue ���� �ִ�.
		 * 2. Set �������̽�
		 *  - ������ ���� �������� �������� ������ �ߺ��� ������� �ʴ´�.
		 *  - HashSet, TreeSet ���� �ִ�.
		 * 3. Map �������̽�
		 *  - Ű�� �� �� ������ �̷������ ������ �����̴�.
		 *  - key�� set ������� �����ϱ� ������ �������� ������ �������� �ʰ� �ߺ��� key�� ������� �ʴ´�.
		 *    ��, value�� �ߺ��� ���� ������ �� �ִ�.
		 *  - HashMap, TreeMap, HashTable, Properties ���� �ִ�.
		 * 
		 * List�� Set�� ���� �κ��� Collection �������̽����� �����ϰ� �ִ�.
		 * */
		
		/* ArrayList
		 * JDK 1.2���� �����Ǵ� ���� ���� ���Ǵ� �÷��� Ŭ�����̴�.
		 * ���������� �迭�� �̿��Ͽ� ��Ҹ� �����ϸ� �ε����� �̿��� �迭�� ��ҿ� �����Ѵ�.
		 * ArrayList�� ��ü �迭�� ������ �����ϱ� ���� ���������.
		 * �迭�� ũ�⸦ ������ �� ����, ����� �߰�, ����, ���� ���� �����ϴٴ� ������ ������ �ִ�.
		 * ArrayList�� ũ�� ����, ����� �߰�, ����, ���� ����� �̸� �����س��� �������ְ� �ִ�.
		 * (�ڵ����� ����Ǵ� ������ �ӵ��� �������� ���� �ƴϴ�)
		 * */
		
		/* ArrayList�� �ν��Ͻ��� �����ϰ� �Ǹ� ���������� 10ĭ¥�� �迭�� �����ؼ� �����Ѵ�. */
		ArrayList alist = new ArrayList();
		
		/* �������� �����Ͽ� ���� Ÿ������ ArrayList ��ü�� �����.
		 * List �������̽� ������ �پ��� ����ü��� Ÿ�Ժ����� �����ϱ� ������
		 * ���۷��� Ÿ���� List�� �صδ� ���� �� �����ϰ� �ڵ带 �ۼ��ϴ� ���̴�.
		 * */
		List list = new ArrayList();
//		list = new LinkedList(list);
		
//		Collection clist = new ArrayList();
		
		list.add("apple");
		list.add(123);
		list.add(45.67);
		list.add(new java.util.Date());
		
		System.out.println(list.get(0));
		
		System.out.println("list : " + list);
		
		System.out.println("list�� size() : " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		list.add("apple");
		System.out.println("list : " + list);
		
		list.add(1, "banana");
		System.out.println("list : " + list);
		
		list.remove(2);
		System.out.println("list : " + list);
		
		list.set(1, true);
		System.out.println("list : " + list);
		
		/* ��� �÷��� �����ӿ�ũ Ŭ�������� ���׸� Ŭ������ �ۼ��Ǿ� �ִ�. */
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
//		stringList.add(123);
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("mango");
		stringList.add("grape");
		
		System.out.println("stringList : " + stringList);
		
		/* Collection �������̽��� �ΰ����� ��ɵ��� static �޼ҵ� ���·� �����ϴ� ��ƿ�� Ŭ����
		 * 1.8 ���Ͽ����� �������̽����� �Ϲ� �޼ҵ带 ���� �� ������ ������, 
		 * �������̽����� �ʿ��ϴ� ����� ��Ʈ�� �ۼ��س��� Ŭ������ ��Ī ���ʻ� s�� �ٴ´�.
		 * */
		Collections.sort(stringList);
		
		System.out.println("stringList sort : " + stringList);
		
		stringList = new LinkedList<>(stringList);
		
		/* Iterator��?
		 * Collection �������̽��� iterator() �޼ҵ带 �̿��ؼ� �ν��Ͻ��� �����Ѵ�.
		 * �÷��ǿ��� ���� �о���� ����� ���ϵ� ������� �����ϱ� ���� ����Ѵ�.
		 * �ݺ��� ��� �Ҹ����, �ݺ����� �̿��ؼ� ����� �ϳ��� ������ ������� ����ϱ� �����̴�.
		 * �ε����� �����Ǵ� �÷����� �ƴ� ��� �ݺ����� ����� �� �ִ� ����� �������� �ʱ� ������
		 * ��ҿ� �ϳ��� �����ϱ� ���� ���ϵ� ����� �����ϴ� ���̴�.
		 * 
		 * hasNext() : ���� ��Ҹ� ������ �ִ� ��� true, �� �̻� ��Ұ� ���� ��� false�� ��ȯ
		 * next() : ���� ��Ҹ� ��ȯ
		 * */
		Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
//		while(dIter.hasNext()) {
//			System.out.println(dIter.next());
//		}
//		while(dIter.hasNext()) {
//			System.out.println(dIter.next());
//		}
		
		List<String> descList = new ArrayList<>();
		while(dIter.hasNext()) {
			descList.add(dIter.next());
		}
		
		System.out.println("descList : " + descList);
	}

}
