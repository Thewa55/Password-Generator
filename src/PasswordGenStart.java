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
        passwordIdentifier();
//        System.out.println("Upper case "+ upperCase);
//        System.out.println("Lower case "+ lowerCase);
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
        lowerCase = passwordSpecifications("lowercasse letter");
        numbers = passwordSpecifications("numbers");
        symbols = passwordSpecifications("symbols");
        System.out.println("Uppercase: "+ upperCase);
        System.out.println("Lowercase: "+ lowerCase);
        System.out.println("Numbers: "+ numbers);
        System.out.println("Symbols: "+ symbols);
    }

    private boolean passwordSpecifications(String spec){
        Scanner in = new Scanner(System.in);
        String choice;
        boolean needed = true;
        System.out.println("Does your password need "+ spec+"? (yes/no)");
        choice = in.next();
        if(choice.equals("yes")){
            needed = true;
        } else if (choice.equals("no")){
            needed = false;
        } else {
            System.out.println("Invalid input, please enter yes or no");
            in.next();
        }
        return needed;
    }
}
