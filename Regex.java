import java.util.regex.*;
import java.util.Scanner;

public class Regex {

    //written the first use case of validating users first name
    //first name should start with Cap and should contain atleast 3 characters.
    public boolean validateFirstName(String firstname) {
        Pattern p = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher m=p.matcher(firstname);
        return m.matches();
    }

    //written the second use case of validating users last name
    //Last name should start with Cap and should contain atleast 3 characters.
    public boolean validateLastName(String lastname) {
        Pattern p = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher m=p.matcher(lastname);
        return m.matches();
    }

    //validateEmail method validates email based on the required conditions.
    public boolean validateEmail(String email){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+([+.-_][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z0-9]{2,}(\\.[a-zA-Z0-9]{2,})?");
        Matcher m=p.matcher(email);
        return m.matches();
    }

    //validating mobile number
    public boolean validateNumber(String num){
        Pattern p = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
        Matcher m=p.matcher(num);
        return m.matches();
    }

    // UC5 - Password Rule1 (Minimum 8 characters)
    public boolean validatePasswordRule1(String password) {
        //matches is a static method of Pattern class which takes two arguments regex,string.
        return Pattern.matches("^.{8,}$", password);
    }

    // UC6 - Password Rule2 (At least one uppercase)
    public boolean validatePasswordRule2(String password) {
        return Pattern.matches("^(?=.*[A-Z]).{8,}$", password);
    }

    // UC7 - Password Rule3 (At least one uppercase and one digit)
    public boolean validatePasswordRule3(String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$", password);
    }

    // UC8 - Password Rule4 (Exactly one special character)
    public boolean validatePasswordRule4(String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^a-zA-Z0-9]){1})(?!.*[^a-zA-Z0-9].*[^a-zA-Z0-9]).{8,}$", password);
    }


    public static void main(String[] args){
        Regex rex=new Regex();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Name: ");
        //calling the validateFirstName method for user input.
        System.out.println(rex.validateFirstName(sc.next()));

        System.out.println("Enter the Last Name: ");
        //calling the validateLastName method for user input.
        System.out.println(rex.validateLastName(sc.next()));

        System.out.println("Enter the Email: ");
        //calling the validateEmail method for user input.
        System.out.println(rex.validateEmail(sc.next()));

        sc.nextLine();
        System.out.println("Enter the Phone Number: ");
        //calling the validateNumber method for user input.
        System.out.println(rex.validateNumber(sc.nextLine()));

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.println("Rule1 : " + rex.validatePasswordRule1(password));
        System.out.println("Rule2 : " + rex.validatePasswordRule2(password));
        System.out.println("Rule3 : " + rex.validatePasswordRule3(password));
        System.out.println("Rule4 : " + rex.validatePasswordRule4(password));
    }
}
