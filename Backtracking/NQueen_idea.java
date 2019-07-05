import java.util.*;
import java.io.*;
import java.lang.*;

class NQueen_idea{

	public static class myint
	{
		int row,col;
		myint(int row,int col){
			this.row=row;
			this.col=col;
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		myint arr[]=new myint[n];

		for(int i=0;i<n;i++)
		{
			arr[i]=new myint(0,0);
		}
		int start;
		if(n%2==0){
			start=(n/2)-1;
		}
		else
		{
			start=(n/2);
		}
		int row=0;
		int start2=n-1;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				arr[i].row=row;
				arr[i].col=start;
				start=start-1;
				row=row+1;
			}
			else
			{
				arr[i].row=row;
				arr[i].col=start2;
				start2=start2-1;
				row=row+1;
			}
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i].row==i && arr[i].col==j)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}

	}
}