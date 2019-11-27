package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
	    int	n=sc.nextInt();
	Map<Integer,Employee>map=new HashMap<Integer,Employee>();
	Employee[]emp=new Employee[n];
	for(i=0;i<n;i++)
	{
	String name = sc.next();
		int age=sc.nextInt();
		emp[i]=new Employee();
		emp[i].setName(name);
		emp[i].setAge(age);
		map.put(i,emp[i]);
		
	}
		
	for(Map.Entry<Integer,Employee>en:map.entrySet())
	{
		int key=en.getKey();
		Employee e=en.getValue();
		System.out.println(key+e.getName()+e.getAge());
	}
  sc.close();

	

	}
	
	}

