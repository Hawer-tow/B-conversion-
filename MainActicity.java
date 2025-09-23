// MainActicity.java

package com.example.myconversions;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.myconversions.databinding.ActivityMainBinding;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    /*
    Button bone;
    Button btwo;
    TextView top;
    RadioButton rone;
    RadioButton rtwo;
    RadioButton rthree;
    RadioButton rfour;
    RadioButton rfive;
    RadioButton rsix;
    RadioButton rseven;
    RadioButton reight;
    RadioButton rnine;
    RadioButton rten;
    RadioButton releven;
    RadioButton rtwelve;

     */

    TextView top;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private RadioGroup radioGroup;
    private Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




/*
     rone = (RadioButton) findViewById(R.id.radioButton);
        rtwo = (RadioButton) findViewById(R.id.radioButton2);
        rthree = (RadioButton) findViewById(R.id.radioButton3);
        rfour = (RadioButton) findViewById(R.id.radioButton4);
        rfive = (RadioButton) findViewById(R.id.radioButton5);
        rsix = (RadioButton) findViewById(R.id.radioButton6);
        rseven = (RadioButton) findViewById(R.id.radioButton7);
        reight= (RadioButton) findViewById(R.id.radioButton8);
        rnine = (RadioButton) findViewById(R.id.radioButton9);
        rten = (RadioButton) findViewById(R.id.radioButton10);
        releven = (RadioButton) findViewById(R.id.radioButton11);
        rtwelve = (RadioButton) findViewById(R.id.radioButton12);

          bone = (Button) findViewById(R.id.button);
        btwo = (Button) findViewById(R.id.button2);

        top = (TextView) findViewById(R.id.dynamictxt);
 */


        top = (TextView) findViewById(R.id.dynamictxt);
        EditText inputText = findViewById(R.id.input);
        radioGroup = findViewById(R.id.radioGroup);
        submitButton = findViewById(R.id.button);
        Button cancelButton = findViewById(R.id.cancel);

        boolean isReadyToExecute = true;

        cancelButton.setOnClickListener(v -> {
            inputText.setText("");      // Clear input field
            top.setText("");   // Clear TextView

            Toast.makeText(this, "Reset complete. Ready for new input.", Toast.LENGTH_SHORT).show();


        });





        submitButton.setOnClickListener(w -> {

            try {
                String userInput = inputText.getText().toString().trim();
                // Convert to double
                double doubleinput = Double.parseDouble(userInput);
                // Convert to float
                float floatinput = Float.parseFloat(userInput);


                submitButton.setOnClickListener(v -> {
                    int selectedId = radioGroup.getCheckedRadioButtonId();

                    if (selectedId != -1) {
                        RadioButton selectedRadioButton = findViewById(selectedId);
                        String selectedText = selectedRadioButton.getText().toString();

                        Toast.makeText(MainActivity.this,
                                "Selected: " + selectedText,
                                Toast.LENGTH_SHORT).show();

                        // You can also add custom logic here based on the selected option
                        if (selectedId == R.id.radioButton) {
                            float binary = floatinput;
                            int ifloat = (int) binary;


                            double inter = B2D.dinteger(ifloat);
                            double fracter = B2D.dfraction(binary);


                            double solution = inter + fracter;
                            String solution2 = String.valueOf(solution);

                            System.out.println("The Decimal equivalent of " + binary + " is : ");
                            //System.out.println(solution);
                            top.setText(solution2);

                        } else if (selectedId == R.id.radioButton2) {
                            double decimal = doubleinput;
                            double integerPart = Math.floor(decimal);
                            double fractionalPart = decimal - integerPart;

                            D2B_by2.divide((int) integerPart);
                            D2B_by2.mupltiply(fractionalPart);

                            System.out.println("The Binary equivalent of " + decimal + " is :");


                            //dynamictxt
                            TextView textView = findViewById(R.id.dynamictxt);
                            // Step 1: Redirect System.out
                            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            PrintStream printStream = new PrintStream(outputStream);
                            System.setOut(printStream);
                            // Step 2: Call both methods
                            D2B_by2.printstack((int) integerPart);
                            D2B_by2.printqueue(fractionalPart);
                            // Step 3: Get combined output
                            String combinedOutput = outputStream.toString();
                            // Step 4: Display in TextView
                            textView.setText(combinedOutput);


                        } else if (selectedId == R.id.radioButton3) {

                            float octal = floatinput;
                            int ifloat = (int) octal;

//int beforeDecimal = parts[0].length();      // Digits before decimal
//int afterDecimal = parts[1].length();  // digits after the decimal

                            double inter = O2D.dinteger(ifloat);
                            double fracter = O2D.dfraction(octal);
                            double solution = inter + fracter;

                            System.out.println("The Decimal equivalent of " + octal + " is : ");
                            System.out.println(solution);

                            String solution2 = String.valueOf(solution);

                            top.setText(solution2);
                        } else if (selectedId == R.id.radioButton4) {
                            double decimal = doubleinput;
                            double integerPart = Math.floor(decimal);
                            double fractionalPart = decimal - integerPart;

                            D2O_by8.divide((int) integerPart);
                            D2O_by8.mupltiply(fractionalPart);

                            System.out.println("The Octal equivalent of " + decimal + " is :");


                            TextView textView = findViewById(R.id.dynamictxt);
                            // Step 1: Redirect System.out
                            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            PrintStream printStream = new PrintStream(outputStream);
                            System.setOut(printStream);
                            // Step 2: Call both methods
                            D2O_by8.printstack((int) integerPart);
                            D2O_by8.printqueue(fractionalPart);
                            // Step 3: Get combined output
                            String combinedOutput = outputStream.toString();
                            // Step 4: Display in TextView
                            textView.setText(combinedOutput);
                        } else if (selectedId == R.id.radioButton5) {

                            //ArrayList<String> fracChunks = new ArrayList<>();

                            String octal = userInput;
                            String[] parts = octal.split("\\.");

                            String intPart = parts[0];       // "10111"
                            String fracPart = parts[1];


                            System.out.println("The Binary equivalent of " + octal + " is : ");
                            String str = (O2B.inthex(parts[0]) + "." + O2B.frachex(parts[1]));
                            System.out.println(str);

                            //String solution2 = String.valueOf(solution);
                            top.setText(str);
                        } else if (selectedId == R.id.radioButton6) {
                            //ArrayList<String> fracChunks = new ArrayList<>();

                            String binary = userInput;
                            String[] parts = binary.split("\\.");

                            String intPart = parts[0];       // "10111"
                            String fracPart = parts[1];

                            B2O.groupings(parts[0]);
                            B2O.fracgroupings(parts[1]);

                            System.out.println("The Octal equivalent of " + binary + " is : ");
                            B2O.printhex(parts[0]);
                            System.out.print(".");
                            B2O.printfrachex(parts[1]);

                            TextView textView = findViewById(R.id.dynamictxt);
                            // Step 1: Redirect System.out
                            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            PrintStream printStream = new PrintStream(outputStream);
                            System.setOut(printStream);
                            // Step 2: Call both methods
                            B2O.printhex(parts[0]);
                            System.out.print(".");
                            B2O.printfrachex(parts[1]);
                            // Step 3: Get combined output
                            String combinedOutput = outputStream.toString();
                            // Step 4: Display in TextView
                            textView.setText(combinedOutput);

                        } else if (selectedId == R.id.radioButton7) {
                            String hex = userInput;
                            String[] parts = hex.split("\\.");

                            String intPart = parts[0];       // "10111"
                            String fracPart = parts[1];
                            double finalsum;


                            System.out.println("The Decimal equivalent of " + hex + " is : ");


                            finalsum = (Hex2D.inthex(parts[0]) + Hex2D.frachex(parts[1]));
                            System.out.println(finalsum);

                            String solution = String.valueOf(finalsum);
                            top.setText(solution);
                        } else if (selectedId == R.id.radioButton8) {
                            double decimal = doubleinput;

                            double integerPart = Math.floor(decimal);
                            double fractionalPart = decimal - integerPart;

                            D2Hex.divide((int) integerPart);
                            D2Hex.mupltiply(fractionalPart);

                            System.out.println("The Hexadecimal equivalent of " + decimal + " is : \n");
                            D2Hex.printstack((int) integerPart);
                            System.out.print(".");
                            D2Hex.printqueue(fractionalPart);

                            TextView textView = findViewById(R.id.dynamictxt);
                            // Step 1: Redirect System.out
                            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            PrintStream printStream = new PrintStream(outputStream);
                            System.setOut(printStream);
                            // Step 2: Call both methods
                            D2Hex.printstack((int) integerPart);
                            System.out.print(".");
                            D2Hex.printqueue(fractionalPart);
                            // Step 3: Get combined output
                            String combinedOutput = outputStream.toString();
                            // Step 4: Display in TextView
                            textView.setText(combinedOutput);
                        } else if (selectedId == R.id.radioButton9) {
                            String hex = userInput;
                            String[] parts = hex.split("\\.");

                            String intPart = parts[0];       // "10111"
                            String fracPart = parts[1];


                            System.out.println("The Binary equivalent of " + hex + " is : ");


                            String str = (Hex2B.inthex(parts[0]) + "." + Hex2B.frachex(parts[1]));
                            System.out.println(str);

                            //String solution = String.valueOf(finalsum);
                            top.setText(str);
                        } else if (selectedId == R.id.radioButton10) {
                            String binary = userInput;
                            String[] parts = binary.split("\\.");

                            String intPart = parts[0];       // "10111"
                            String fracPart = parts[1];

                            B2Hex.groupings(parts[0]);
                            B2Hex.fracgroupings(parts[1]);

                            System.out.println("The Hexadecimal equivalent of " + binary + " is : ");
                            B2Hex.printhex(parts[0]);
                            System.out.print(".");
                            B2Hex.printfrachex(parts[1]);

                            TextView textView = findViewById(R.id.dynamictxt);
                            // Step 1: Redirect System.out
                            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            PrintStream printStream = new PrintStream(outputStream);
                            System.setOut(printStream);
                            // Step 2: Call both methods
                            B2Hex.printhex(parts[0]);
                            System.out.print(".");
                            B2Hex.printfrachex(parts[1]);
                            // Step 3: Get combined output
                            String combinedOutput = outputStream.toString();
                            // Step 4: Display in TextView
                            textView.setText(combinedOutput);
                        } else if (selectedId == R.id.radioButton11) {
                            String hex = userInput;
                            String[] parts = hex.split("\\.");

                            String intPart = parts[0];       // "10111"
                            String fracPart = parts[1];

                            Hex2O.inthex(intPart);
                            Hex2O.frachex(fracPart);

                            System.out.println("The Octal equivalent of " + hex + " is : \n");


                            TextView textView = findViewById(R.id.dynamictxt);
                            // Step 1: Redirect System.out
                            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            PrintStream printStream = new PrintStream(outputStream);
                            System.setOut(printStream);
                            // Step 2: Call both methods
                            Hex2O.binary2octal.printhex(hex);
                            System.out.print(".");
                            Hex2O.binary2octal.printfrachex(hex);
                            // Step 3: Get combined output
                            String combinedOutput = outputStream.toString();
                            // Step 4: Display in TextView
                            textView.setText(combinedOutput);
                        } else if (selectedId == R.id.radioButton12) {
                            String octal = userInput;
                            String[] parts = octal.split("\\.");

                            String intPart = parts[0];       // "10111"
                            String fracPart = parts[1];

                            O2Hex.inthex(parts[0]);
                            O2Hex.frachex(parts[1]);

                            System.out.println("The Hexadecimal equivalent of " + octal + " is : ");


                            TextView textView = findViewById(R.id.dynamictxt);
                            // Step 1: Redirect System.out
                            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            PrintStream printStream = new PrintStream(outputStream);
                            System.setOut(printStream);
                            // Step 2: Call both methods
                            O2Hex.binary2hex.printhex(parts[0]);
                            System.out.print(".");
                            O2Hex.binary2hex.printfrachex(parts[1]);
                            // Step 3: Get combined output
                            String combinedOutput = outputStream.toString();
                            // Step 4: Display in TextView
                            textView.setText(combinedOutput);
                        }

                    } else {
                        Toast.makeText(MainActivity.this,
                                "Please select an option",
                                Toast.LENGTH_SHORT).show();
                    }
                });
            }

            catch (NumberFormatException e) {
                // Handle invalid input
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
            }


        });





    }









}



