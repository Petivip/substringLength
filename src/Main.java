import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the whole word:");
        String answer = sc.nextLine();

        System.out.println("Enter the index to cut the word to:");
        int index = sc.nextInt();

        if (index<=(answer.length()-1)){
            System.out.println("The length of the word is: " + answer.length());
            System.out.println("The substring of the word until the number you entered is: " + answer.substring(index));
        }
    }}