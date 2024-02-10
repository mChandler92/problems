import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




public class Result {

/*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */


     arr = [-4, 3, -9, 0, 4, 1]

    // function does return a variable with VOID
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        
            // declares but not initalize variables to be used
            // variable to store calc ratio value later
            
          
            // variables to store sum of all pos/neg/zero ints
    
            double sumPos = 0;
            double sumNeg = 0;
            double sumZero = 0;
            
            double n = arr.size();
            
            
            // iterates through list to determine if int at position 'i' is neg/pos/0
            for (int i = 0; i < n; i++) { // arr.size()
                if (arr.get(i) > 0 ) {
                    sumPos++;
                } else if (arr.get(i) < 0) {
                    sumNeg++;
                } else if (arr.get(i) == 0) {
                    sumZero++; 
                }
            }
            
           
            // takes sum of pos/neg/zero ints in list and finds ratio. Moving from smaller size (int) to larger (Double)
            double ratioPos = sumPos/n;
            double ratioNeg = sumNeg/n;
            double ratioZero = sumZero/n;
            
          
            
           // prints out ratio results for pos/neg/zero ints
            System.out.printf("%.6f\n%.6f\n%.6f\n", ratioPos, ratioNeg, ratioZero);
    
        }

    /* 
        public class Solution {
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
                int n = Integer.parseInt(bufferedReader.readLine().trim());
        
                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
        
                Result.plusMinus(arr);
        
                bufferedReader.close();
            }
        }
*/

 /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

     public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int arrSumMin = 0;
        int arrSumMax = 0;
      
        // sorts array by lowest value then reverses
         Collections.sort(arr);
          Collections.reverse(arr);
         
        
       
        
            //iterates through array to sum highest values
          for (int i=1; i < arr.size(); i++) {
            arrSumMin += arr.get(i); 
        }
        
           
        
             Collections.reverse(arr);
      
        
            //iterates through array to sum lowest values
        for (int i=1; i < arr.size(); i++) {
            arrSumMax+= arr.get(i); 
        }
        
    
        System.out.println(arrSumMin + " " + arrSumMax);
     
    }


    /*
    public class Solution2 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
    
            Result.miniMaxSum(arr);
    
            bufferedReader.close();
        }
    }
        
        */
        
        //OUTPUT: System.out.println(minSum + maxSum);




       

            /*
             * Complete the 'timeConversion' function below.
             *
             * The function is expected to return a STRING.
             * The function accepts STRING s as parameter.
             */
        
            public static String timeConversion(String s) {
            // Write your code here
        
            String timeHour = s.substring(0, 3);
            System.out.println(timeHour);
            
            String timeRemainder = s.substring(3);
            System.out.println(timeRemainder);
            
            return timeRemainder;
        
            }


            /* 

            public class Solution3 {
                public static void main(String[] args) throws IOException {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
            
                    String s = bufferedReader.readLine();
            
                    String result = Result.timeConversion(s);
            
                    bufferedWriter.write(result);
                    bufferedWriter.newLine();
            
                    bufferedReader.close();
                    bufferedWriter.close();
                }
            }
            */
        
        }
        
    