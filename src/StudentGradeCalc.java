import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number Of Subjects: ");
            int numSubjects = sc.nextInt();

            if(numSubjects <= 0){
                System.out.println("Please Enter a valid Number Of Subject! ");
                return;
            }
            int totalMarks = 0;
            int maxMarksPerSubject = 100;

            for (int i = 1; i <= numSubjects; i++){
                System.out.println("Enter Marks Obtained In Subject"+ i +"(out Of 100.):");
                int marks = sc.nextInt();

                if (marks < 0 || marks > maxMarksPerSubject){
                    System.out.println("Marks Should be in the Range of 0 to 100. Please Enter Valid Marks: ");
                    i--;
                }
                else {
                    totalMarks += marks;
                }
            }
            double averagePercentage = (double) totalMarks / (numSubjects +maxMarksPerSubject) *100;
            System.out.println("Total Marks : " + totalMarks);
            System.out.println("Average Percentage : " + averagePercentage + "%");

            String grade;

            if (averagePercentage >= 90){
                grade = "A+";
            }
            else if (averagePercentage >= 80){
                grade = "A";
            }
            else if (averagePercentage >= 70) {
                grade = "B";
            }
            else if (averagePercentage >= 60) {
                grade = "C";
            }
            else if (averagePercentage >= 50) {
                grade = "D";
            }
            else {
                grade = "E";
            }

        System.out.println("Grade : " +grade);

    }
}
