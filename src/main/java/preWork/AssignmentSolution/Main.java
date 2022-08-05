package preWork.AssignmentSolution;

import java.util.Scanner;

public class Main {

        /*

        Check for palindrome number
        Prints the pattern of stars in decreasing order based on the input
        Check whether the input number is a prime number
        Print Fibonacci series of size n with first two numbers as 0, 1

        */

    //Check for palindrome number
    private static boolean checkPalindrome(int num){
        String numCopy = String.valueOf(num);
        for(int i = 0, j = numCopy.length()-1; i < numCopy.length()/2; i++, j--){
            if(numCopy.charAt(i) != numCopy.charAt(j)){
                return false;
            }
        }
        return true;
    }

    //Prints the pattern of stars in decreasing order based on the input
    private static void printPattern(int num){
        for (int i = num; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Prints the pattern of stars in decreasing order based on the input
    private static boolean checkPrime(int num){
        if (num <= 1){
            return false;
        }
        for(int i = 2; i <= num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    //Print Fibonacci series of size n with first two numbers as 0, 1
    public static void printFibonacciSeries(int num) {
        int first = 0, second = 1, next = 0, iterator = 0;
        System.out.print(first + " ");
        System.out.print(second + " ");
        while (iterator < num-2){
            next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
            iterator++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int inputNum = 0;

        do{
            System.out.println();
            System.out.println("Enter your choice from below list.\n"
                    + "1. Find palindrome of number.\n"
                    + "2. Print Pattern for a given no.\n"
                    + "3. Check whether the no is a  prime number.\n"
                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            choice = sc.nextInt();

            switch (choice){

                case 0:
                    choice = 0;
                    break;

                case 1:{
                    //Check for palindrome number
                    System.out.print("Check for palindrome number: ");
                    inputNum = sc.nextInt();
                    if (checkPalindrome(inputNum))
                        System.out.println(inputNum + " is a Palindrome");
                    else
                        System.out.println(inputNum + " is not a Palindrome");
                }
                break;

                case 2:{
                    //Prints the pattern of stars in decreasing order based on the input
                    System.out.print("Input a number: ");
                    inputNum = sc.nextInt();
                    printPattern(inputNum);
                }
                break;

                case 3:{
                    //Check whether the input number is a prime number
                    System.out.print("Check for prime number: ");
                    inputNum = sc.nextInt();
                    if (checkPrime(inputNum))
                        System.out.println(inputNum + " is a prime number");
                    else
                        System.out.println(inputNum + " is not a prime number");
                }
                break;

                case 4:{
                    //Print Fibonacci series of size n with first two numbers as 0, 1
                    System.out.print("Input a number: ");
                    inputNum = sc.nextInt();
                    printFibonacciSeries(inputNum);
                    System.out.println();
                }
                break;

                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        }while(choice != 0);

        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}