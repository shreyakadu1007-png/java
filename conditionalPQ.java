import java.util.Scanner;
public class conditionalPQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*INCOME TAX CALCULATOR 
        System.out.println("Income Tax Calculator");
        System.out.println("Enter Income:");
        int income = sc.nextInt();
        int tax;

        if(income<500000){
            System.out.println("Tax = "+ (tax = 0));
        }
        else if(income >= 500000 &&income<1000000){
            System.out.println("Tax = "+ (tax =(int)(income*0.2)));
        }
        else{
            System.out.println("Tax = "+ (tax =(int)(income*0.3)));
        }
            */
        /*Check fever or not 
        System.out.println("Enter Temperature:");
        double temp =  sc.nextDouble();
        if(temp >100){
            System.out.println("You have fever");
        }else{
            System.out.println("You don not have fever");
        } */
        /* display week name with switch case 
        System.out.println("Enter Week Number(1-7)");    
        int week = sc.nextInt();
        switch(week){
            case 1: System.out.println("MONDAY");
            break;
            case 2: System.out.println("TUESDAY");
            break;
            case 3: System.out.println("WEDNESDAY");
            break;
            case 4: System.out.println("THURSDAY");
            break;
            case 5: System.out.println("FRIDAY");
            break;
            case 6: System.out.println("SATURDAY");
            break;
            case 7: System.out.println("SUNDAY");
            break;
            default:System.out.println("Invalid input");
        } */
        System.out.println("Enter year");
        int year = sc.nextInt();
        boolean x = (year % 4)==0;
        boolean y = (year % 100)!=0;
        boolean z = (year % 100==0)  && (year % 400 ==0);
        if (x&& ( y || z)){
            System.out.println(year+"is a leap year");
        } else{
            System.out.println(year+"year in not a leap year");
        }
       sc.close();
    }
}
