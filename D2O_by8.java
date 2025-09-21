// D2O_by8
public class D2O_by8{


  
    static Stack mystack = new Stack(32);
    static Queue myqueue = new Queue(20);


public static void divide(int a)
{
        
    int value = a;
  

         if (value == 0)
            {
             return ;
            }
        int remainder = value%8;
        int pass = (value-remainder)/8;
        mystack.push(remainder);
        divide(pass);
}  
public static void printstack(int a)
{       
    //System.out.println("The binary equivalent of " + a + " is :");
     while (!mystack.isEmpty())
            {
            
            System.out.print( mystack.pop() +"");
            }
           // System.out.println();
}



   // fractional part of the double decimal.

public static void mupltiply(double a){
double value = a;
double fracprodt= value * 8;
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
    
        System.out.println(); 
} 


public static void main(String[] args){

 double decimal = 175.15 ;
 


double integerPart = Math.floor(decimal);
double fractionalPart = decimal - integerPart;

divide((int)integerPart);
mupltiply(fractionalPart);



System.out.println("The Octal equivalent of " + decimal + " is :");
printstack((int)integerPart);
printqueue(fractionalPart);

 
  


}

}




