import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num;
        int randomNumber = (int)(Math.random() * 10);

        System.out.print("Guess the number(0-10): ");
        num = scan.nextDouble();

        if (num == randomNumber) {
            System.out.println("\n===================");
            System.out.println("You win!");
        }else{
            System.out.println("\n===================");
            System.out.println("You lose");
        }

       
    }
}
