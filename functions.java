



public class functions{
  //product of a and b
    public static int multiply(int a, int b){ 
    int product = a*b;
    return product;
    }
    //factorial of number
    public static int factorial(int n){
      int f=1;
      for(int i=1;i<=n;i++){
        f=f*i;
      }
      return f;
    }
    public static int bincoeff(int n,int r){
      int fact_n= factorial(n);// as we calculate factorial in other function
      int fact_r=factorial(r);
      int fact_nminusr=factorial(n-r);

      int binCoeff = fact_n/(fact_r*fact_nminusr);
      return binCoeff;
    }

    //function overloading using parameters
    public static int sum(int a,int b){
      return a+b;
    }
    public static int sum(int a,int b,int c){
      return a+b+c;
    } 

    //binary to decimal
    public static void binToDec(int binNum) {
      int pow = 0;
      int myNum = binNum;
      int decNum=0;

      while(binNum>0){
        int lastDigit = binNum %10;
        decNum =decNum +(lastDigit * (int)Math.pow(2,pow));
        pow++;
        binNum = binNum/10;
      }
        System.out.println("decimal of "+ myNum + "="+ decNum);
    }

      //decimal to binary
      public static void decToBin(int DecNum){
        int BinNum = 0;
        int MyNum = DecNum;
        int pow= 0;
    
      while(DecNum>0){
        int rem = DecNum % 2;
        BinNum = BinNum + (rem * (int)Math.pow(10,pow));
        pow ++;
        DecNum = DecNum /2;
      } 
      System.out.println("binary of"+ MyNum +"="+ BinNum);
    }
    public static void main(String[] args) {
        /* product :
        int a = 3;
        int b = 3;
        int prod = multiply(a,b);
        System.out.println("a*b="+prod);
       prod = multiply(10,20);
        System.out.println("a*b="+prod); */

        /*factorial
        System.out.println(factorial(4));
        //or
        int result=factorial(2);
      System.out.println("factorial"+result);  
      */

     /*find binomial coefficient
     System.out.println(bincoeff (5,2));
     */
    
     /*function_overloading using parameters
     System.out.println(sum(3,5));
     System.out.println(sum(2,4,5));
     */
  
    /* binary to decimal
       binToDec(101);  */

    //decimal to binary
      decToBin(5);
      }
}
