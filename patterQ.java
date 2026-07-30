import java.util.Scanner;
public class patterQ {
    public static void main(String[] args) {

// Q 1. Rectangle

/*
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
    
    // outer loop
            for(int i=1;i<=n;i++) {
    // inner loop
            for(int j=1;j<=m;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

// Q 2  Hollow Rectangle


/*
int n = 4;
int m = 5;

    //  outher loop
for(int i=1;i<=n;i++) {
    // inner loop
    for(int j=1;j<=m;j++) {
   if(i == 1||j ==1 ||i == n||j == m) {
    System.out.print("*");
} else{
    System.out.print(" ");
}
}
System.out.println();
}
*/


// Q3. Half piramid


/* 
int n = 4;

for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++) {
        System.out.print("*");
    }  System.out.println();
}
*/

// Q4. Half pyramid invert

/* 
int n = 4;

for(int i=n;i>=1;i--) {
    for(int j=1;j<=i;j++) {
        System.out.print("*");
    } System.out.println();
}
*/


// Q4. inverted half pyramid (rotated by 180 deg)

/* 
int n = 4;
// outer loop
for(int i=1;i<=n;i++) {
    // inner loop----> space print
    for(int j = 1;j<=n-i;j++) {
        System.out.print(" ");
}
    // inner loop ----> star print
    for(int j=1;j<=i;j++) {
    System.out.print("*");
}
System.out.println();
}
*/


// Q.6 Number print in pyramid.

/* 
int n = 5;

for( int i =1;i<=n;i++) {
    for(int j=1;j<=i;j++) {
        System.out.print(j +" ");
    }
    System.out.println();
}
*/

// Q 7. Number print in pyramid. inverted
/* 
int n=5;
for(int i=1;i<=n;i++) {
    for(int j=1;j<=n-i+1;j++) {
    System.out.print(j+" ");
} 
 System.out.println();
}
*/


// Q8. floyd's Triangle 

/* 
int n=5;
int number =1;

// outer loop
for(int i=1;i<=n;i++) {
    // inner loop
    for(int j=1;j<=i;j++) {
        System.out.print(number+" ");
        number++;      // number = number+1
    } System.out.println();
}
    */

// Q9. 0-1 Triangle


/* 

    int n=5;
// outer loop
    for(int i=1;i<=n;i++) {
// inner loop
    for(int j=1;j<=i;j++) {
    int sum = i+j;
        if(sum%2==0) { //even
            System.out.print("1");
        } else { //odd
            System.out.print("0");
        }
    } 
        System.out.println();
}

*/

}
}

