import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    private static int num1;
    private static int num2;
    private static int num3;
    private static int num4;
    private static int num5;

    public DogGenetics() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your dog's name? ");
        String userInput = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + userInput + "'s prestigious background right here.\n");
        System.out.println(userInput + " is:\n");
        generateRandomPercentages();
        System.out.println(num1 + "% St. Bernard");
        System.out.println(num2 + "% Chihuahua");
        System.out.println(num3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(num4 + "% Common Cur");
        System.out.println(num5 + "% King Doberman");
        System.out.println("\nWow, that's QUITE the dog!");
        input.close();
    }

    public static void generateRandomPercentages() {
        Random random = new Random();

        do {
            num1 = random.nextInt(100) + 1;
            num2 = random.nextInt(100) + 1;
            num3 = random.nextInt(100) + 1;
            num4 = random.nextInt(100) + 1;
            num5 = random.nextInt(100) + 1;
        } while(num1 + num2 + num3 + num4 + num5 != 100);

    }
}