package com.example.myconversions;

// D2B_by2

public class D2B_by2{



    //static Stack mystack = new Stack(32);
    //static Queue myqueue = new Queue(20);


    public static void divide(int a , Stack mystack)
    {

        int value = a;


        if (value == 0)
        {
            return ;
        }
        else {
            int remainder = value % 2;
            int pass = (value - remainder) / 2;
            mystack.push(remainder);
            divide(pass, mystack);
        }
    }
    public static void printstack(int a , Stack mystack)
    {
        //System.out.println("The binary equivalent of " + a + " is :");
        while (!mystack.isEmpty())
        {

            System.out.print( mystack.pop() +"");
        }
        // System.out.println();
    }



    // fractional part of the double decimal.

    public static void mupltiply(double a , Queue myqueue){
        double value = a;
        double fracprodt= value * 2;
        if(fracprodt == 0)
        {
            return;
        }
        else {
            double pass = fracprodt - (int) fracprodt;
            myqueue.enqueue((int) fracprodt);
            mupltiply(pass, myqueue);
        }


    }
    public static void printqueue(double a , Queue myqueue){
        //System.out.println("The binary equivalent of " + a + " is :");
        if (!myqueue.isEmpty())
        {

            myqueue.display();

        }

        System.out.println();
    }


    public static void main(String[] args){







    }

}





