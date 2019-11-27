package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("MENU");
		ArrayList list = new ArrayList();
		int flag=0;
		do {
			
		
		
		
	     System.out.println("1.Book\n2.Check Status\n3.Exit");
	     System.out.println("Enter your choice");
		int n = s.nextInt();
		if(n==1) {
			System.out.println("Booking");
			
			System.out.println("Please choose the services required");
			
			System.out.println("Ac/non Ac");
			String ac = s.next();
			if(ac.equals("AC"))
			{
				System.out.println("Charge is 200");
				int charge=200;
			}
			else
			{
				System.out.println("Charge is 100");int charge=100;
			}
				
				
			
			System.out.println("cot(Single/double)");
			String cot= s.next();
			if(cot.equals("S"))
			{
				System.out.println("Charge is 150");
				int charge1=150;
			}
			else
			{
				System.out.println("Charge is 250");int charge1=250;
			}
			
			
			
			
			System.out.println("With cable connection/without cable connection");
			String cable= s.next();
			if(cot.equals("yes"))
			{
				System.out.println("Charge is 150");
				int charge2=150;
			}
			else
			{
				System.out.println("Charge is 100");int charge2=100;
			}
			
			System.out.println("Wifi");
			
			String wifi= s.next();
			if(wifi.equals("ye3"))
			{
				System.out.println("Charge is 150");
				int charge3=150;
			}
			else
			{
				System.out.println("Charge is 250");int charge1=250;
			}
			
			System.out.println("Laundry/need");
			
			String lau= s.next();
			if(lau.equals("yes"))
			{
				System.out.println("Charge is 150");
				int charge4=150;
			}
			else
			{
				System.out.println("Charge is 250");int charge4=100;
			}
			
			
		
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
			
		}
			
			
			 if(n==2) {
					System.out.println("Check Status");
					String name = s.next();
					Iterator itr1 = list.iterator();
					while(itr1.hasNext()) {
						String np = (String) itr1.next();
						if(np.equals(name))
						{
							flag=1;
							break;
						}
					}
					if(flag==1)
					{
						System.out.println("Application Installed");
					}
					else
					{
						list.add(name);
					}
			 }
					if(n==3)
					{
						if(list.isEmpty()) {
							System.out.println("Exit");
						     
						}
						else {
						Iterator itr2 = list.iterator();
						for(int i=0;i<list.size();i++)
						{
							System.out.println(i+" "+itr2.next());

						
						}
						System.out.println("Enter the index to delete");
						int index = s.nextInt();
						list.remove(index);
						System.out.println("Application Uninstalled");
					}
					}			
					
						if(n==4) {
							System.out.println("Successfully deleted");
							return;
						}
						else if(n<0 || n>4) {
							System.out.println("Invalid output");
							
						}
				}
				
			 while(true);
						
					}
				}
				
				
					
					
					
					
					
				
				

					



			
			
			
			
			
			

		
