import java.io.*;
abstract class Shape{
	void numberOfsides(){
	
	}
}
class Rectangle extends Shape{
	void numberOfsides(){
		System.out.println("Number of sides is 4");
	}
}
class Triangle extends Shape{
	void numberOfsides(){
		System.out.println("Number of sides is 3");
	}
}
class Hexagon extends Shape{
	void numberOfsides(){
		System.out.println("Number of sides is 6");
	}
}
class lab5{
	public static void main(String[] args){
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Hexagon h=new Hexagon();
		Shape ref;
		ref=r;
		ref.numberOfsides();
		ref=t;
		ref.numberOfsides();
		ref=h;
		ref.numberOfsides();
	}
}
