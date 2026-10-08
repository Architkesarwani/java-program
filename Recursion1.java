// Q1. print no. from 5 to 1 

/* 
public class Recursion1{
    
public static void printNumb(int n) {
    if(n==0) {
        return;
    }
    System.out.println(n);
    printNumb(n-1);
}
public static void main(String args[]) {
    int n= 5;
    printNumb(n);    // n=5
}

}

 */


// Q2. print no. from 1 to 5

/*
public class Recursion1{
    
public static void printNumb(int n) {
    if(n==6) {
        return;
    }
    System.out.println(n);
    printNumb(n+1);
}
public static void main(String args[]) {
    int n= 1;
    printNumb(n);    // n=1
}
}

*/


// Q2. print sum of first n natural no. ?

/* */

public class Recursion1{                                                 //main function -> 1
                                                                         //Base Condition -> n   (sum print)
    public static void printSum (int i ,int n , int sum  ) {             //Work done -> calculate sum.
        
        if(i==n) {         // Base
            sum +=i;
            System.out.println(sum);
           return;
        }
        sum += i;            
        printSum(i+1,n,sum);               //Workdone
    }

    public static void main(String args[]) {
        printSum(1 , 5 , 0);             // main function
    }
}