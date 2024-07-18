package Assignments;

public class MainAssignment2 {
public static void main(String[] args) {
	Items []it=new Items[3];
	
	it[0]=new Items("mustang",20);
	it[1]=new Items("lotus",50);
	it[2]=new Items("mercedes",120);
	
	Orders o=new Orders(134,190,"NamanBhat",it);
	System.out.println("my Order Class Object");
	System.out.println(o);
	
	System.out.println("my Item Class Object");
	for(Items i:it)
	System.out.println(i);
	
}
}
