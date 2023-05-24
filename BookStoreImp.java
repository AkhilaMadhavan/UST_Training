class Book{
	int isbkNo;
	String bookName;
	String author;
	String genre;
	float price;
	
	public Book(int bkno,String bkName,String author1,String gnr,int price1)
		{
			isbkNo=bkno;
			bookName=bkName;
			author=author1;
			genre=gnr;
			price=price1;
		}

	public void displayBooks(){
		System.out.println("Book No   : "+isbkNo);
		System.out.println("Book Name : "+bookName);
		System.out.println("Author    : "+author);
		System.out.println("Genre     : "+genre);
		System.out.println("Price     : "+price);
	
}

}
public class BookStoreImp{
	public static void main(String[]args){
	Book b1=new Book(1,"Ikigai","Hector","Feel-Good",499);
	Book b2=new Book(2,"Dark","Thomas","Fiction",560);
	Book b3=new Book(3,"Simple lives","Merly Mary","Drama",799);

	b1.displayBooks();
	b2.displayBooks();
	b3.displayBooks();
	
//Finding the cheapest book using if else condition

	if(b1.price<b2.price && b1.price<b3.price){
	System.out.println(b1.bookName +" is the cheapest book. It amouts "+b1.price);
	}

	else if(b2.price<b3.price){
	System.out.println(b2.bookName+" is the cheapest book. It amouts "+b2.price);
	}

	else{
	System.out.println(b3.bookName+" is the cheapest book. It amouts "+b3.price);
	}

}
}