package com.example.myconversions;

public class B2D{



    // first  loop
    public static int  dinteger(int ifloat){
        int i = -1;
        int isum = 0;
        while (ifloat > 0) {



            int digit = ifloat % 10;        // Get the last digit

            //System.out.print(digit + " ");  // Print it
            ifloat /= 10; // Remove the last digit
            i ++;
            if (digit == 0)
            {
                continue;
            }
            else if (digit == 1)
            {
                double binvalue = Math.pow(2, i);
                isum += (int)binvalue;

            }
            else
            {break;}

        } // System.out.println(isum);
        return isum;
    }


    // Second for loop

    // Split the number into two parts: before and after the decimal
    public static double dfraction(float number){
        String[] parts2 = String.valueOf(number).split("\\.");
        float dsum = 0;
        if (parts2.length > 1) {

            // float dsum = 0;
            String decimalPart = parts2[1]; // Get digits after the decimal
            for (int j = 0; j < decimalPart.length(); j++)
            {
                char digitChar = decimalPart.charAt(j);
                int digit = Character.getNumericValue(digitChar);
                // System.out.print(digit + " ");

                if (digit == 0)
                {
                    continue;
                }
                else if (digit == 1)
                {
                    int x = (-1 * (j+1));
                    double binvalue = Math.pow(2, x);
                    dsum += (float) binvalue;
                }
                else if (digit > 1)
                {
                    break;}

            }
            // System.out.println(dsum);
        } return dsum;
    }


    public static void main(String[] args){




    }}
