// Waktu Pengerjaan 14.27 - 15.21  


package readingandwriting;

import java.util.Scanner;
import java.io.*;

public class Warning {
     public static void main(String[] args) 
     {    
        // TODO code application logic here
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
       
        String line, name, inputName = "D:\\student.dat";
        String outputName = "warning.dat";
        try
        {
            File infile = new File(inputName);
            Scanner scfile = new Scanner(infile);
            PrintWriter outFile = new PrintWriter(outputName);
            // Set up scanner to input file
            // Set up the output file stream
            // Print a header to the output file
            outFile.println ();
            // Process the input file, o
            outFile.println ("Students on Academic Warning");
            outFile.println ();
            // Process the input file, one token at a time
            while (scfile.hasNextLine())
            {
                name = scfile.next();
                creditHrs = scfile.nextInt();
                qualityPts = scfile.nextDouble();
            // Get the credit hours and quality points and
            // determine if the student is on warning. If so,
            // write the student data to the output file.
                gpa = qualityPts/creditHrs;
                if((gpa < (1.5) && creditHrs<=30) || (gpa < (1.75) && creditHrs <= 60) || (gpa <(2.0) && creditHrs >= 60))
                {
                    outFile.println(name + " " + creditHrs + " " + gpa);
                }
            }
            
            outFile.close();
            // Close output file
        }
        catch (FileNotFoundException exception)
        {
            System.out.println ("The file " + inputName + " was not found.");
        }
        catch (IOException exception)
        {
            System.out.println (exception);
        }
        catch (NumberFormatException e)
        {
            System.out.println ("Format error in input file: " + e);
        }
    }
 }
