package Assignments;

public class Engine extends Car{
private String company;
private int numberOfCylinders;
public Engine() {
	super();
}
public Engine(String company, int numberOfCylinders) {
	super();
	this.company = company;
	this.numberOfCylinders = numberOfCylinders;
}
@Override
public String toString() {
	return "Engine [company=" + company + ", numberOfCylinders=" + numberOfCylinders + "]";
}

}
