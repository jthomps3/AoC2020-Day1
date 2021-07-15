import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class D1ReportRepair {
    
    public static void main(String[] args) {     
        // Read input file into a vector  
        Vector <Integer> nums = new Vector<>(); 
        try {
            File myObj = new File("D1ReportRepair.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextInt()) {
                nums.add(myReader.nextInt());                
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        
        boolean found = false;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < nums.size() - 1 && found == false; i++) {
            for (int j = 0; j < nums.size() && found == false; j++) {
                if (nums.elementAt(i) + nums.elementAt(j) == 2020) {
                    num1 = nums.elementAt(i);
                    num2 = nums.elementAt(j);
                    found = true;
                }
            }
        }
        if (num1 == 0 && num2 == 0) {
            System.out.println("No 2 numbers add up to 2020");
            System.exit(0);
        } else {
            System.out.println("1st Number: " + num1 + "\n2nd Number: " + num2 + "\nResult = " + (num1 * num2));
        }       
        
        // Part 2
        found = false;
        int num3 = 0;
        num1 = 0;
        num2 = 0;
        for (int i = 0; i < nums.size() && found == false; i++) {
            for (int j = 0; j < nums.size() && found == false; j++) {
               for (int k = 0; k < nums.size() && found == false; k++) {
                   if (nums.elementAt(i) + nums.elementAt(j) + nums.elementAt(k) == 2020) {
                        num1 = nums.elementAt(i);
                        num2 = nums.elementAt(j);
                        num3 = nums.elementAt(k);
                        found = true;
                   }
               } 
            }
        }
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("No 3 numbers add up to 2020");
            System.exit(0);
        } else {
            System.out.println("1st Number: " + num1 + "\n2nd Number: " + num2 + "\n3rd Number: " + num3 +
            "\nResult = " + (num1 * num2 * num3));
        }
    }
}
