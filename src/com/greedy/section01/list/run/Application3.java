package com.greedy.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {

	public static void main(String[] args) {
		
		/* LinkedList
		 * ArrayList�� �迭�� �̿��ϱ� ������ �߻��� �� �ִ� �������� ������ �����ϰ��� ��ȵǾ���.
		 * ���δ� ���� ���Ḯ��Ʈ�� �����Ǿ� �ִ�.
		 * */
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("orange");
		linkedList.add("mango");
		linkedList.add("grape");
		
		System.out.println(linkedList.size());
		
		int linkedListSize = linkedList.size();
		for(int i = 0; i < linkedListSize; i++) {
			System.out.println(i + " : " + linkedList.get(i));
		}
		
		linkedList.remove(1);
		
		for(String s : linkedList) {
			System.out.println(s);
		}
		
		linkedList.set(0, "fineapple");
		
		System.out.println("linkedList : " + linkedList);
		
		System.out.println(linkedList.isEmpty());
		
		linkedList.clear();
		
		System.out.println(linkedList.isEmpty());
	}

}
