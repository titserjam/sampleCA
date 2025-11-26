package java_sample;
import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose subject: \n- Programming \n- EmTech \n- HOPE" );
        System.out.print("Enter the subject: ");
        String subject;
        subject=s.nextLine().toLowerCase();

        switch (subject){
            case "programming":
                System.out.println("You choose to evaluate Programming subject.");
                break;
            case "emtech":
                System.out.println("You choose to evaluate EmTech subject.");
                break;
            case "hope":
                System.out.println("You choose to evaluate HOPE subject.");
                break;
            default:
                System.out.println("Invalid Subject");
                return;
        }
        System.out.print("Enter your 1st Quarter Grade: ");
        double grade1;
        grade1=s.nextDouble();

        System.out.print("Enter your 2nd Quarter Grade: ");
        double grade2;
        grade2=s.nextDouble();

        double average;
        average = (grade1+grade2)/2;
        System.out.println("Your average is "+ average);

        if (average>=98 && average<=100){
            System.out.println("Award: Gold Seal Bearer");
        } else if (average>=94 && average<=97){
            System.out.println("Award: Silver Seal Bearer");
        }else if(average>=90 && average<=93){
            System.out.println("Award: Bronze Seal Bearer");
        }else if(average>=75 && average<=89){
            System.out.println("Award: Passed");
        }else if (average>=60 && average<=74){
            System.out.println("Award: Failed");
        }else{
            System.out.println("Invalid grade input.");
        }
    }
}


