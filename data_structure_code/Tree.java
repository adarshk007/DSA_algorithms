import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.LinkedList; 
import java.util.Queue; 

class Tree{
	Tree_node root;

	static class Tree_node{
		int data;
		Tree_node left,right;
		Tree_node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}

	public void insert(Tree_node val)
	{
		Queue<Tree_node> t=new LinkedList<Tree_node>();
		Tree_node tmp=root;
		if(tmp==null)
		{
			root=val;
		}
		else
		{
			t.add(tmp);
			while(!t.isEmpty())
			{
				Tree_node temp=t.peek();
				t.remove();
				if(temp.left==null){
					temp.left=val;
					break;
				}
				else
				{
					t.add(temp.left);
				}
				if (temp.right==null) {
					temp.right=val;
					break;
				}
				else{
					t.add(temp.right);
				}


			}
		}

	}

	public void prints(Tree_node t)
	{
		if(t==null)
		{
			return;
		}
		else
		{
			prints(t.left);
			System.out.print(t.data+"--");
			prints(t.right);
		}
	} 

	public void left_view()
	{
		Queue<Tree_node> t=new LinkedList<Tree_node>();
		Tree_node tmp = root;
		if(tmp==null)
		{
			System.out.println("Empty");
		}
		else
		{
			t.add(tmp);
			while(!t.isEmpty())
			{
				int area=t.size();
				int i=0;
				while(i++<area)
				{
					Tree_node temp=t.peek();
					t.remove();
					if(i==1)
					{
						System.out.print(temp.data+"---");
					}
					if(temp.left!=null){
						t.add(temp.left);
					}
					if(temp.right!=null){
						t.add(temp.right);
					}
				}




			}
			System.out.println();
		}	
	}


	public static void main(String[] args) throws java.lang.Exception {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		Tree tr=new Tree();

		while(test-->0)
		{
			int ll=sc.nextInt();
			if(ll==0)
			{
				int data=sc.nextInt();
				Tree_node mn=new Tree_node(data);
				tr.insert(mn);
			}
			else if(ll==1)
			{
				tr.prints(tr.root);
			}
			else if(ll==2)
			{
				tr.left_view();
			}
		}

	}
}

/*
10
0 1
0 11
0 15
0 12
0 13
0 66
0 22
0 100
0 90
*/