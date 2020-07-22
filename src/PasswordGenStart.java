import java.util.Scanner;

public class PasswordGenStart {
    private boolean upperCase;
    private boolean lowerCase;
    private boolean numbers;
    private boolean symbols;
    private int passwordLength = 0;

    public PasswordGenStart(){
        passwordLength();
        System.out.println("The length specified is "+passwordLength);
    }

    private void passwordLength(){
        Scanner in =new Scanner(System.in);
        do{
            System.out.println("What length would you like the password to be? (6 or greater)");
            if(in.hasNextInt()){
                passwordLength = in.nextInt();
            } else {
                System.out.println("Please input a number");
                in.next();
            }
        } while (passwordLength < 6);
    }

    void passwordIdentifier(){

    }
}
