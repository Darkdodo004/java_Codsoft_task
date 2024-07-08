// Input: Take marks obtained (out of 100) in each subject.
// Calculate Total Marks: Sum up the marks obtained in all subjects.
// Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
// average percentage.
// Grade Calculation: Assign grades based on the average percentage achieved.
// Display Results: Show the total marks, average percentage, and the corresponding grade to the user
import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        int total = m1+m2+m3+m4+m5;
        int avg=(total/5);
        System.out.println("Total Marks: "+total);
        System.out.println("Average Percentage: "+avg+"%");
        if(avg>=90){
            System.out.println("Grade: A");
        }
        else if(avg<90 && avg>=80)
        {
            System.out.println("Grade: B");
        }
        else if(avg>80 && avg<=60)
        {
            System.out.println("Grade: C");
        }
        else if(avg>60 && avg<=50)
        {
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: Fail");
        }

    }    
}
