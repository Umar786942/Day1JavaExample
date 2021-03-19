package com.day3;

class Box{
    private double width;
    private double height;
    private double depth;

    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Box(int len){
        width=height=depth=len;
    }
    Box(Box ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    double volume() {
        return width*height*depth;
    }
}

    class BoxWeight extends Box{
        double weight;

        BoxWeight(){
        super();
        weight=-1;
        }
        BoxWeight(double w,double h,double d,double we){
        super(w,h,d);
        weight=we;
        }
        BoxWeight(int len,double we){
        super(len);
        weight=we;
        }
        BoxWeight(BoxWeight ob){
        super(ob);
        weight=ob.weight;
        }
        }

class Shipment extends BoxWeight{
    double cost;
    Shipment(){
        super();
        cost=-1;
    }
    Shipment(double w,double h,double d,double we,double c){
        super(w,h,d,we);
        cost=c;
    }
    Shipment(int len,double we,double c){
        super(len,we);
        cost=c;
    }
    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;
    }
}

    public class Example1 {

        public static void main(String[] args) {
        Shipment s1=new Shipment();
        Shipment s2=new Shipment(1,2,3,4,5);
        Shipment s3=new Shipment(3,6,9);
        Shipment s4=new Shipment(s2);
        double vol;
        vol=s1.volume();
        System.out.println("Volume is "+vol);
        System.out.println("Weight is "+s1.weight);
        System.out.println("Cost is "+s1.cost);
        System.out.println();
        vol=s2.volume();
        System.out.println("Volume is "+vol);
        System.out.println("Weight is "+s2.weight);
        System.out.println("Cost is "+s2.cost);
        System.out.println();
        vol=s3.volume();
        System.out.println("Volume is "+vol);
        System.out.println("Weight is "+s3.weight);
        System.out.println("Cost is "+s3.cost);
        System.out.println();
        vol=s4.volume();
        System.out.println("Volume is "+vol);
        System.out.println("Weight is "+s4.weight);
        System.out.println("Cost is "+s4.cost);
        System.out.println();

        }

        }

