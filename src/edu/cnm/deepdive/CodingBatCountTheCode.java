package edu.cnm.deepdive;

/*
Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */

public class CodingBatCountTheCode {

  public static void main(String[] args) {
    System.out.printf("for the string %s, the count is " + countCode("aaacodebbb") + ".\n", "aaacodebbb");
    System.out.printf("for the string %s, the count is " + countCode("codexxcode") + ".\n", "codexxcode");
    System.out.printf("for the string %s, the count is " + countCode("cozexxcope") + ".\n", "cozexxcope");
  }

  public static int countCode(String str) {
    int count = 0;

    for (int i = 0; i < str.length() - 3; i++) {
      if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
        count++;
      }
    }
    return count;
  }

}
