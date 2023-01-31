package com.greedy.section01.list.run;

import java.util.Stack;

public class Application4 {

	public static void main(String[] args) {
		
		/* Stack
		 * Stack�� ����Ʈ �迭 Ŭ������ Vector Ŭ������ ��ӹ޾� �����Ͽ���.
		 * ���Լ���(LIFO - Last Input First Out)����� �ڷᱸ���� �Ҹ���.
		 * */
		Stack<Integer> integerStack = new Stack<>();
		
		/* Stack�� ���� ���� �� push()�� �̿��Ѵ�. */
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		integerStack.push(5);
		
		System.out.println(integerStack);
		
		/* ���ÿ��� ��Ҹ� ã�� �� search()�� �̿��� �� �ִ�. */
		System.out.println(integerStack.search(5));
		
		/* stack���� ���� ������ �޼ҵ�� ũ�� 2������ �� �� �ִ�. 
		 * peek() : �ش� ������ ���� �������� �ִ�(��ܿ� �ִ�) ��� ��ȯ
		 * pop() : �ش� ������ ���� �������� �ִ�(��ܿ� �ִ�) ��� ��ȯ �� ����
		 * */
		System.out.println("peek() : " + integerStack.peek());
		System.out.println(integerStack);
		System.out.println("peek() : " + integerStack.peek());
		
		System.out.println("pop() : " + integerStack.pop());
		System.out.println(integerStack);
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());		//EmptyStackException �߻�
	}

}
