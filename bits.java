import java.util.*;
public class bits {
    public static void main(String args[]) {
      
      
      /* 
    // Git Bit  
    
        int n=5;                              // copy page no. 22
        int pos = 2;  //pos=postion
       int bitMask = 1<<pos;

       if((bitMask & n)==0) {
        System.out.println("Bit was zero");
       }
       else {
        System.out.println("Bit was one");
       }
   
    */


/* 

// Set Bit

        int n=5;                              
        int pos = 1;  
        int bitMask = 1<<pos;

    int newNumber = bitMask | n;
    System.out.println(newNumber);  
     */

// clear bit         kisi bhi bit ko 1 se zero karne ke liye mtlb bit ko clear karna


/*
        int n=5;                              
        int pos = 2;  
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

    int newNumber = notBitMask & n;
    System.out.println(newNumber);
*/

// update bit


        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 : set  oper=0 : clear
        int n=5;           //0101 --> 0111 = 7         
        int pos = 1;
        int Oper = 1;      // update bit to 1 else update bit to 0

        int bitMask = 1<<pos;  
       if(Oper==1) {
       // set
 
        int newNumber = bitMask | n;
        System.out.println(newNumber);
      }
        else {
    // clear
        int notBitMask = ~(bitMask);

    int newNumber = notBitMask & n;
    System.out.println(newNumber);


        }
       
        

    }
    
}




