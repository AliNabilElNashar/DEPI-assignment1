import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student name: ");
        String name = input.nextLine();

        System.out.print("Enter the mark for subject 1: ");
        int mark1 = input.nextInt();
        System.out.print("Enter the mark for subject 2: ");
        int mark2 = input.nextInt();
        System.out.print("Enter the mark for subject 3: ");
        int mark3 = input.nextInt();
        int totalMarks = mark1 + mark2 + mark3;
        float average = (float) totalMarks / 3;

        char grade;
        if (average >= 90 && average <= 100) {
            grade = 'A';
        } else if (average >= 80 && average < 90) {
            grade = 'B';
        } else if (average >= 70 && average < 80) {
            grade = 'C';
        } else if (average >= 60 && average < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }


        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        switch (grade) {
            case 'A':
                System.out.println("Message: Excellent work!");
                break;
            case 'B':
                System.out.println("Message: Great job!");
                break;
            case 'C':
                System.out.println("Message: Good effort!");
                break;
            case 'D':
                System.out.println("Message: You passed, but aim higher.");
                break;
            case 'F':
                System.out.println("Message: You need to improve.");
                break;
        }
        System.out.println("Thank you for using the Student Grade Calculator!");
        input.close();
    }
}