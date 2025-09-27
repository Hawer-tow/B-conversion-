package com.example.myconversions;

// D2Hex uses stack and queue2;


public class D2Hex {



    //static Stack mystack = new Stack(30);
    //static Queue2 myqueue = new Queue2(20);


    public static void divide(int a , Stack mystack)
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

        divide(pass,mystack);
    }
    public static void printstack(int a , Stack mystack)
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

    public static void mupltiply(double a , Queue2 myqueue){
        double value = a;
        double fracprodt= value * 16;
        if(fracprodt == 0)
        {
            return;
        }

        double pass = fracprodt - (int)fracprodt;
        myqueue.enqueue((int)fracprodt);
        mupltiply(pass,myqueue);



    }
    public static void printqueue(double a , Queue2 myqueue){
        //System.out.println("The binary equivalent of " + a + " is :");

        myqueue.display();

        System.out.print("");
    }


    public static void main(String[] args){










    }

}





