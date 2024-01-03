import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\"Percentage of total six subjects Number\"");

        System.out.print("Enter First Subject Number Out Of 100: ");
        int first = sc.nextInt();
        System.out.print("Enter Second Subject Number Out Of 100: ");
        int second = sc.nextInt();
        System.out.print("Enter Third Subject Number Out Of 100: ");
        int third = sc.nextInt();
        System.out.print("Enter Forth Subject Number Out Of 100: ");
        int forth = sc.nextInt();
        System.out.print("Enter Fifth Subject Number Out Of 100: ");
        int fifth = sc.nextInt();
        System.out.print("Enter Sixth Subject Number Out Of 100: ");
        int sixth = sc.nextInt();

        int totalMarks = first+second+third+forth+fifth+sixth;
        System.out.println("Total Marks Obtained: " +totalMarks);

        int percentageMarks = totalMarks*100/600;
        System.out.println("Obtained Marks In Percentage: " +percentageMarks);

        

    }
}
