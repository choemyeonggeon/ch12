package com.greedy.section03.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {
		
		/* Map �������̽��� Ư¡
		 * 
		 * Collection �������̽��ʹ� �ٸ� ���� ����� ������.
		 * Ű(key)�� ��(value)�� �ϳ��� ������ �����ϴ� ����� ����Ѵ�.
		 * Ű�� �� ������ ��Ʈ��(Entry) ��� �θ���.
		 * 
		 * Ű(key)��?
		 * ��(value)�� ã�� ���� �̸� ������ �ϴ� ��ü�̴�.
		 * 
		 * 1. ��Ҵ� ���� ������ �������� �ʴ´�.
		 * 2. Ű�� �ߺ��� ������� �ʴ´�. Ű�� �ٸ��� ���� �ߺ��Ǵ� ���� ������ �� �ִ�.
		 * */
		
		Map hmap = new HashMap();
		hmap.put("one", new java.util.Date());
		hmap.put(12, 123);
		hmap.put(33, "red apple");
		
		System.out.println(hmap);
		
		/* Ű�� �ߺ� ������� �ʰ� �������� ������ ������ ��� */
		hmap.put(12, "yellow banana");
		
		System.out.println(hmap);
		
		/* ���� �ߺ��ؼ� ������ �� �ִ�. */
		hmap.put(11, "yellow banana");
		hmap.put(9, "yellow banana");
		
		System.out.println(hmap);
		
		System.out.println("Ű 9�� ������ �ִ� �� : " + hmap.get(9));
		
		hmap.remove(9);
		System.out.println(hmap);
		
		System.out.println("hmap�� ����� ��� �� : " + hmap.size());
		
		Map<String, String> hmap2 = new HashMap<>();
		hmap2.put("one", "java");
		hmap2.put("two", "oracle");
		hmap2.put("three", "jdbc");
		hmap2.put("four", "html");
		hmap2.put("five", "css");
		
		/* map ����ó�� */
		/* 1. keySet()�� �̿��ϸ� Ű���� ���� set���� ���� ��ȯ�Ѵ�. 
		 * iterator()�� Ű�� ���� ��� ���� ���� ó��
		 * */
//		Set<String> keys = hmap2.keySet();
//		System.out.println(keys);
//		
//		Iterator<String> keyIter = keys.iterator();
		
		Iterator<String> keyIter = hmap2.keySet().iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			String value = hmap2.get(key);
			
			System.out.println(key + " = " + value);
		}
		
		/* 2. ����� value��ü�鸸 values() �� Collection���� ���� */
		Collection<String> values = hmap2.values();
		
		Iterator<String> valueIter = values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
		Object[] valueArr = values.toArray();
		for(int i = 0; i < valueArr.length; i++) {
			System.out.println(i + " : " + valueArr[i]);
		}
		
		/* 3. Map�� ����Ŭ������ EntrySet �̿� */
		Set<Map.Entry<String, String>> set = hmap2.entrySet();
		
		Iterator<Map.Entry<String, String>> entryIter = set.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, String> entry = entryIter.next();
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}












