import java.util.*;

public class Condition {

    public static void main(String args[])  {



   // ye age define ke liye hai

    /*   System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
         if(age > 18) {
            System.out.println("Adult");
         }
         else {
            System.out.println("Not Adult");
         }
      */

         // ye Odd even ke liye hai

/*System.out.println("Enter the number =");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
 if(num%2==0) {
   System.out.println("Even number");
 }
 else {
   System.out.println("Odd Number");
 }
*/


// ye jab 2 se jyda conditon di rhe tab

/* 
System.out.println("Enter num a ");
System.out.println("Enter num b ");

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

if (a == b) {
   System.out.println("Equal");
}
else {
   if(a>b) {
      System.out.println("a is greater");
   }
   else {
      System.out.println("a is lesser");
   }
}

 */




// ye else if statement ke liye hai


/* 
System.out.println("Enter num a ");
System.out.println("Enter num b ");

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

if (a == b) {
   System.out.println("Equal");
}
else if(a>b) {
      System.out.println("a is greater");
   }
   else {
      System.out.println("a is lesser");
   }
   */


/* 
     Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button == 1) {
            System.out.println("Hello");
        }
        else if (button == 2)  {
            System.out.println("Namaste");
        }
        else if (button == 3)  {
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Invalid button");
        }

*/

/*  switch case statement hai jab bahot sare condition
rhti hai or code clean dikhane ke liye switchcase use karte hai */

/*
Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch ( button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("INVALID");
        }

      */



         
       /*   
      Scanner sc = new Scanner(System.in);
         System.out.println("Enter num a");
      int a = sc.nextInt();
         System.out.println("Enter num b");
      int b = sc.nextInt();

        int sum= a+b;
        int sub= a-b;
        int mul= a*b;
        int div= a/b;
        int mod= a%b;
      

      System.out.println("sum" +sum);
      System.out.println("sub" +sub);
      System.out.println("mul" +mul);
      System.out.println("div" +div);
      System.out.println("mod" +mod);

ye calculator hai jo 2 value ko ek sath sab kuch kar deta hai
      */


Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        switch(week) {
        case 1 : System.out.println("Monday");
        break;
        case 2 : System.out.println("Tuesday");
        break;
        case 3 : System.out.println("Wednesday");
        break;
        case 4 : System.out.println("Thusday");
        break;
        case 5 : System.out.println("Friday");
        break;
        case 6 : System.out.println("saturday");
        break;
        case 7 : System.out.println("Sunday");
        break;
        default: System.out.println("Invalid day");
      }

    }
    }
