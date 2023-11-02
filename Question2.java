import java.util.Scanner;
public class Question2 {
    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);
        float marks = 0;
        System.out.print("ENTER THE TOTAL MARKS FOR WHICH THE EXAM WAS CONDUCTED FOR = ");
        int totalmarks = sc.nextInt();
        System.out.println("ENTER THE MARKS OBTAINED IN SUBJECT 1 =");
        float sub1 = sc.nextFloat();

        System.out.println("ENTER THE MARKS OBTAINED IN SUBJECT 2 =");
        float sub2 = sc.nextFloat();

        System.out.println("ENTER THE MARKS OBTAINED IN SUBJECT 3 =");
        float sub3 = sc.nextFloat();

        System.out.println("ENTER THE MARKS OBTAINED IN SUBJECT 4 =");
        float sub4= sc.nextFloat();

        System.out.println("ENTER THE MARKS OBTAINED IN SUBJECT 5 =");
        float sub5= sc.nextFloat();

        marks=sub1+sub2+sub3+sub4+sub5;

        float averagepercentage =(marks/5);
        System.out.println("AVERAGE PERCENTAGE="+averagepercentage);

        String grade =new String("");
        if(averagepercentage < 30) {
            grade = "F";
        }
        else if(averagepercentage >30 && averagepercentage <50) {
            grade ="E";
        }
        else if(averagepercentage >50 && averagepercentage <60) {
            grade ="D";
        }
        else if(averagepercentage >60 && averagepercentage <70) {
            grade = "C";
        }
        else if(averagepercentage >70 && averagepercentage <80) {
            grade ="B";
        }
        else if(averagepercentage >80 && averagepercentage <90) {
            grade = "A";
        }
        else {
            grade ="S";
        }
        System.out.println("TOTAL MARKS OBTAINED = "+marks);
        System.out.println("AVERAGE PERCENTAGE OBTAINED = "+ averagepercentage);
        System.out.println("THE GRADE RECEIVED = "+grade);
    }}