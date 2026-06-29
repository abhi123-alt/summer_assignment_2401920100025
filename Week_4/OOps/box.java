public class box{
    double length;
    double breadth;
    
    box(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double area(){
        return length+breadth;
    }
}
class box3d extends box{
    double height;
    box3d(double length, double breadth, double h){
        super(length, breadth);
        this.height=h;
    }

    double volume(){
        return length*breadth*height;
    }
}