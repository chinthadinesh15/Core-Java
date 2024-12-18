package collection_FrameWork._ArrayList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Array2 
{
	public static void main(String[] args) 
	{
	  LinkedList ll=new LinkedList();
	  ll.add(10);
	  ll.add(20);
	  ll.add(30);
	  ll.add(40);
	  ll.add(50);
	 
	
	 ListIterator litr= ll.listIterator(ll.size());
	 
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
    
	}

}
