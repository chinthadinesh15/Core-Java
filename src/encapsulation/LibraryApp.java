package encapsulation;


public class LibraryApp {
	public static void main(String[]args)
	{
		Library l=new Library();
		l.setName("Pentagonspace_library");
		l.setaddress("14th cross vijaynagar");
		System.out.println(l.getName());
		System.out.println(l.getaddress());
		Book b1=new Book();
		
		b1.settitle("HeadFirstjava");
		b1.setauthor("kathy sierra");
		b1.setisbn("11java");
		l.displaybookDetails(b1);
		
	}

}