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

    public static void main(String[] args){
        Regex rex=new Regex();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Name: ");
        //calling the validateFirstName method for user input.
        System.out.println(rex.validateFirstName(sc.next()));
    }
}
