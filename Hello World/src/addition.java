import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number1:");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number 2:");
        int num2 = scanner.nextInt();
        int result = add(num1, num2);
        System.out.println(result);
    }
        public static int add ( int number1, int number2){
        int output = number1 + number2;
        return output;

        }
}
