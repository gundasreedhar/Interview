package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListImplementation {
	Node head;
	static int size = 0;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public static LinkedListImplementation add(LinkedListImplementation list,int data)
	{
		Node node = new Node(data);
		
		if(list.head == null)
		{
			list.head = node;
			size++;
		}
		else {
			Node dupHead = list.head;
			while(dupHead.next != null)
			{
				dupHead = dupHead.next;
				
			}
			
			dupHead.next = node;
			size++;
		}
		
		return list;
		
	}
	
	public static void showAll(LinkedListImplementation list)
	{
		if(list.head!=null)
		{
			Node head = list.head;
			
			while(head.next != null)
			{
				System.out.println(head.data);
				head = head.next;
			}
			
			System.out.println(head.data);
		}
		
		
	}
	
	public static LinkedListImplementation insert(LinkedListImplementation list,int position, int data)
	{
		if(position<=size && position > 0)
		{
			Node node = new Node(data);
			if(position != 1)
			{
				Node dupeHead = list.head;
				
				// your goal must be to make dupeHead to point to before the position
				// in each iteration dupeHead will point to the next node for i = 0 dupeHead will point to Second element in LL
				for(int i = 0 ; i<position-2 ; i++)
				{
					dupeHead = dupeHead.next;
				}
				
				node.next = dupeHead.next;
				dupeHead.next = node;
				
				size++;
			}
			else if(position == 1)
			{
				node.next = list.head;
				list.head = node;
				size++;
			}
			
		}
		
		return list;
	}
	
	public static LinkedListImplementation delete(LinkedListImplementation list,int position) {
		
		if(position<=size && position >0)
		{
			if(position != 1)
			{
				Node dupHead = list.head;
				
				for(int i = 0 ; i<position-2 ; i++)
				{	// in each iteration dupeHead will point to the next node
					dupHead = dupHead.next;
				}
				
				dupHead.next = dupHead.next.next;
				size--;
			}
			
			else if(position == 1)
			{
				list.head = list.head.next;
				size--;
			}
			
		}
		
		return list;
	}
	
	public int size()
	{
		return size;
	}
	
	public List<Integer> toList(LinkedListImplementation list)
	{
		List<Integer> arrayList = new ArrayList<>();
		
		if(list.head != null)
		{
			Node dupeHead = list.head;
			while(dupeHead.next != null)
			{
				arrayList.add(dupeHead.data);
				dupeHead = dupeHead.next;
			}
			
			arrayList.add(dupeHead.data);
		}
		
		return arrayList;
	}
	public static void main(String[] args) {

		LinkedListImplementation list = new LinkedListImplementation();
		list = list.add(list,1);
		list = list.add(list,2);
		list = list.add(list,3);
		list = list.add(list,4);
		list = list.add(list,5);
		list = list.add(list,6);
		list.showAll(list);
		System.out.println("size of  the LikedList object is : " + list.size());
		System.out.println("------insert--------");
		list = list.insert(list,2,99);
		list.showAll(list);
		System.out.println("size of  the LikedList object is : " + list.size());
		
		System.out.println("------delete--------");
		list.delete(list,2);
		list.showAll(list);
		
		System.out.println("size of  the LikedList object is : " + list.size());
		System.out.println("--------------");
		System.out.println("ArrayList object:");
		List<Integer> Arraylist = list.toList(list);
		System.out.println(Arraylist);
		
	}

}
