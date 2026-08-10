import java.util.*;
public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        /*
        String declaration ---->
        String name = ajay
        String fulname = Ajay yadav
        String sentence = "My namne is Ajay yadav"
          */

// String name = sc.next();                           ye sirf single ke liye hai , agr puri line input leni hai to nextLine ka use krenge  


//    String name = sc.nextLine();                         // ye puri line ke liye hai
//    System.out.println("Your Name is  "+name);


// concatenation   Do stings ko jodnne ke liye

/* 
String firstName = "Ajay";
String lastName = "Yadav";
String fulName = firstName +" "+lastName;
System.out.println(fulName);
*/


// length 

/*
String firstName = "Ajay";
String lastName = "Yadav";
String fulName = firstName +" "+lastName;
System.out.println(fulName.length());      // ajay yadav total 9 hai or space ko lekar 10 length hai
*/



//charAt    ye sare charecter ko 1-1 karke print karta hai for ex- A j a y 

/* 
String firstName = "Ajay";
String lastName = "Yadav";
String fulName = firstName +" "+lastName;
System.out.println(fulName.length());

for (int i=0;i<fulName.length();i++) {
    System.out.println(fulName.charAt(i));
}
    */


// compare          ye pe two string ko compare karewnge

// String name1 = "Ajay";
// String name2 = "Ajay";

// String name1 = sc.nextLine();
// String name2 = sc.nextLine();

// 1 s1 > s2 : +ve value
// 2 s1 == s2 : 0
// 3 s1 < s2  : -ve value

// name ke accending orser me char ko compare krte hai jo char badihoti hai vo bada hota hai


/* 
if(name1.compareTo(name2)==0) {     // == function isliye nhi use kiye kyuki kabhi kabhi == fail hon jata hai to compareTo use kr rhe h
System.out.println("String are equal");
}
else {
    System.out.println("String are not equal");
}
*/

// substring          // kisi bhi sentence se kisi particular word ko nikalne ke liye use krte hai .

String sentence = "My name is ajay yadav";      // substring(beginIndex , end Index);
String name = sentence.substring(11,sentence.length()); 
System.out.println(name);

  }
}



// Strings are Imutable      ek baar memory ke ander string bana di to ab usse change nahi kar skte