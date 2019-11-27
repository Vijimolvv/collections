package collection;

import java.util.Scanner;
public class Matrixdiagonal {

	public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    System.out.println("enter a number");
	  int n=s.nextInt(); int i,j=0;
	  int arr[][]=new int[n][n];
	  
	 
	  for(i=0;i<n;i++)
	  {for(j=0;j<n;j++);
	   {
		   arr[i][j]=s.nextInt();
	   }
	  }
	for(i=0;i<n;i++)
	  {for(j=0;j<n;j++);
	   {  
		   if(i==j)
		   {
			   arr[i][j]=arr[i][n+1];
		   }
		   else
		   {
			   arr[i][j]=arr[n][n-2];
		   }
		   
			System.out.println(arr[i][j]);   
	   }}
  }
}
		
		
	