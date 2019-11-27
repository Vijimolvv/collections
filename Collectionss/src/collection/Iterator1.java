package collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>(); 
		  
        list.add("A"); 
        list.add("B"); 
        list.add("C"); 
        list.add("D"); 
        list.add("E"); 
  
        // Iterator to traverse the list 
       
        System.out.println("List elements : "); 
  
        Iterator itr1 = list.iterator();
		while(itr1.hasNext()) {
			String np = (String) itr1.next();
	}

}
