// D2Hex uses stack and queue2;


public class D2Hex {


  
    static Stack mystack = new Stack(30);
    static Queue2 myqueue = new Queue2(20);


public static void divide(int a)
{
        
    int value = a;  

         if (value == 0)
            {
             return ;
            }
        int remainder = value%16;
       // System.out.println(remainder);
         mystack.push(remainder);
        int pass = (value-remainder)/16;
       
        divide(pass);
}  
public static void printstack(int a)
{ 

    //System.out.println("The binary equivalent of " + a + " is :");
    
    

     while (!mystack.isEmpty())
                   {
                    //System.out.print(mystack.pop() +"");
                    int y = mystack.pop();
                             
             
            if( y == 10)
            {
                System.out.print("A");
            }
            else if (y == 11)
            {
                System.out.print("B");
            }
            else if (y == 12)
            {
                System.out.print("C");
            }
            else if (y == 13)
            {
                System.out.print("D");
            }
            else if (y == 14)
            {
                System.out.print("E");
            }
            else if (y == 15)
            {
                System.out.print("F");
            } 
            else
            {

                System.out.print(y);

            } 
            
            }
              

}



   // fractional part of the double decimal.

public static void mupltiply(double a){
double value = a;
double fracprodt= value * 16;
        if(fracprodt == 0)
        {
            return;
        }

        double pass = fracprodt - (int)fracprodt;
        myqueue.enqueue((int)fracprodt);
        mupltiply(pass);



}
public static void printqueue(double a){
      //System.out.println("The binary equivalent of " + a + " is :");
         
     myqueue.display();
    
        System.out.print(""); 
} 


public static void main(String[] args){

 double decimal = 229.125 ;
 


double integerPart = Math.floor(decimal);
double fractionalPart = decimal - integerPart;





divide((int)integerPart);
mupltiply(fractionalPart);



System.out.println("The Hexadecimal equivalent of " + decimal + " is : \n");
printstack((int)integerPart);
System.out.print(".");
printqueue(fractionalPart);

System.out.println("\n");
 
  


}

}




