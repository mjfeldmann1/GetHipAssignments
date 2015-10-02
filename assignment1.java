import java.util.Scanner;

public class atm {
public static int balance = 0; //User's balance
        public static void main(String[] args) {
                intro(); //This function shows what happens when you open the program

}
public static void intro() {
Scanner input = new Scanner(System.in); //Tells what the user types in
int pin = 4321; //User's PIN number
int entered; //Integer that takes the place of what the user types in
System.out.println("Please enter your PIN");
                entered = input.nextInt();
                if (entered == 4321) {
                System.out.println("Welcome to Huge Bank Inc."); //Welcomes user
                System.out.printf("Your balance: $%s.00", balance); //Tells user balance
                select();
} else {
System.out.println("Incorrect PIN");
intro(); //repeats intro so user can try to enter correct PIN
}

}



public static void select() {
Scanner input = new Scanner(System.in);
int entered;
System.out.println(" ");
System.out.println("Would you like to");
System.out.println("1. Make a deposit");
System.out.println("2. Make a withdrawl");
System.out.println("3. Exit");
entered = input.nextInt();
        if (entered == 1) {
System.out.println("Your choice: 1");
deposit(); //This function carries out the process of making a deposit

} else if (entered == 2) {
System.out.println("Your choice: 2");
withdraw(); // This function carries out the process of making a withdrawl
} else if (entered == 3) {
System.out.println("Your choice: 3");
exit(); //This function ends the program after telling the user thank you
} else {
System.out.println("Please enter a number 1-3");
select(); //If the user does not enter a number between 1 and 3, they are sent back to the selection screen
}
}

public static void withdraw() {
Scanner input = new Scanner(System.in);
int entered;
System.out.println("How much would you like to withdraw?");
entered = input.nextInt();
if (entered <= balance && entered > 0) {
balance = balance - entered; //Creates new balacne
System.out.println("Withdrawl successful");
System.out.printf("Your balance: $%s.00", balance);
select();
} else if (entered == 0) {

System.out.println("Please enter an integer larger than 0");
withdraw();

} else {
System.out.println("ERROR: Not enough funds");
select(); //If the user does not have enough funds, they are sent back to the select screen
}
}

public static void deposit() {
Scanner input = new Scanner(System.in);
int entered;
System.out.println("How much would you like to deposit?");
entered = input.nextInt();
if (entered > 0) {
balance = entered + balance; //Creates new balance
System.out.println("Deposit successful");
System.out.printf("Your balance: $%s.00", balance);
select();
} else if (entered == 0) {
System.out.println("Please enter an integer other than 0");
deposit(); //If the user enters 0, they are prompted to try again
}
}
