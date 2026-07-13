import java.util.regex.*;
import java.util.Scanner;

public class Regex {

    //validateEmail method validates email based on the required conditions.
    public boolean validateEmail(String email){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+([+._-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z0-9]{2,}(\\.[a-zA-Z0-9]{2,})?");
        Matcher m=p.matcher(email);
        return m.matches();
    }

    public static void main(String[] args){
        Regex rex=new Regex();
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Email: ");
            //calling the validateEmail method for user input.
            System.out.println(rex.validateEmail(sc.next()));
    }
}
