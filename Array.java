import java.util.*;
public class Array {
public static void main(String args[]) {

 /* int [] marks = new int[4];  // array of 4 size
marks[0] = 97;                  // physics marks and 1st index
marks[1] = 98;                 // chemistry marks and 2nd index
marks[2] = 99;                // biology marks and 3rd index
marks[3] = 100;               // maths marks and 4th index
//System.out.println(marks[0]);
//System.out.println(marks[1]);  
//System.out.println(marks[2]);

for(int i = 0; i<4; i++) {
    System.out.println(marks[i]);
}
*/











// ek or tarike se array ko define karne kr skte hai

/* int [] marks = {97,98,99,100}; // array of 4 size
for(int i=0;i<4;i++) {
    System.out.println(marks[i]);
}
*/










// user se input leke array ko define kr skte hai


/* 
Scanner sc = new Scanner(System.in); 
int size = sc.nextInt();
int[] numbers = new int[size];
for(int i=0;i<size;i++) {
 System.out.println(numbers[i]);
}  
  */




Scanner sc = new Scanner(System.in); 
int size = sc.nextInt();
int[] numbers = new int[size];

// input 
for(int i=0;i<size;i++) {
    numbers[i] = sc.nextInt();
}
// output
for(int i=0;i<size;i++) {
    System.out.println(numbers[i]);
}

}
}