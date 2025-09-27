package com.example.myconversions;

// O2Hex

import java.util.ArrayList;
import java.util.Collections;


public class O2Hex {

//    static ArrayList<String> chunks = new ArrayList<>();
//    static ArrayList<String> groups = new ArrayList<>();


    public static void inthex(String a ,ArrayList<String> groups,ArrayList<String> groups2 , Queue2 myqueue1)
    {
        String value = a;
        String finalout ="";

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
        Collections.reverse(groups);

        // Output the result
        //System.out.println(groups);
        for (int i = 0; i < groups.size(); i++)
        {
            //System.out.println(groups.get(i));

            String x = groups.get(i);
            // System.out.println(x + x.getClass().getSimpleName() );

            if (x.equals("0"))
            {
                String y = "000";
                finalout += y;
            }
            else if (x.equals("1"))
            {
                String y ="001";
                finalout += y;
            }
            else if (x.equals("2"))
            {
                String y ="010";
                finalout += y;
            }
            else if (x.equals("3"))
            {
                String y ="011";
                finalout += y;
            }
            else if (x.equals("4"))
            {
                String y ="100";
                finalout += y;
            }
            else if (x.equals("5"))
            {
                String y ="101";
                finalout += y;
            }
            else if (x.equals("6"))
            {
                String y ="110";
                finalout += y;
            }
            else if (x.equals("7"))
            {
                String y ="111";
                finalout += y;
            }

//System.out.println(finalout);
        }
        B2Hex.groupings(finalout,groups2, myqueue1);
    }



    public static void frachex(String a ,ArrayList<String> chunks ,ArrayList<String> chunks2 ,Queue2 myqueue2){

        String value = a;
        String finalout= "";

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
            // System.out.println(x + x.getClass().getSimpleName() );

            if (x.equals("0"))
            {
                String y = "000";
                finalout += y;
            }
            else if (x.equals("1"))
            {
                String y ="001";
                finalout += y;
            }
            else if (x.equals("2"))
            {
                String y ="010";
                finalout += y;
            }
            else if (x.equals("3"))
            {
                String y ="011";
                finalout += y;
            }
            else if (x.equals("4"))
            {
                String y ="100";
                finalout += y;
            }
            else if (x.equals("5"))
            {
                String y ="101";
                finalout += y;
            }
            else if (x.equals("6"))
            {
                String y ="110";
                finalout += y;
            }
            else if (x.equals("7"))
            {
                String y ="111";
                finalout += y;
            }

//System.out.println(finalout);


        }
        B2Hex.fracgroupings(finalout,chunks2,myqueue2);
    }



    public static void main(String[] args) {





    }
}

