import java.io.*;
import java.util.*;
import java.lang.*;


public class seg_tree {

	public static class ss{ int s; int end;int index;ss(int s,int end,int index){this.s=s;this.end=end; this.index=index;} }

	public static int[] build(int[] v,int size)
	{
		int arr[]= new int[2*size];
		for(int i=0;i<size;i++)
		{
			arr[size+i]=v[i];
		}

		for(int i=size-1;i>=1;i--)
		{
			arr[i]=arr[2*i]+arr[2*i+1];
		}
		return(arr);
	}

	public static void range_query(int[] v,int size,int start,int end)
	{
		Stack<ss> stack= new Stack<ss>();
		stack.push(new ss(0,0,1));
		int sum=0;

		int s=0;
		int e=size-1;
		int mid=0;

		if(start<=s && end>=e){
			int val = (stack.pop()).index;
			sum=sum+v[val];
		}
		else if(start>e || end<s)
		{
			sum=-1;
		}

		else{
			int val = (stack.pop()).index;
			mid=(s+e)/2;
			stack.push(new ss(s,mid,2*val));
			stack.push(new ss(mid+1,e,(2*val)+1));
		}

		while(!stack.empty())
		{
			ss temp=(stack.pop());
			int val=(temp).index;s=temp.s;e=temp.end;

			if(start<=s && end>=e)
			{
				sum=sum+v[val];
			}
			else if (start>e || end<s) {
				sum=sum+0;				
			}
			else
			{
				mid=(s+e)/2;
				stack.push(new ss(s,mid,2*val));
				stack.push(new ss(mid+1,e,(2*val)+1));			
			}

		}

		System.out.println(sum);
	}


	public static int[] update(int[] v,int size,int index,int val)
	{
		int curr=v[size+index];
		int diff=val-curr;
		v[size+index]=val;
		int move=(size+index)/2;
		while(move>0)
		{
			v[move]=v[move]+diff;
			move=move/2; 
		}

		return(v);
	}


	public static void prints(int[] arr,int size){
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc =new Scanner(System.in);
		// seg_tree st=new seg_tree();
		int[] v={2,3,5,6,7,9,10,11};
		int size=8;

		int[] tree=build(v,8);
		prints(tree,size*2);


		// tree=update(tree,size,2,2);
		// tree=update(tree,size,7,10);
		// prints(tree,size*2);
		range_query(tree,size,0,4);


		
	}
	
}