import java.lang.*;
import java.util.*;
import java.io.*;

class BST{
	Tree root;
	static class Tree{int data;Tree left,right; Tree(int data){this.data=data;this.left=null;this.right=null;}}

	public void insert(Tree val)
	{

		if(root==null)
		{
			root=val;
		}
		else
		{
			Tree prev=null;
			Tree tmp=root;
			while(tmp!=null)
			{
				prev=tmp;
				if(tmp.data>val.data){tmp=tmp.left;}
				else if (tmp.data<val.data){tmp=tmp.right;}
			}
			if(prev.data>val.data){
				prev.left=val;
			}
			else if(prev.data<val.data){
				prev.right=val;
			}
		}

	}

	public void prints(Tree val)
	{
		if(val==null){return;}
		else
		{
			prints(val.left);
			System.out.print(val.data+"--");
			prints(val.right);
		}
	}

	public void lca(Tree roots,int d1,int d2)
	{
		while(roots !=null)
		{
			if(roots.data>d1 && roots.data>d2){roots=roots.left;}
			else if (roots.data<d1 && roots.data<d2) {roots=roots.right;}
			else{break;}

		}
		System.out.println(roots.data);

	}

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc=new Scanner(System.in);
		BST b=new BST();
		int t=sc.nextInt();
		while(t-->0)
		{
			int ll = sc.nextInt();
			if(ll==0){int q=sc.nextInt();Tree m=new Tree(q);b.insert(m);}
			else if(ll==1){b.prints(b.root);}
			else if(ll==2){b.lca(b.root,sc.nextInt(),sc.nextInt());}

		}
		
	}
}