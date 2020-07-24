import java.util.Scanner;

public class PasswordGenStart {
    private boolean upperCase;
    private boolean lowerCase;
    private boolean numbers;
    private boolean symbols;
    private int passwordLength = 0;
    private String upperPool = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowerPool = "abcdefghijklmnopqrstuvwxyz";
    private String numberPool = "0123456789";
    private String symbolPool = "!@#$%^&*()./";
    private String passwordPool = "";
    private String password;

    public PasswordGenStart(){
        passwordLength();
        System.out.println("The length specified is "+passwordLength);
        passwordIdentifier();
        if(passwordPool.length() == 0){
            System.out.println("You need to select at least one password criteria.");
            passwordIdentifier();
        }
        this.password = generatePassword();
        System.out.println("Your password is :" + password);
    }

    private void passwordLength(){
        Scanner in = new Scanner(System.in);
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

    private void passwordIdentifier(){
        upperCase = passwordSpecifications("uppercase letter");
        lowerCase = passwordSpecifications("lowercase letter");
        numbers = passwordSpecifications("numbers");
        symbols = passwordSpecifications("symbols");
        if(upperCase){ passwordPool = passwordPool + upperPool; }
        if(lowerCase){ passwordPool = passwordPool + lowerPool; }
        if(numbers){ passwordPool = passwordPool + numberPool;}
        if(symbols){ passwordPool = passwordPool + symbolPool;}
    }

    private boolean passwordSpecifications(String spec){
        Scanner in = new Scanner(System.in);
        String choice;
        boolean needed = true;
        System.out.println("Does your password need "+ spec+"? (yes/no)");
        choice = in.next();
        if(choice.equals("yes")){
            return needed;
        } else if (choice.equals("no")){
            needed = false;
        } else {
            System.out.println("Invalid input, please enter yes or no");
            in.next();
        }
        return needed;
    }

    private String generatePassword(){
        char [] password = new char[passwordLength];
        for(int i = 0; i < passwordLength; i++){
            int rand = (int) (Math.random() * passwordPool.length());
            password[i] = passwordPool.charAt(rand);
        }
        return new String(password);
    }
}
