package com.example.myconversions;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;


import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    TextView top;
    private RadioGroup radioGroup;
    private Button submitButton;
    EditText inputText;
    Button cancelButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        top = findViewById(R.id.dynamictxt);
        inputText = findViewById(R.id.input);
        radioGroup = findViewById(R.id.radioGroup);
        submitButton = findViewById(R.id.button);
        cancelButton = findViewById(R.id.cancel);



        cancelButton.setOnClickListener(v -> {
            inputText.setText("");      // Clear input field
            String cancelledtop ="Solution Pad";
            top.setText(cancelledtop);

            //boolean isReadyToExecute = true;

            Toast.makeText(this, "Reset complete. Ready for new input.", Toast.LENGTH_SHORT).show();


        });











        submitButton.setOnClickListener(v -> {





            try {

                String Input = inputText.getText().toString().trim().toUpperCase();


                if (
                        !Input.matches("[0-9A-F.]+") ||
                                Input.contains("..") ||
                                Input.startsWith(".") ||
                                Input.endsWith(".") ) {

                    throw new IllegalArgumentException("Invalid input");
                }
                String[] fparts = Input.split("\\.");
                for(String part : fparts)
                {
                    if (!part.matches("[0-9A-F]+"))
                    {
                        throw new IllegalArgumentException("Invalid Input");
                    }
                }

                String userInput = inputText.getText().toString().trim().toUpperCase();



                int intpart = 0;
                float floatinput =0 ;
                double doubleinput = 0;

                if (!Input.matches(".*[A-Fa-f].*")) {

                    intpart = Integer.parseInt(userInput.split("\\.")[0]);
                    String[] ffparts = Input.split("\\.");
                    if (ffparts.length > 1 && !ffparts[1].isEmpty()) {
                        String frac = ffparts[1];
                        double fracval = Double.parseDouble(frac);
                        doubleinput = fracval / Math.pow(10, frac.length());
                        floatinput = (float) doubleinput;
                    } else {
                        floatinput = 0;
                        doubleinput = 0;
                    }
                }
                else
                {
                    intpart = Integer.parseInt(userInput.split("\\.")[0] , 16 );
                    String[] ffparts = Input.split("\\.");
                    if (ffparts.length > 1 && !ffparts[1].isEmpty()) {
                        String frac = ffparts[1];
                        int int2 = Integer.parseInt(ffparts[1],16);
                        double fracval = (double) int2;


                        doubleinput = fracval / Math.pow(10, frac.length());
                        floatinput = (float) doubleinput;
                    } else {
                        floatinput = 0;
                        doubleinput = 0;
                    }
                }




                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId != -1) {
                    RadioButton selectedRadioButton = findViewById(selectedId);
                    String selectedText = selectedRadioButton.getText().toString();

                    Toast.makeText(MainActivity.this,
                            "Selected: " + selectedText,
                            Toast.LENGTH_SHORT).show();

                    // You can also add custom logic here based on the selected option
                    if (selectedId == R.id.radioButton) {
                        //float binary = floatinput;
                        //int ifloat = (int) floatinput;


                        double inter = (double)  B2D.dinteger(intpart) ;
                        double fracter = (double)  B2D.dfraction(floatinput);


                        double solution = inter + fracter;
                        String solution2 = String.valueOf(solution);


                        top.setText(solution2);

                    } else if (selectedId == R.id.radioButton2) {
                        //double decimal = doubleinput;
                        //double integerPart = Math.floor(doubleinput);(int) integerPart
                        //double fractionalPart = doubleinput - integerPart;

                        Stack mystack = new Stack(32);
                        Queue myqueue = new Queue(20);

                        D2B_by2.divide(intpart,mystack);
                        D2B_by2.mupltiply(doubleinput,myqueue);

                        //System.out.println("The Binary equivalent of " + decimal + " is :");


                        //dynamictxt
                        //TextView textView = findViewById(R.id.dynamictxt);
                        // Step 1: Redirect System.out
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        PrintStream printStream = new PrintStream(outputStream);
                        System.setOut(printStream);
                        // Step 2: Call both methods
                        D2B_by2.printstack(intpart,mystack);
                        D2B_by2.printqueue(doubleinput,myqueue);
                        // Step 3: Get combined output
                        String combinedOutput = outputStream.toString();
                        // Step 4: Display in TextView
                        top.setText(combinedOutput);


                    } else if (selectedId == R.id.radioButton3) {

                        // float octal = floatinput;
                        //int ifloat = (int) floatinput;


                        double inter = O2D.dinteger(intpart);
                        double fracter = O2D.dfraction(floatinput);
                        double solution = inter + fracter;

                        //System.out.println("The Decimal equivalent of " + octal + " is : ");
                        System.out.println(solution);

                        String solution2 = String.valueOf(solution);

                        top.setText(solution2);


                    } else if (selectedId == R.id.radioButton4) {
                        //double decimal = doubleinput;
                        //double integerPart = Math.floor(doubleinput);(int) integerPart
                        //double fractionalPart = doubleinput - integerPart;

                        Stack mystack = new Stack(32);
                        Queue myqueue = new Queue(20);

                        D2O_by8.divide(intpart,mystack);
                        D2O_by8.mupltiply(doubleinput,myqueue);

                        //System.out.println("The  Octal equivalent of " + decimal + " is :");

                        //TextView textView = findViewById(R.id.dynamictxt);
                        // Step 1: Redirect System.out
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        PrintStream printStream = new PrintStream(outputStream);
                        System.setOut(printStream);
                        // Step 2: Call both methods
                        D2O_by8.printstack(intpart,mystack);
                        D2O_by8.printqueue(doubleinput,myqueue);
                        // Step 3: Get combined output
                        String combinedOutput = outputStream.toString();
                        // Step 4: Display in TextView
                        top.setText(combinedOutput);


                    } else if (selectedId == R.id.radioButton5) {

                        ArrayList<String> groups = new ArrayList<>();
                        ArrayList<String> chunks = new ArrayList<>();

                        //String octal = userInput;
                        String[] parts = userInput.split("\\.", 2);

                        String beforedecimal = parts.length > 0 ? parts[0] : "";
                        String afterdecimal = parts.length > 1 ? parts[1] : "";


                        //System.out.println("The Binary equivalent of " + octal + " is : ");
                        String str = (O2B.inthex(beforedecimal, groups) + "." + O2B.frachex(afterdecimal, chunks));

                        top.setText(str);


                    } else if (selectedId == R.id.radioButton6) {

                        ArrayList<String> chunks = new ArrayList<>();
                        ArrayList<String> groups = new ArrayList<>();
                        Queue3 myqueue1 = new Queue3(20);
                        Queue3 myqueue2 = new Queue3(20);

                        //String binary = userInput;
                        String[] parts = userInput.split("\\.", 2);

                        String beforedecimal = parts.length > 0 ? parts[0] : "";
                        String afterdecimal = parts.length > 1 ? parts[1] : "";


                        B2O.groupings(beforedecimal, groups, myqueue1);
                        B2O.fracgroupings(afterdecimal, chunks, myqueue2);

                        // System.out.println("The Octal equivalent of " + binary + " is : ");


                        //TextView textView = findViewById(R.id.dynamictxt);
                        // Step 1: Redirect System.out
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        PrintStream printStream = new PrintStream(outputStream);
                        System.setOut(printStream);
                        // Step 2: Call both methods
                        B2O.printhex(beforedecimal, myqueue1);
                        System.out.print(".");
                        B2O.printfrachex(afterdecimal, myqueue2);
                        // Step 3: Get combined output
                        String combinedOutput = outputStream.toString();
                        // Step 4: Display in TextView
                        top.setText(combinedOutput);

                    } else if (selectedId == R.id.radioButton7) {

                        ArrayList<String> chunks = new ArrayList<>();
                        ArrayList<String> groups = new ArrayList<>();
                        //String hex = userInput;
                        String[] parts = userInput.split("\\.", 2);

                        String beforedecimal = parts.length > 0 ? parts[0] : "";
                        String afterdecimal = parts.length > 1 ? parts[1] : "";


                        double finalsum;


                        //System.out.println("The Decimal equivalent of " + hex + " is : ");


                        finalsum = (Hex2D.inthex(beforedecimal, groups) + Hex2D.frachex(afterdecimal, chunks));
                        //System.out.println(finalsum);

                        String solution = String.valueOf(finalsum);
                        top.setText(solution);
                    } else if (selectedId == R.id.radioButton8) {

                        Stack mystack = new Stack(30);
                        Queue2 myqueue = new Queue2(20);
                        //double decimal = doubleinput;

                        //double integerPart = Math.floor(doubleinput);(int) integerPart
                        //double fractionalPart = doubleinput - integerPart;

                        D2Hex.divide(intpart , mystack);
                        D2Hex.mupltiply(doubleinput, myqueue);

                        //System.out.println("The Hexadecimal equivalent of " + decimal + " is : \n");


                        //TextView textView = findViewById(R.id.dynamictxt);
                        // Step 1: Redirect System.out
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        PrintStream printStream = new PrintStream(outputStream);
                        System.setOut(printStream);
                        // Step 2: Call both methods
                        D2Hex.printstack(intpart , mystack);
                        System.out.print(".");
                        D2Hex.printqueue(doubleinput , myqueue);
                        // Step 3: Get combined output
                        String combinedOutput = outputStream.toString();
                        // Step 4: Display in TextView
                        top.setText(combinedOutput);
                    } else if (selectedId == R.id.radioButton9) {

                        ArrayList<String> chunks = new ArrayList<>();
                        ArrayList<String> groups = new ArrayList<>();
                        //String hex = userInput;
                        String[] parts = userInput.split("\\.", 2);

                        String beforedecimal = parts.length > 0 ? parts[0] : "";
                        String afterdecimal = parts.length > 1 ? parts[1] : "";


                        //System.out.println("The Binary equivalent of " + hex + " is : ");


                        String str = (Hex2B.inthex(beforedecimal, groups) + "." + Hex2B.frachex(afterdecimal, chunks));


                        //String solution = String.valueOf(finalsum);
                        top.setText(str);
                    } else if (selectedId == R.id.radioButton10) {

                        ArrayList<String> chunks = new ArrayList<>();
                        ArrayList<String> groups = new ArrayList<>();
                        Queue2 myqueue1 = new Queue2(20);
                        Queue2 myqueue2 = new Queue2(20);
                        // String binary = userInput;
                        String[] parts = userInput.split("\\.", 2);

                        String beforedecimal = parts.length > 0 ? parts[0] : "";
                        String afterdecimal = parts.length > 1 ? parts[1] : "";


                        B2Hex.groupings(beforedecimal, groups, myqueue1);
                        B2Hex.fracgroupings(afterdecimal, chunks, myqueue2);

                        //System.out.println("The Hexadecimal equivalent of " + binary + " is : ");


                        //TextView textView = findViewById(R.id.dynamictxt);
                        // Step 1: Redirect System.out
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        PrintStream printStream = new PrintStream(outputStream);
                        System.setOut(printStream);
                        // Step 2: Call both methods
                        B2Hex.printhex(beforedecimal, myqueue1);
                        System.out.print(".");
                        B2Hex.printfrachex(afterdecimal, myqueue2);
                        // Step 3: Get combined output
                        String combinedOutput = outputStream.toString();
                        // Step 4: Display in TextView
                        top.setText(combinedOutput);
                    } else if (selectedId == R.id.radioButton11) {

                        ArrayList<String> chunks = new ArrayList<>();
                        ArrayList<String> groups = new ArrayList<>();
                        ArrayList<String> chunks2 = new ArrayList<>();
                        ArrayList<String> groups2 = new ArrayList<>();
                        Queue3 myqueue1 = new Queue3(20);
                        Queue3 myqueue2 = new Queue3(20);
                        // String hex = userInput;
                        String[] parts = userInput.split("\\.", 2);

                        String beforedecimal = parts.length > 0 ? parts[0] : "";
                        String afterdecimal = parts.length > 1 ? parts[1] : "";

                        Hex2O.inthex(beforedecimal, groups, groups2, myqueue1);
                        Hex2O.frachex(afterdecimal, chunks, chunks2, myqueue2);

                        //System.out.println("The Octal equivalent of " + hex + " is : \n");


                        //TextView textView = findViewById(R.id.dynamictxt);
                        // Step 1: Redirect System.out
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        PrintStream printStream = new PrintStream(outputStream);
                        System.setOut(printStream);
                        // Step 2: Call both methods
                        B2O.printhex(userInput, myqueue1);
                        System.out.print(".");
                        B2O.printfrachex(userInput, myqueue2);
                        // Step 3: Get combined output
                        String combinedOutput = outputStream.toString();
                        // Step 4: Display in TextView
                        top.setText(combinedOutput);
                    } else if (selectedId == R.id.radioButton12) {

                        ArrayList<String> chunks = new ArrayList<>();
                        ArrayList<String> groups = new ArrayList<>();
                        ArrayList<String> chunks2 = new ArrayList<>();
                        ArrayList<String> groups2 = new ArrayList<>();
                        Queue2 myqueue1 = new Queue2(20);
                        Queue2 myqueue2 = new Queue2(20);
                        // String octal = userInput;
                        String[] parts = userInput.split("\\.", 2);

                        String beforedecimal = parts.length > 0 ? parts[0] : "";
                        String afterdecimal = parts.length > 1 ? parts[1] : "";


                        O2Hex.inthex(beforedecimal, groups, groups2, myqueue1);
                        O2Hex.frachex(afterdecimal, chunks, chunks2, myqueue2);

                        //System.out.println("The Hexadecimal equivalent of " + octal + " is : ");


                        //TextView textView = findViewById(R.id.dynamictxt);
                        // Step 1: Redirect System.out
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        PrintStream printStream = new PrintStream(outputStream);
                        System.setOut(printStream);
                        // Step 2: Call both methods
                        B2Hex.printhex(beforedecimal, myqueue1);
                        System.out.print(".");
                        B2Hex.printfrachex(afterdecimal, myqueue2);
                        // Step 3: Get combined output
                        String combinedOutput = outputStream.toString();
                        // Step 4: Display in TextView
                        top.setText(combinedOutput);
                    }

                } else {
                    Toast.makeText(MainActivity.this,
                            "Please select an option",
                            Toast.LENGTH_SHORT).show();
                }


            }
            catch (IllegalArgumentException e) {
                // Handle invalid input
                Toast.makeText( getApplicationContext(), "Error "+ e.getMessage() , Toast.LENGTH_SHORT).show();
            }
        });











    }







}



  

