import java.util.Scanner;

public class PasswordGenStart {
    private boolean upperCase;
    private boolean lowerCase;
    private boolean numbers;
    private boolean symbols;
    private int passwordLength;

    public PasswordGenStart(){
        this.passwordLength = passwordLength();
        System.out.println("The length specified is "+passwordLength);
    }

    private int passwordLength(){
        System.out.println("What length would you like the password to be?");
        Scanner in =new Scanner(System.in);
        int userLength = in.nextInt();
        return userLength;
    }

    void passwordIdentifier(){

    }
}
