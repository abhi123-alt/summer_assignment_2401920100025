public class point{
    private int x, y;
    public point(){
        this.x=0;
        this.y=0;
    }
    public point(int x, int y){
         x=this.x;
         y=this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x, int y){
         x=this.x;
         y=this.y;
    }
    void display(){
        System.out.println("X= " + x + " Y= " + y);
    }
}