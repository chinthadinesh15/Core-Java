package encapsulation;



public class Book 
	 {
	 private String title;
	 private String author;
	 private String isbn;
	 public void settitle(String title)
	 {
		this.title=title;
	 }
	 public String gettitle()
	
	 {
		 return this.title;
	 }
	 public void setauthor(String author)
	 {
		 this.author=author;
	 }
	 public String getauthor()
	 {
		 return this.author;
	 }
	 public void setisbn(String isbn)
	 {
		 this.isbn=isbn;
	 }
	 public String getisbn()
	 {
		 return this.isbn;
	 }
	  
}