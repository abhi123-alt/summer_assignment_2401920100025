

public class Main{
        public static void main(String[] args) {
            // implementing the outer class;

            outer obj1=new outer();
            obj1.display();
            outer.inner obj2= obj1.new inner();
            obj2.display();

            // implementing the point class;
            point p=new point();
            p.setX(10);
            p.setY(20);
            p.display();
            p.setXY(10, 20);
            p.display();

            // implementing the arithmatic class;

            arithmatic ar=new arithmatic();
            int res= ar.square(5);
            System.out.println("Square is : " + res);

            // implementing the box class;
            box b1= new box(5,4);
            System.out.println("Area: " + b1.area());

            box3d b2=new box3d(5,4,3);
            System.out.println("Volume: " + b2.volume());
        }
}