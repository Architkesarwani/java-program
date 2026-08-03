// Q1. Make a function to add 2 number and return the sum

import java.util.*;
public class functionsQ {
    public static int calculateSum(int a , int b) {
        int sum = a+b;
        return sum ;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("sum of 2 number is : " + sum);

    }
    
}



// Q2. Make a function to multiply 2 number and return the product



public class functionsQ {
    public static int calculateProduct(int a , int b) {
        int mul = a*b;
        return mul ;
    }
    
    public static void main(String argn[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a,b);
        System.out.println(product);



    }
}


// Find the factorial of a number using function
 