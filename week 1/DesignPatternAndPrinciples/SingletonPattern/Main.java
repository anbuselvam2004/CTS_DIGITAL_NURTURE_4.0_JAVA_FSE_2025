import SingletonPattern.Logger;
public class Main {
     public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.print("First log");

        Logger logger2 = Logger.getInstance();
        logger2.print("Second log");

        if(logger1==logger2){
            System.out.println("Both point to the same address");
        }
        else{
            System.out.println("It does not point to the same address");
        }
    }
}
