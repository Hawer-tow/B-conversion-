package com.example.myconversions;

// D2O_by8
public class D2O_by8{



    //static Stack mystack = new Stack(32);
    //static Queue myqueue = new Queue(20);


    public static void divide(int a , Stack mystack)
    {

        int value = a;


        if (value == 0)
        {
            return ;
        }
        int remainder = value%8;
        int pass = (value-remainder)/8;
        mystack.push(remainder);
        divide(pass,mystack);
    }
    public static void printstack(int a , Stack mystack)
    {
        //System.out.println(" The binary equivalent of " + a + " is :");
        while (!mystack.isEmpty())
        {

            System.out.print( mystack.pop() +"");
        }
        // System.out.println();
    }



    // fractional part of the double decimal.

    public static void mupltiply(double a , Queue myqueue){
        double value = a;
        double fracprodt= value * 8;
        if(fracprodt == 0)
        {
            return;
        }

        double pass = fracprodt - (int)fracprodt;
        myqueue.enqueue((int)fracprodt);
        mupltiply(pass,myqueue);



    }
    public static void printqueue(double a , Queue myqueue){
        //System.out.println("The binary equivalent of " + a + " is :");

        if (!myqueue.isEmpty())
        {

            myqueue.display();

        }


    }


    public static void main(String[] args){







    }

}





