import java.util.*;
public class PaymentOfJeevitha {
    public static void computeSalary(int [] hoursWorked)
    {
        int hourPayment=100;
        int minWorkingHours=8;
        int minWeeklyHours=40;
        int salary=0;
        int weeklyHours=0;
        //computing salary
        for(int i=1;i<6;i++)
        {
            weeklyHours+=hoursWorked[i];
            salary += (hoursWorked[i]*hourPayment);
            if(hoursWorked[i]>minWorkingHours){
                int extraHours=(hoursWorked[i]-minWorkingHours);
                salary += (extraHours*15);
            }
            if(weeklyHours>minWeeklyHours) {
                int extraWeeklyHours = (weeklyHours - minWeeklyHours);
                salary += (extraWeeklyHours * 25);
            }
        }
        for(int i=0;i<7;i++)
        {
            if(hoursWorked[0]>0)
            {
                salary += (hoursWorked[0]*hourPayment);
                if(hoursWorked[0]>minWorkingHours)
                    salary += ((hoursWorked[0]-minWorkingHours)*15);
                salary+=(salary*0.5);
            }
            if(hoursWorked[7]>0)
            {
                salary += (hoursWorked[0]*hourPayment);
                if(hoursWorked[0]>minWorkingHours)
                    salary += ((hoursWorked[0]-minWorkingHours)*15);
                salary+=(salary*0.25);
            }
        }
        System.out.println(salary);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hoursWorked = new int[8];
        for(int i=0;i<7;i++)
        {
            hoursWorked[i]=scanner.nextInt();
        }
        computeSalary(hoursWorked);
    }

}
