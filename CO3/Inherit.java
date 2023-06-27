/*
CO3 4. Write a program has class Publisher, Book, Literature and Fiction. Read the information
and print the details of books from either the category, using inheritance. 
*/

import java.util.Scanner;
class Publisher{
	String name;
	String author;
	Publisher(String name ,String aut){
		this.name=name;
		this.author =author
	}
	String getPublisher(){
		return (this.name);
	}
}
class Book{
	String title;
	Publisher pub;
	Book(String title,Publisher pub){
			this.title=title;
			this.pub=pub;
	}
	void disp(){
		System.out.println("Book Title : "+title);
		System.out.println("Publiisher : "+pub.getPublisher());
	}
}
class Literature extends Book{
	String author;
	Literature(String title,Publisher pub,String auth){
		super(title,pub);
		this.author=auth;
	}
	@Override
	void disp(){
		super.disp();
		System.out.println("Author : "+this.author);
	}
	
}

class Fiction extends Book{
	String genre;
	Fiction(String title,Publisher pub,String genre){
		super(title,pub);
		this.genre=genre;
	}
	@Override
	void disp(){
		super.disp();
		System.out.println("Genre : "+this.genre);
	}
}

class Inherit{
	public static void main(String args[]){
		String pname,title,auth,genre,cat;
		int ch;
		Scanner sc=new Scanner(System.in);
		char choice;
		do{
			System.out.println("\nEnter the book details :");
			System.out.print("\nTitle : ");
			title=sc.nextLine();
			System.out.print("\nPublisher name:");
			pname=sc.nextLine();
			Publisher pub = new Publisher(pname);
			System.out.println("Select category ");
			System.out.println("1.Literature");
			System.out.println("2.Fiction");
			System.out.println("Enter your choice(1/2): ");
			ch=sc.nextInt();
			switch(ch){
				case 1: 
							System.out.print("\nAuthor :");
							auth=sc.next();
							Literature lt=new Literature(title,pub,auth);
							System.out.println("\n...Book Details...");
							lt.disp();
							break;
				case 2:    
							System.out.print("\nAuthor :");
							auth=sc.next();
							Fiction f=new Fiction(title,pub,auth);
							System.out.println("\n...Book Details...");
							f.disp();
							break;
				default:
							System.out.println("Invalid category");
			}
		System.out.println("\nDo you wish to continue?(Y/N):");
			choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');		
	}
}