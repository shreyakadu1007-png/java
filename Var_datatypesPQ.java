import java.util.Scanner;
public class Var_datatypesPQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    //QUE 1: In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers
   /* System.out.println("Enter A:");
    int a = sc.nextInt();
    System.out.println("Enter B:");
    int b = sc.nextInt();
    System.out.println("Enter C:");
    int c = sc.nextInt();
    int sum = a+b+c;
    System.out.println("AVERAGE OF THESE 3 NUMBERS :"+(sum)/3);
*/
    //QUE 2:In a program input the side of a sqaure ,you have to output the area of the square.
    System.out.println("Enter side of square:");
    float s = sc.nextFloat();
    System.out.println("Area of side is:"+(s*s));

    sc.close();
    }
}
