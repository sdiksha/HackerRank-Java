//import java.io.*;
//import java.util.*;
//
//public class Day15 {
//
//	public static  Node insert(Node head,int data) {
//        //Complete this method
//		//System.out.println("in insert");
//		if(head != null)
//		{
//			//System.out.println("in if");
//			Node n = head;
//			while(head.next != null)
//			{
//				//System.out.println("in while");
//				head = head.next;
//			}
//			Node newNode = new Node(data);
//			head.next = newNode;
//			
//			return n;
//		}
//		else
//		{
//			//System.out.println("in else");
//			Node n = new Node(data);
//			return n;
//		}
//    }
//
//	public static void display(Node head) {
//        Node start = head;
//        while(start != null) {
//            System.out.print(start.data + " ");
//            start = start.next;
//        }
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        Node head = null;
//        int N = sc.nextInt();
//
//        while(N-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head,ele);
//        }
//        display(head);
//        sc.close();
//    }
//}
