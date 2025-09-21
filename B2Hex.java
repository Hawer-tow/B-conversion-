// B2Hex uses queue2.java

import java.util.ArrayList;
import java.util.Collections;


public class B2Hex {

  static ArrayList<String> chunks = new ArrayList<>();
  static ArrayList<String> groups = new ArrayList<>();
  static Queue2 myqueue1 = new Queue2(20);
  static Queue2 myqueue2 = new Queue2(20);

public static void groupings(String a)
{
    String value = a;

       // Split from the end into groups of 4
        for (int i = value.length(); i > 0; i -= 4) {
            int start = Math.max(i - 4, 0);
            String chunk = value.substring(start, i);

            // Pad the first (leftmost) chunk if it's less than 4
            if (chunk.length() < 4) {
                chunk = String.format("%4s", chunk).replace(' ', '0');
            }

            groups.add(chunk);
        }

        // Reverse to restore left-to-right order
        Collections.reverse(groups);

        // Output the result
        //System.out.println(groups);
        for (int i = 0; i < groups.size(); i++)
         {
             //System.out.println(groups.get(i));
             String x = groups.get(i);
            // System.out.println(x + x.getClass().getSimpleName() );

if (x.equals("0000"))
{
     myqueue1.enqueue(0);
}
else if (x.equals("0001"))
{
     myqueue1.enqueue(1);
}
else if (x.equals("0010"))
{
     myqueue1.enqueue(2);
}
else if (x.equals("0011"))
{
     myqueue1.enqueue(3);
}
else if (x.equals("0100"))
{
     myqueue1.enqueue(4);
}
else if (x.equals("0101"))
{
     myqueue1.enqueue(5);
}
else if (x.equals("0110"))
{
     myqueue1.enqueue(6);
}
else if (x.equals("0111"))
{
     myqueue1.enqueue(7);
}
else if (x.equals("1000"))
{
     myqueue1.enqueue(8);
}
else if (x.equals("1001"))
{
     myqueue1.enqueue(9);
}
else if (x.equals("1010"))
{
     myqueue1.enqueue(10);
}
else if (x.equals("1011"))
{
     myqueue1.enqueue(11);
}
else if (x.equals("1100"))
{
     myqueue1.enqueue(12);
}
else if (x.equals("1101"))
{
     myqueue1.enqueue(13);
}
else if (x.equals("1110"))
{
     myqueue1.enqueue(14);
}
else if (x.equals("1111"))
{
     myqueue1.enqueue(15);
}

} 
}
public static void printhex(String a){

   // System.out.println("The Hexadecimal equivalent of " + a + " is :");
     myqueue1.display();
     //System.out.println(); 
}




public static void fracgroupings(String a){

    String value = a;


// Pad to make length a multiple of 4
int padLength = 4 - (value.length() % 4);
if (padLength != 4) {
    value = value + "0".repeat(padLength); // Pad at the beginning
}

for (int i = 0; i < value.length(); i += 4) {
    chunks.add(value.substring(i ,i + 4));
}

  //System.out.println(chunks); // Output: [1011, 1000]

       
        for (int i = 0; i < chunks.size(); i++)
         {
             //System.out.println(chunks.get(i));
             String x = chunks.get(i);
            // System.out.println(x + x.getClass().getSimpleName() );

if (x.equals("0000"))
{
     myqueue2.enqueue(0);
}
else if (x.equals("0001"))
{
     myqueue2.enqueue(1);
}
else if (x.equals("0010"))
{
     myqueue2.enqueue(2);
}
else if (x.equals("0011"))
{
     myqueue2.enqueue(3);
}
else if (x.equals("0100"))
{
     myqueue2.enqueue(4);
}
else if (x.equals("0101"))
{
     myqueue2.enqueue(5);
}
else if (x.equals("0110"))
{
     myqueue2.enqueue(6);
}
else if (x.equals("0111"))
{
     myqueue2.enqueue(7);
}
else if (x.equals("1000"))
{
     myqueue2.enqueue(8);
}
else if (x.equals("1001"))
{
     myqueue2.enqueue(9);
}
else if (x.equals("1010"))
{
     myqueue2.enqueue(10);
}
else if (x.equals("1011"))
{
     myqueue2.enqueue(11);
}
else if (x.equals("1100"))
{
     myqueue2.enqueue(12);
}
else if (x.equals("1101"))
{
     myqueue2.enqueue(13);
}
else if (x.equals("1110"))
{
     myqueue2.enqueue(14);
}
else if (x.equals("1111"))
{
     myqueue2.enqueue(15);
}

} 

}
public static void printfrachex(String a){

     //System.out.println("The Hexadecimal equivalent of " + a + " is :");
     myqueue2.display();
     //System.out.println(); 

}




    public static void main(String[] args) {

        ArrayList<String> fracChunks = new ArrayList<>();

        String binary = "10111.111011";
        String[] parts = binary.split("\\.");

        String intPart = parts[0];       // "10111"
        String fracPart = parts[1]; 

        
        
        groupings(parts[0]);
        fracgroupings(parts[1]);

        System.out.println("The Hexadecimal equivalent of " + binary + " is : ");
        printhex(parts[0]);
        System.out.print(".");
        printfrachex(parts[1]);

        System.out.println("\n");



        

        

}
}
