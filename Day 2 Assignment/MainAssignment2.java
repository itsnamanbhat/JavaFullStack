package Assignments;

public class MainAssignment2 {
public static void main(String[] args) {
	Items []it=new Items[3];
	
	it[0]=new Items("maggie",20);
	it[1]=new Items("cookies",50);
	it[2]=new Items("dates",120);
	
	Orders o=new Orders(134,190,"NamanBhat",it);
	System.out.println("Order Class Object");
	System.out.println(o);
	
	System.out.println("Item Class Object");
	for(Items i:it)
	System.out.println(i);
	
}
}
