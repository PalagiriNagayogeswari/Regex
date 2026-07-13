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
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+([+.-_][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z0-9]{2,}\\.([a-zA-Z0-9]{2,})?");
        Matcher m=p.matcher(email);
        return m.matches();
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
        //calling the validateLastName method for user input.
        System.out.println(rex.validateEmail(sc.next()));
    }
}
