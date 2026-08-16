import java.util.*;
public class Stringbuilders {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("ajay");
        System.out.println(sb);

    /* 
    //char at Index 0
        System.out.println(sb.charAt(0));


    //set char at index 0      ye char ko rplace karne ke liye hota hai 
    sb.setCharAt(0,'p'); // yaha pe hum a ko hata ke p likh rhe hai i mean rplace kjar rhe hai
    System.out.println(sb);
    */

// insert      ye 0 index pe replace ho kar or jo 0 pe tha usse 1-1 index shift kar deta hai OR beech me bhi likh skte hai

/*
sb.insert(0,'S');
 System.out.println(sb);
*/ 


//.delete   ye kisi bhi sentence se kisi bhi word ko delete kar skte hai. jaise ajay se maine a hata diya .....

/*
sb.delete(0,1);
System.out.println(sb);

*/

// .append       ye kisi bhi word me jodta hai .

/*
sb.append("a");   // ajay+ "a";
sb.append("y");   // ajaya+ "y";
System.out.println(sb.length());
*/



// Q. revers system

/*
sb.reverse();
System.out.println(sb);
*/


for(int i=0;i<sb.length()/2;i++){
    int front = i;
    int back = sb.length() - 1 - i ;   // 4-1-0 
    char frontChar=sb.charAt(front);
    char backChar=sb.charAt(back);

    sb.setCharAt(front,backChar);
    sb.setCharAt(back,frontChar);
} 
System.out.println(sb);











    }
    
}
