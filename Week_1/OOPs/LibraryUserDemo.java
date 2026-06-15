    interface LibraryUser{
        void registerAccount();
        void requestBook();
    }
     class kidUser implements LibraryUser{
        int age;
        String BookType;
        kidUser(int age, String BookType){
            this.age=age;
            this.BookType=BookType;
        }
        public void registerAccount(){
            if(age<12) {
                System.out.println("You have successfully registered under a Kids Account");
            }
            else{
                System.out.println("Sorry, Age must be less than 12 to register as a kid");
            }
        }
        public void requestBook(){
            if(BookType.equals("Kids")){
                System.out.println("Book Issued successfully, please return the book within 10 days");
            }
            else{
                System.out.println("Oops, you are allowed to take only kids books");
            }
        }
    }
     class AdultUser implements LibraryUser{
        int age;
        String BookType;
        AdultUser(int age, String BookType){
            this.age= age;
            this.BookType=BookType;
        }
        public void registerAccount(){
          if(age >= 12) System.out.println("You have successfully registered under an Adult account");
          else System.out.println("Sorry, Age must be greater than 12 to register as an adult");

        }
        public void requestBook(){
            if(BookType.equals("Fiction")){
                System.out.println("Book Issued successfully, please return the book within 7 days");
            }
            else System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
public class LibraryUserDemo {
    public static void main(String []args){
        kidUser kid1= new kidUser(10, "Kids");
        kid1.registerAccount();
        kid1.requestBook();
        kidUser kid2= new kidUser(18, "Fiction");
        kid2.registerAccount();
        kid2.requestBook();
        kidUser kid3= new kidUser(8, "Fiction");
        kid3.registerAccount(); 
        kid3.requestBook();
        kidUser kid4= new kidUser(15, "Kids");
        kid4.registerAccount();
        kid4.requestBook();
    System.out.println("-----------------------------");
        AdultUser adult= new AdultUser(18, "Fiction");
        adult.registerAccount();
        adult.requestBook();
        AdultUser adult2= new AdultUser(23, "Kids");
        adult2.registerAccount();
        adult2.requestBook();
        AdultUser adult3= new AdultUser(9, "Fiction");
        adult3.registerAccount();
        adult3.requestBook();
        AdultUser adult4= new AdultUser(25, "Fiction");
        adult4.registerAccount();
        adult4.requestBook();
    }
}