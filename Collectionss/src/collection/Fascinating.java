package collection;

import java.util.Scanner;

public class Fascinating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				System.out.println("enter a number");
				int n=s.nextInt();
				int a=n*2;
				int b=n*3;
				int i=0;
				
				String str1 = Integer.toString(n); 
				String str2 = Integer.toString(a); 
				String str3 = Integer.toString(b); 
				String str4=str1.concat(str2);
				String str5=str4.concat(str3);
				int l=str5.length();
				char ch[]=str5.toCharArray();
				for(i=0;i<l;i++)
				{
					if(ch[i]=>91 && ch[i]<=100)//'1'&&ch[i]=='2'&&ch[i]=='3'&&ch[i]=='4'&&ch[i]=='5'&&ch[i]=='6'&&ch[i]=='7'&&ch[i]=='8'&&ch[i]=='9')				
					{
						System.out.println("fascinating");
				}
				else
				{
					System.out.println("not fascinating");
				}
				

	}

}}
