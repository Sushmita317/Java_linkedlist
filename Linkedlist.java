
package Linkedlist;

import java.util.Scanner;

public class Linkedlist {
		Node head;
		 static class Node{
			int data;
			Node nextNodeAddress;
			Node(int d)
			{
				data = d;
				nextNodeAddress = null;
			}
		}
		void printList() {
			Node temp=head;
			while(temp!=null){
			
				System.out.print(temp.data+"->");
				temp=temp.nextNodeAddress;
			}
			System.out.println();
		}
		
		void add(int data) {
			Node temp=null;
			Node newNode = new Node(data);
			if(head==null){
			head=newNode;
           }
			else{
			 temp=head;
			while(temp.nextNodeAddress!=null) {
					temp=temp.nextNodeAddress;
					
				}
			temp.nextNodeAddress = newNode;
			}
			
		}
			
		
		//}
		public void deleteFirst() {
			Node temp = head;
			if(temp != null) {
				head = temp.nextNodeAddress;
			}
		}
		 public int count() {
			 Node temp = head;
			 int count = 0;
			 while(temp!=null) {
				 count++;
				 temp = temp.nextNodeAddress;
			 }
			 System.out.println("Total No of Nodes ::"+count);
			 return count;
		 }

		 public void reverse() {
			 Node temp = head;
			 int i = 0;
			 int array[] = new int[count()];
			 while(temp!=null) {
				 array[i] = temp.data;
				 temp = temp.nextNodeAddress;
				 i++;
			 }
			 for(int j=count()-1;j>-1;j--) {
				 System.out.print("<-"+array[j]);
			 }
		 }


		public static void main(String[] args) 
		{
		
			Linkedlist list = new Linkedlist();
			Scanner scanner = new Scanner(System.in);
//			System.out.println("Enter first data");
//			int number1 = scanner.nextInt();
//			System.out.println("Enter second data");
//			int number2 = scanner.nextInt();
			
			System.out.println("Enter number data");
			int numberOfData = scanner.nextInt();
			
			for(int i=0; i<numberOfData; i++) {
				System.out.println("Enter data");
				int data = scanner.nextInt();
				list.add(data);
			}
			
//			Linkedlist.Node node1 = new Linkedlist.Node(1);
//			Linkedlist.Node node2 = new Linkedlist.Node(2);
//			Linkedlist.Node node3 = new Linkedlist.Node(3);
		//	list.add(number1);
		//	list.add(number2);		
			list.printList();
			//list.head=new Node(1);
		//Node second = new Node(2);
		//list.head.nextNodeAddress = second;
		//Node third = new Node(3);
		//second.nextNodeAddress = third;
		//Node fourth = new Node(4);
		//third.nextNodeAddress = fourth;
//			 int i = 1;
//		       do {
//		    	   System.out.println("Enter the data");
//		    	   int x = scanner.nextInt();
//		    	   list.add(x);
//		    	   System.out.println("Do want to add more data press 1");
//		    	   i = scanner.nextInt();
//		       }while(i == 1);
//        
		list.reverse();
}
}
