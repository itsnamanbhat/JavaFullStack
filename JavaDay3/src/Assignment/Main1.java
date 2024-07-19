package Assignment;

public class Main1 {
public static void main(String[] args) {
	User u= new Customer();
	u.display();
	 u= new Employee();
	 u.display();
	 u= new Admin();
	 u.display();
	 u.setName("naman");
	 System.out.println(u);
}
}