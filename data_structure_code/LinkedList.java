import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}

	}

	public void insert(Node n, int index){
		if(head==null)
			{
				head=n;
			}

		else{
				if(index==0)
				{
					Node tmp=head;
					n.next=tmp;
					head=n;
				}
				else
				{
					Node tmp=head;
					while(index-->1)
					{
						tmp=tmp.next;
					}
					n.next=tmp.next;
					tmp.next=n;
				}
			}
	}

	public void delete(int index)
	{
		Node tmp=head;
		if(head!=null){
			if(index==0)
			{
				tmp=head.next;
				head.next=null;
				head=tmp;
			}
			else
			{
				while(index-->1)
				{
					tmp=tmp.next;
				}
				tmp.next=tmp.next.next;
			}
		}
	}

	public void duplicate()
	{
		Node cur=head;
		Node tmp=cur;
		while(cur!=null && tmp!=null)
		{
			if(tmp.data!=cur.data)
			{
				cur.next=tmp;
				cur=tmp;
			}
			tmp=tmp.next;
		}
		cur.next=tmp;
	}
	
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc=new Scanner(System.in);
		LinkedList ll = new LinkedList();

		int t= sc.nextInt();
		while(t-->0)
		{
			
			int c=sc.nextInt();
			if(c==0){
				int a=sc.nextInt();
				int b=sc.nextInt();
				Node nn=new Node(a);
				ll.insert(nn,b);
			}
			if(c==1){
				int a=sc.nextInt();
				ll.delete(a);
			}
			if(c==2){
				Node tmp=ll.head;
				while(tmp!=null)
				{
					System.out.print(tmp.data+" -- > ");
					tmp=tmp.next;
				}
				System.out.println();

				// tmp=ll.head;
				// Node tmp1=ll.head;
				// while(tmp1!=null && tmp1.next!=null)
				// {
				// 	System.out.print(tmp.data+" -- > ");
				// 	tmp1=tmp1.next.next;
				// 	tmp=tmp.next;
				// }

				// System.out.println("mid : "+tmp.data);
			}
			if(c==3)
			{
				ll.duplicate();
			}

		}


	}
}