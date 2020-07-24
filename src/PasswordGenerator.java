import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String choice;
        boolean generate = true;
        while(generate){
            PasswordGenStart password1 = new PasswordGenStart();
            System.out.println("Do you want to generate another password? (yes/no)");
            Scanner in = new Scanner(System.in);
            choice = in.next();
            if(choice.equals("no")){
                generate = false;
            }
        }
    }
}
