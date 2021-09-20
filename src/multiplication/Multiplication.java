package multiplication;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int numberToMultiply;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which multiplication table would you like to see?: ");
        numberToMultiply = keyboard.nextInt();
        int answer;
        int correct = 0;
        int wrong = 0;
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " * " + numberToMultiply + "= " );
            answer = keyboard.nextInt();

            if(answer == i * numberToMultiply){
                System.out.println("Correct");
                correct ++;
            }
            else{
                System.out.println("Wrong!");
                wrong ++;
            }
        }
        System.out.println("You had " + correct + " questions and " + wrong + " wrong questions");
    }
}
