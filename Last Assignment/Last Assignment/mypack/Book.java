package mypack;
class Book{
	String bookname;
	String auther;
	Book(String b,String c)
	{
		this.bookname=b;
		this.auther=c;
		}
	
		public void show(){
		System.out.println(bookname+ "  "+ auther);
		}
	}