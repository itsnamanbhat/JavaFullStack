package Assignment;

public class Main2 {
public static void main(String[] args) {
	Employees []e=new Employees[3];
	e[0]=new Employees("Harsha",117,56000);
	e[1]=new Employees("Naman",118,55900);
	e[2]=new Employees("Karthik",119,56800);
	
	Employees max=new Employees();
	double maxSalary=0;
	for(int i=0;i<e.length;i++)
	{
		if(e[i].netSalary>maxSalary)
		{
			maxSalary=e[i].netSalary;
			max=e[i];
		}
	}
	
	System.out.println("The Employees are");
	for(Employees em:e)
	{
		System.out.println(em);
	}
	System.out.println("The Employee with max Net Salary is\n"+max);
	
}
}