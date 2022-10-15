import java.util.concurrent.TimeUnit;

/**
 * @author Drumstyle92
 * Class containing main.
 */
public class Tester {
    /**
     * @param args main parameter.
     * class that contains a loop while.
     */
    public static void main(String[] args) {
        System.out.println("----------------WhileLoop------------");
        while(true){
            System.out.println("I am in loop");

            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                System.out.println("Error");
            }
        }
    }
}
