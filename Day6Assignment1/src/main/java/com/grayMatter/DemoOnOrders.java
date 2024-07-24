package com.grayMatter;


import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnOrders {

	public static void main(String[] args) {
		LinkedList <Item> item= new LinkedList<Item>();
		Item i1= new Item("GPU",2,140000,"Nvidia");
		Item i2= new Item("Monitors",1,40000,"Asus");
		Item i3= new Item("Webcam",3,3200,"Nextgen");
		Item i4= new Item("CPU Case",3,3000,"Asus");
		item.add(i1);
		item.add(i2);
		item.add(i4);
		
		LinkedList <Item> item1= new LinkedList<Item>();
		item1.add(i2);
		item1.add(i4);
		item1.add(i3);
		
		LinkedList <Item> item3= new LinkedList<Item>();
		item3.add(i1);
		item3.add(i2);
		item3.add(i3);
		
		LinkedList <Item> item4= new LinkedList<Item>();
		item4.add(i1);
		item4.add(i4);
		item4.add(i3);
		
		
		Order o1=new Order(121,new Date(),item1);
		Order o2=new Order(122,new Date(),item);
		Order o3=new Order(123,new Date(),item3);
		Order o4=new Order(124,new Date(),item4);
		
		LinkedList<Order> ol=new LinkedList<Order>();
		ol.add(o1);
		ol.add(o2);
		ol.add(o3);
		ol.add(o4);
		
		int maxOrder=0;
		Order max=new Order();
	   System.out.print("Order 1 Total Cost: ");
	   System.out.println(o1.TotalOrderCost());
	   
	   System.out.print("Order 2 Total Cost: ");
	   System.out.println(o2.TotalOrderCost());
	   System.out.print("Order 3 Total Cost: ");
	   System.out.println(o3.TotalOrderCost());
	   
	   System.out.print("Order 4 Total Cost: ");
	   System.out.println(o4.TotalOrderCost());
	   Iterator<Order> it=ol.iterator();
	   while(it.hasNext())
	   {
		   Order o=it.next();
		   if(o.TotalOrderCost() > maxOrder)
		   {
			   maxOrder=o.TotalOrderCost();
			   max=o;
		   }
	   }
	   
		
		System.out.println("The Max is:"+maxOrder+"\n"+max);
		
		
	}
		
	}


