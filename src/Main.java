import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        ####  Exercise 1:
//        Create a program that prints “It’s a great day today”.
//        Then ask the user “What is your name?.
//        Then print “Hello [NAME]”

        System.out.println("It's a great day today!");

        System.out.println("What is your name?");
        String name = reader.nextLine();

        System.out.println("Hello " + name );


//        ####  Exercise 2:
//        Ask for the user to enter a number.
//        Ask the user for another number.
//        Print the sum of the two numbers, then the difference of the two numbers.

        System.out.println("Enter a number");
        int number1 = reader.nextInt();

        System.out.println("Enter another number");
        int number2 = reader.nextInt();
        System.out.println("The sum of the two numbers entered = " + (number1 + number2));
        System.out.println("The difference of the two numbers entered = " + (number1 -number2));

//    ####  Exercise 3:
//    Ask the user to enter their balance. Print “I’ve granted you $1.50 more!. Your new balance is: [BALANCE]”

        System.out.println("Enter you bank balance");
        int bankBalance = reader.nextInt();
        System.out.println("I've granted you $1.50 more! Your new balance is: " + (bankBalance + 1.50));

//    ####  Exercise 4:
//    Ask a user to enter a password. Enter a password. Ask user to reenter password. Check to see if they are correct.

        System.out.println("Enter a password");
        String password1 = reader.next();


        System.out.println("ReEnter password");
        String password2 = reader.next();

        if(password1.equals(password2))
            System.out.println("Password does not match");
        else
            System.out.println("Password match!");

//    ####  Exercise 5:
//    Print “CORRECT” if 1, 2, or 3 is entered. If anything else is entered print "ERROR".
        System.out.println("Enter a number 1-10");
        int num1 = reader.nextInt();
        System.out.println("Enter another number between 1-10");
        int num2 = reader.nextInt();
        System.out.println("Enter one last number between 1-10");
        int num3 = reader.nextInt();

        if(num1 == 1 || num2 == 1 || num3 == 1 && num1<4 && num2<4 && num3<4){
            System.out.println("Correct");
        }
        else if(num1 == 2 || num2 == 2 || num3 == 2 && num1<4 && num2<4 && num3<4 ){
            System.out.println("Correct");

        }
        else if(num1 == 3 || num2 == 3 || num3 == 3 && num1<4 && num2<4 && num3<4)
        {
            System.out.println("Correct");
        }
        else{
            System.out.println("ERROR!!!");
        }

//        ####  Exercise 6:
//        Ask the user to enter a number. If it’s positive, print “POSITIVE”.
//        If it’s negative, print “NEGATIVE”.
//        If it’s zero, print "ZERO".

        System.out.println("Enter a number");
        int number = reader.nextInt();

        if(number < 0){
            System.out.println("Negative number");
        }
        else if(number > 0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("ZERO");
        }

//      ####  Exercise 7:
//      Ask the user for 3 card numbers.
//      If it equals 21 print BLACKJACK!,
//      if it’s greater than 21 print BUST!,
//      if it’s less than 21 print “The total is [TOTAL]”

        System.out.println("Enter 3 card numbers");
        int card1 = reader.nextInt();
        int card2 = reader.nextInt();
        int card3 = reader.nextInt();
        int total = (card1 + card2 + card3);

        if((card1 + card2 + card3) == 21){
            System.out.println("BLACK JACK");
        }
        else if((card1 + card2 + card3) > 21){
            System.out.println("BUSTED");
        }
        else{
            System.out.println("The total is " + total);
        }

//        ####  Exercise 8:
//        Ask the user to enter a number grade. It should print according to the following:
//
//        A 90 - 100 B 80 - 89 C 70 - 79 D 60 - 69 F 0 - 59
//
//        If it's negative or over 100 print "Error".

        System.out.println("Enter what you got on your last test");
        int numberGrade = reader.nextInt();

        if(numberGrade >= 90 && numberGrade <=100){
            System.out.println("A");
        }
        else if(numberGrade >= 80 && numberGrade <=89){
            System.out.println("B");
        }
        else if(numberGrade >= 70 && numberGrade <=79){
            System.out.println("C");
        }
        else if(numberGrade > 60 && numberGrade <=69){
            System.out.println("B");
        }
        else if(numberGrade >= 0 && numberGrade <=59){
            System.out.println("F");
        }
        else{
            System.out.println("ERROR");
        }

//   ####  Exercise 9:
//        Ask the user for their height in centimeters. Print their height in feet and inches.
//
//   ####  Exercise 10:
//        Ask the user to enter three numbers. Find the largest of three numbers using only things we learned today.
//
//   ####  Exercise 11:
//        Create a program that can calculate the quadratic equation. Google it if you don't know the equation.

    }


}
