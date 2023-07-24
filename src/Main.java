import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // 1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
//        System.out.printf("Eneter the first number : ");
//        int num1 = userInput.nextInt();
//
//        System.out.printf("Eneter the second number : ");
//        int num2 = userInput.nextInt();
//
//        System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
//        System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));
//        System.out.println( num1 + " x " + num2 + " = " + (num1 * num2));
//        System.out.println( num1 + " / " + num2 + " = " + (num1 / num2));
//        System.out.println( num1 + " mod " + num2 + " = " + (num1 % num2));


//        // 2.Write a Java program to convert a given string into lowercase.
//        System.out.printf("Eneter your string in CAPITAL LETTER : ");
//        String capitalCase = userInput.nextLine();
//
//        System.out.println("your string in lowerCase is : " + capitalCase.toLowerCase());


        // 3.Write a Java program that takes a string and a number from the user,
        // then prints the character in the given index.
//        System.out.printf("Eneter your string : ");
//        String userString = userInput.nextLine();
//
//        System.out.printf("Eneter your index : ");
//        int indexNum = userInput.nextInt();
//
//        System.out.println("index number " + indexNum + " in the this string (" + userString + ") is : " + userString.charAt(indexNum));
//

        // 4.Write a Java program to accept a number and check the number is even or not.
        // Prints 1 if the number is even or 0 if the number is odd. (use if-statement)
//        System.out.printf("Enter any number : ");
//        int userNumber = userInput.nextInt();
//        if(userNumber % 2 == 0){
//            System.out.println(1);
//        }else System.out.println(0);


        // 5.Write a program that checks the role of the user
//        System.out.printf("Enter your role : ");
//        String role = userInput.nextLine();
//        if(role.equalsIgnoreCase("admin")){
//            System.out.println("welcome admin");
//        }else if (role.equalsIgnoreCase("superuser")){
//            System.out.println("welcome superuser");
//        }else {
//            System.out.println("welcome user");
//        }


        // 6.Write a Java program to calculate the sum of two integers
        // and return true if the sum is equal to a third integer.
//        System.out.printf("Enter the first number : ");
//        int firstNum = userInput.nextInt();
//
//        System.out.printf("Enter the second number : ");
//        int secondNum = userInput.nextInt();
//
//        System.out.printf("Enter the third number : ");
//        int thirdNum = userInput.nextInt();
//
//        if(firstNum + secondNum == thirdNum){
//            System.out.println(true);
//        }else System.out.println(false);


        // 7.Take three numbers from the user and print the greatest number.
//        System.out.printf("Enter the first number : ");
//        int firstNum = userInput.nextInt();
//
//        System.out.printf("Enter the second number : ");
//        int secondNum = userInput.nextInt();
//
//        System.out.printf("Enter the third number : ");
//        int thirdNum = userInput.nextInt();
//
//        if(firstNum > secondNum && firstNum > thirdNum){
//            System.out.println("the greates number is : " + firstNum);
//        }else if(secondNum > firstNum && secondNum > thirdNum){
//            System.out.println("the greates number is : " + secondNum);
//        }else {
//                System.out.println("the greates number is : " + thirdNum);
//        }


        // 8.Write a Java program that keeps a number from the user
        // and generates an integer between 1 and 7 and displays the name of the weekday.
        System.out.printf("Enter the day number : ");
        int day = userInput.nextInt();

        switch (day){
                case 1:
                System.out.println("sunday");
                break;
                case 2:
                System.out.println("monday");
                break;
                case 3:
                System.out.println("tuesday");
                break;

                case 4:
                System.out.println("wensday");
                break;

                case 5:
                System.out.println("thursday");
                break;

                case 6:
                System.out.println("friday");
                break;

                case 7:
                System.out.println("satrday");
                break;

            default:
                System.out.println("friday");
        }
    }
}