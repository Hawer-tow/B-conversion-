// B2O  uses queue 3

import java.util.ArrayList;
import java.util.Collections;


public class B2O {

  static ArrayList<String> chunks = new ArrayList<>();
  static ArrayList<String> groups = new ArrayList<>();
  static Queue3 myqueue1 = new Queue3(20);
  static Queue3 myqueue2 = new Queue3(20);

public static void groupings(String a)
{
    String value = a;

       // Split from the end into groups of 4
        for (int i = value.length(); i > 0; i -= 3) {
            int start = Math.max(i - 3, 0);
            String chunk = value.substring(start, i);

            // Pad the first (leftmost) chunk if it's less than 4
            if (chunk.length() < 3) {
                chunk = String.format("%3s", chunk).replace(' ', '0');
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


if (x.equals("000"))
{
     myqueue1.enqueue(0);
}
else if (x.equals("001"))
{
     myqueue1.enqueue(1);
}
else if (x.equals("010"))
{
     myqueue1.enqueue(2);
}
else if (x.equals("011"))
{
     myqueue1.enqueue(3);
}
else if (x.equals("100"))
{
     myqueue1.enqueue(4);
}
else if (x.equals("101"))
{
     myqueue1.enqueue(5);
}
else if (x.equals("110"))
{
     myqueue1.enqueue(6);
}
else if (x.equals("111"))
{
     myqueue1.enqueue(7);
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
int padLength = 3 - (value.length() % 3);
if (padLength != 3) {
    value = value + "0".repeat(padLength); // Pad at the beginning
}

for (int i = 0; i < value.length(); i += 3) {
    chunks.add(value.substring(i ,i +3));
}

  //System.out.println(chunks); // Output: [1011, 1000]

       
        for (int i = 0; i < chunks.size(); i++)
         {
             //System.out.println(chunks.get(i));
             String x = chunks.get(i);
            // System.out.println(x + x.getClass().getSimpleName() );

if (x.equals("000"))
{
     myqueue2.enqueue(0);
}
else if (x.equals("001"))
{
     myqueue2.enqueue(1);
}
else if (x.equals("010"))
{
     myqueue2.enqueue(2);
}
else if (x.equals("011"))
{
     myqueue2.enqueue(3);
}
else if (x.equals("100"))
{
     myqueue2.enqueue(4);
}
else if (x.equals("101"))
{
     myqueue2.enqueue(5);
}
else if (x.equals("110"))
{
     myqueue2.enqueue(6);
}
else if (x.equals("111"))
{
     myqueue2.enqueue(7);
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

        System.out.println("The Octal equivalent of " + binary + " is : ");
        printhex(parts[0]);
        System.out.print(".");
        printfrachex(parts[1]);

        System.out.println("\n");



        

        

}
}
