package hw;

import java.util.ArrayList;

public class add {
	static ArrayList<book> books=new ArrayList<book>();
	public static int getcount() {
		int total=0 ;
		int i = books.size() ; 
		for (int x =0 ; x<i;x++) { 
		total += books.get(x).price ;
		}
		return total ;
	}
	public static void addBook( int price , String name, int count) { 
		book x = new book() ;
		x.Name=name; 
		x.Count = count ;
		x.price=price ;
		books.add(x) ;
		
		
	}
	public static void main(String[] args) {
		

	}
}
