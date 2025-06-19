package ecommerce;
import java.util.*;
class Product{
	static int pid=1;
	int id;
	String name;
	String Catogory;
	
	public Product(String name, String Catogory){
		this.id=pid++;
		this.name=name;
		this.Catogory=Catogory;
	}
	public String toString() {
		return id+" - "+name+" - "+Catogory;
	}
}
public class ecom {
	static Scanner in = new Scanner(System.in);
	static List<Product>ProductList=new ArrayList<>();
	
	
	public static void main(String[] args) {
		ProductList.add(new Product("Laptop","Electronics"));
		ProductList.add(new Product("shirt","Fashion"));
		ProductList.add(new Product("chair","Furnituare"));
		int x;
		do {
			System.out.println("Choose the Options");
			System.out.println("1.Add a Product");
			System.out.println("2.Linear Search");
			System.out.println("3.Binary Search");
			System.out.println("4.View Products");
			System.out.println("5.Exit");
			x=in.nextInt();
			in.nextLine();
			switch(x) {
			case 1: Addproduct(); break;
			case 2: linearsearch(); break;
			case 3: binarysearch(); break;
			case 4: viewproducts(); break;
			case 5: System.out.println("BYE !!!"); break;
			default: System.out.println("Select one the Options only!!!"); break;
			}
		}while(x!=5);
	}
	
	
	public static void  Addproduct() {
		System.out.println("Enter Product Name:");
		String pname=in.next();
		System.out.println("Enter Catogory :");
		String pcat=in.next();
		ProductList.add(new Product(pname,pcat));
	}
	
	public static void linearsearch() {
		System.out.println("Enter product name: ");
		String pname=in.next();
		for(Product p:ProductList) {
			if(p.name.equalsIgnoreCase(pname)) {
				System.out.println("Product Found ::"+p.name+" - "+p.Catogory);
				return;
			}
		}
		System.out.println("Product not Found");
	}
	public static void binarysearch() {
		System.out.println("enter product name: ");
		String pname=in.next();
		Product t=null;
		ProductList.sort(Comparator.comparing(p->p.name));
		int l=0,h=ProductList.size()-1;
		while(l<=h) {
			int m=(l+h)/2;
			int c=ProductList.get(m).name.compareToIgnoreCase(pname);
			if(c==0) {
				t=ProductList.get(m);
				System.out.println("Product Found ::"+t.name+" -"+t.Catogory);
				return;
			}
				
			else if(c<0) l=m+1;
			else h=m-1;
		}
		System.out.println("Product not Found");
	}
	public static void viewproducts() {
		for(Product p :ProductList) {
			System.out.println(p.toString());
		}
	}
}
