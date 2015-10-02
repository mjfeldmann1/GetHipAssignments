import java.util.Scanner;

public class atm {
public static int balance = 0;
        public static void main(String[] args) {
                intro();

}
public static void intro() {
Scanner input = new Scanner(System.in);
int pin = 4321;
int entered;
System.out.println("Please enter your PIN");
                entered = input.nextInt();
                if (entered == 4321) {
                System.out.println("Welcome to Huge Bank Inc.");
                System.out.printf("Your balance: $%s", balance);
                select();
} else {
System.out.println("Incorrect PIN");
intro();
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
deposit();

} else if (entered == 2) {
System.out.println("Your choice: 2");
withdraw();
} else if (entered == 3) {
System.out.println("Your choice: 3");
exit();
} else {
System.out.println("Please enter a number 1-3");
select();
}
}

public static void withdraw() {
Scanner input = new Scanner(System.in);
int entered;
System.out.println("How much would you like to withdraw?");
entered = input.nextInt();
if (entered <= balance && entered > 0) {
balance = balance - entered;
System.out.printf("Your balance: $%s", balance);
select();
} else if (entered == 0) {

System.out.println("Please enter an integer larger than 0");
withdraw();

} else {
System.out.println("ERROR: Not enough funds");
select();
}
}

public static void deposit() {
Scanner input = new Scanner(System.in);
int entered;
System.out.println("How much would you like to deposit?");
entered = input.nextInt();
if (entered > 0) {
balance = entered + balance;
System.out.printf("Your balance: $%s", balance);
select();
} else if (entered == 0) {
System.out.println("Please enter an integer other than 0");
deposit();
}
}

public static void exit() {
System.out.println("Thank you for your business!");

}
}
