import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  String rotationalCipher(String input, int rotationFactor) {
    // Write your code here
    
    HashMap<String, Integer> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
   
    while(input.length()>0){
      for(int i = 0; i< input.length(); i++){
        if(input.charAt(i) >= 0){
         input = rotationFactor; 

        
        }
      }
      return input; 
    }
/*
UNDERSTAND:given a input string, & int rotation factor we should return the encrypted version of string using some rules: 
- rotation facture? - number of times to rotate
-each alphabet char is replaced w/ char 3 letters higher (z-a)
- each numeric char is replaces w/ 3 digits higher (9-0) number + rotation factor 
-nonalphabnumeric char remain unchaged
questions: is z = string[0]? no! , non alphanumric stays same place? is it case sensitive? how does it handle 2digit numbers? - only accepts the 2nd (12 = 2, 39 = 9)
what happens whn we gt empty sting input? 

ex. input = Zebra-493?  rotation factor is 3
output: Cheud-726?
ex2. input = abcdefghijklmNOPQRSTUVWXYZ0123456789 rotation factor is 39
output = nopqrstuvwxyzABCDEFGHIJKLM9012345678

PLAN: HashMap (contains the alphabet mapping)
1. initilize the hashmap (String, int)
2. base case- if (string.length==0){return string}; 
3. determine what the elmnt is 
  - number  
  -char 

CODE
DEBUG

*/    
    
  }











  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom, but they are otherwise not editable!
  int test_case_number = 1;
  void check(String expected, String output) {
    boolean result = (expected.equals(output));
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);
    }
    else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      printString(expected); 
      System.out.print(" Your output: ");
      printString(output);
      System.out.println();
    }
    test_case_number++;
  }
  void printString(String str) {
    System.out.print("[\"" + str + "\"]");
  }
  
  public void run() {
    String input_1 = "All-convoYs-9-be:Alert1.";
    int rotationFactor_1 = 4;
    String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
    String output_1 = rotationalCipher(input_1, rotationFactor_1);
    check(expected_1, output_1);

    String input_2 = "abcdZXYzxy-999.@";
    int rotationFactor_2 = 200;
    String expected_2 = "stuvRPQrpq-999.@";
    String output_2 = rotationalCipher(input_2, rotationFactor_2);
    check(expected_2, output_2);

    // Add your own test cases here
    
  }
  
  public static void main(String[] args) {
    new Main().run();
  }
}