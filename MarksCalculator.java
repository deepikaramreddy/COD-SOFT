import java.util.Scanner;
public class MarksCalculator{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the no.of subjects: ");
        int numSubjects=scanner.nextInt();
        int[] marks=new int[numSubjects];
        int totalMarks=0;
        for(int i=0;i<numSubjects;i++)
        {
            System.out.print("Enter marks obtained in subject " + (i+1) +"(out of 100):");
            marks[i]=scanner.nextInt();
            totalMarks+=marks[i];
        }
            double averagePercentage=(double) totalMarks / numSubjects;
            char grade;
            if(averagePercentage>=90){
                grade='A';
            }else if(averagePercentage>=75){
                grade='B';
            }else if (averagePercentage>=50){
                grade='C';
             }else if(averagePercentage>=35){
                grade='D';
            }else{
                grade='F';
            }
            System.out.println("\nResults");
            System.out.println("total marks:"+totalMarks);
            System.out.println("Average percentage:"+ averagePercentage + "%");
            System.out.println("Grade: "+grade);
            scanner.close();
        }
}
