public class testCompartment{
    abstract public class Compartment{
       public abstract String notice();
    }
    class firstclass extends Compartment{
        public String notice(){
            return "travellor except first class ticket should go to thier respective class";
        }
    }
    class ladies extends Compartment{
        public String notice(){
            return "This is ladies Coach, Every man should leave this coach";
        }
    }
    class General extends Compartment{
        public String notice(){
            return "kindly keep maintaining hygiene and don't rush";
        }
    }
    class luggage extends Compartment{
        public String notice(){
        return "this is a luggage class, kindly leave these class, it is only to keep luggage";
        }
    }
    //public class testCompartment{
    public static void main(String []args){
        testCompartment test= new testCompartment();
        System.out.println(test.new ladies().notice());
        System.out.println(test.new firstclass().notice());
        System.out.println(test.new General().notice());
        System.out.println(test.new luggage().notice());

    }
}