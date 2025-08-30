import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the FirstName:");
        String firstname = scanner.next();
        System.out.print("Enter the LastName:");
        String lastname = scanner.next();
        String name = conc(firstname, lastname);
        System.out.println(name);
    }
        public static String conc(String fname, String lname) {
          //  String fullname = fname.concat(lname);  without space
            return fname + " " + lname;
        }

    }
