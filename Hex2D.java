// Hex2D

import java.util.ArrayList;
import java.util.Collections;


public class Hex2D {

  static ArrayList<String> chunks = new ArrayList<>();
  static ArrayList<String> groups = new ArrayList<>();

public static double inthex(String b)
{
    String value = b;
    double sum1 = 0;

       // Split from the end into groups of 4
        for (int i = value.length(); i > 0; i -= 1) {
            int start = Math.max(i - 1, 0);
            String chunk = value.substring(start, i);

            // Pad the first (leftmost) chunk if it's less than 4
            if (chunk.length() < 1) {
                chunk = String.format("1s", chunk).replace(' ', '0');
            }

            groups.add(chunk);
        }

        // Reverse to restore left-to-right order
        //Collections.reverse(groups);

        // Output the result
        //System.out.println(groups);
        for (int i = 0; i < groups.size(); i++)
         {
             //System.out.println(groups.get(i));
               
             String x = groups.get(i);
             int a;
             double y;
            // System.out.println(x + x.getClass().getSimpleName() );

if (x.equals("0"))
{
    a = 0;
    y = Math.pow(16, i);  
    sum1 += (y * a);   
}
else if (x.equals("1"))
{
     a = 1;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("2"))
{
    a = 2;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("3"))
{
     a = 3;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("4"))
{
      a = 4;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("5"))
{ 
     a = 5;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("6"))
{
     a = 6;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("7"))
{
    a = 7;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("8"))
{
      a = 8;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("9"))
{
      a = 9;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("A"))
{
      a = 10;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("B"))
{
     a = 11;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("C"))
{
     a = 12;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("D"))
{
      a = 13;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("E"))
{
      a = 14;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
else if (x.equals("F"))
{
      a = 15;
    y = Math.pow(16, i);  
    sum1 += (y * a); 
}
 //System.out.println(sum1);
}
return sum1;
}



public static double frachex(String b){

    String value = b;  
    double sum2 = 0;

// Pad to make length a multiple of 4
int padLength = 1 - (value.length() % 1);
if (padLength != 1) {
    value = value + "0".repeat(padLength); // Pad at the beginning
}

for (int i = 0; i < value.length(); i += 1) {
    chunks.add(value.substring(i ,i +1));
}

  //System.out.println(chunks); // Output: [1011, 1000]

       
        for (int i = 0; i < chunks.size(); i++)
         {
             //System.out.println(chunks.get(i));
             String x = chunks.get(i);
              int a;
              double y;
              int j = (i+1) * -1;
            // System.out.println(x + x.getClass().getSimpleName() );
if (x.equals("0"))
{
    a = 0;

    y = Math.pow(16, j);  
    sum2 += (y * a);   
}
else if (x.equals("1"))
{
     a = 1;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("2"))
{
    a = 2;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("3"))
{
     a = 3;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("4"))
{
      a = 4;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("5"))
{ 
     a = 5;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("6"))
{
     a = 6;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("7"))
{
    a = 7;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("8"))
{
      a = 8;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("9"))
{
      a = 9;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("A"))
{
      a = 10;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("B"))
{
     a = 11;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("C"))
{
     a = 12;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("D"))
{
      a = 13;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}
else if (x.equals("E"))
{
      a = 14;
    y = Math.pow(16, (-i+1));  
    sum2 += (y * a); 
}
else if (x.equals("F"))
{
      a = 15;
    y = Math.pow(16, j);  
    sum2 += (y * a); 
}


//System.out.println(fi);


} 
return sum2;
}



    public static void main(String[] args) {

        ArrayList<String> fracChunks = new ArrayList<>();

        String hex = "E5.2";
        String[] parts = hex.split("\\.");

        String intPart = parts[0];       // "10111"
        String fracPart = parts[1]; 
         double finalsum ;
        

        System.out.println("The Decimal equivalent of " + hex + " is : ");
        

        finalsum = (inthex(parts[0]) + frachex(parts[1]));
        System.out.println(finalsum); 

        System.out.println("\n");



        

        

}
}
