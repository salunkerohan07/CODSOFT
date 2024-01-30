package internship_tasks;

import java.util.Scanner;

public class task2_gradecalculator {
    public static void main(String[] args){
        System.out.println("Student's Grade calculator");
        System.out.println("Enter the marks of the given Subjects: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Physics: ");
        float f1 = sc.nextFloat();
        System.out.println("Enter the marks of Chemistry: ");
        float f2 = sc.nextFloat();
        System.out.println("Enter the marks of History: ");
        float f3 = sc.nextFloat();
        System.out.println("Enter the marks of Mathematics: ");
        float f4 = sc.nextFloat();
        System.out.println("Enter the marks of Marathi: ");
        float f5 = sc.nextFloat();

        float total = (f1 + f2+ f3 + f4 + f5);
        System.out.println("Total marks obtained: ");
        System.out.println(total);

        float percentage = ((f1 + f2 + f3 + f4 + f5)/500)*100;
        System.out.println("The percentage is: ");
        System.out.println(percentage);

        if (percentage >= 90){
            System.out.println("Grade: O");
        }
        else if (percentage >= 80 && percentage < 90) {
            System.out.println("Grade: A");
        }
        else if (percentage >= 70 && percentage < 80) {
            System.out.println("Grade: B");
        }
        else if (percentage >= 50 && percentage < 70) {
            System.out.println("Grade: C");
        }
        else if (percentage >= 28 && percentage < 50) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }
}


