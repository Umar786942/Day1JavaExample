package com.pack;
class Box{
	double width;
	double height;
	double depth;
	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	
}



public class Example3 {

	public static void main(String[] args) {
	Box b1=new Box();
	Box b2=new Box();
	b1.width=10;
	b1.height=10;
	b1.depth=10;
	
	b2.width=10;
	b2.height=10;
	b2.depth=20;
	double vol;
	vol=b1.width*b1.height*b1.depth;
	System.out.println("the volume is"+ vol);
	

	}

}