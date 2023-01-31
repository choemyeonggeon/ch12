package com.greedy.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

	public static void main(String[] args) {
		
		/* Queue
		 * Queue�� ���� �޸� ������ �����͸� �����ϴ�
		 * ���Լ���(FIFO - First Input First Out) ����� �ڷᱸ���̴�.
		 * Queue�� �������̽��̱� ������ ���� �ν��Ͻ��� �������� ���ϰ�
		 * ��κ� Queue�� LinkedList�� �̿��Ѵ�.
		 * */
//		Queue<String> que = new Queue<>();
		
		Queue<String> que = new LinkedList<>();
		
		/* ť�� �����͸� ���� ���� offer()�� �̿��Ѵ�. */
		que.offer("first");
		que.offer("second");
		que.offer("third");
		que.offer("fourth");
		que.offer("fifth");
		
		System.out.println(que);
		
		/* ť���� �����͸� ���� �� 2������ �ִ�.
		 * peek() : �ش� ť�� ���� �տ� �ִ� ���(���� ���� ���)�� ��ȯ�Ѵ�.
		 * poll() : �ش� ť�� ���� �տ� �ִ� ���(���� ���� ���)�� ��ȯ�ϰ� �����Ѵ�.
		 * */
		
		System.out.println("peek() : " + que.peek());
		System.out.println("peek() : " + que.peek());
		
		System.out.println(que);
		
		System.out.println("poll() : " + que.poll());
		System.out.println("poll() : " + que.poll());
		
		System.out.println(que);
	}

}
