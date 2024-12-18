package arrays;

class STringChallenge2 {

  public static String StringChallenge(String[] strArr) {
   
    int decimalNumber = Integer.parseInt(strArr[0]);
   
    String binaryInput = strArr[1];
    
    // Convert the decimal number to binary
    String binaryDecimal = Integer.toBinaryString(decimalNumber);
    
    // Normalize the lengths by padding with leading zeros
    int maxLength = Math.max(binaryInput.length(), binaryDecimal.length());
    binaryInput = String.format("%" + maxLength + "s", binaryInput).replace(' ', '0');
    binaryDecimal = String.format("%" + maxLength + "s", binaryDecimal).replace(' ', '0');
    
    // Count the number of differing bits
    int changesRequired = 0;
    for (int i = 0; i < maxLength; i++) {
      if (binaryInput.charAt(i) != binaryDecimal.charAt(i)) {
        changesRequired++;
      }
    }
    
    // Return the count as a string
    return String.valueOf(changesRequired);
  }

  public static void main(String[] args) {  
    // Example test case
    String[] input = {"44", "111111"};
    System.out.println(StringChallenge(input));  // Output: 2
  }
}
