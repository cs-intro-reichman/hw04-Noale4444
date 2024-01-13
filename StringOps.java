public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.subString(int start)                 ///////
    //////        4.subString(int start,int ends)        ///////
    //////        5.indexOf(String s)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it uString material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for subString              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
     
    }

    public static String capVowelsLowRest(String String) {
      String vowels = "aeiou"; 
      String VOWELS = "AEIOU";
      String s1 = "";
      for(int i = 0; i < String.length(); i++){
        if(vowels.indexOf(String.charAt(i)) != -1)
           s1 += (char) (String.charAt(i) - 32); 
            else if(VOWELS.indexOf(String.charAt(i)) != -1) {
                s1+= String.charAt(i);
              }  else {
                if(vowels.indexOf(String.charAt(i)) == -1 && VOWELS.indexOf(String.charAt(i)) == -1) {
                  }  if(String.charAt(i) >= 'A' && String.charAt(i) <= 'Z') {
                     s1 += (char) (String.charAt(i) + 32);
                       }  else  {
                         s1+= String.charAt(i);  
                   }
                  }
                } 

        return s1;
    }


    public static String firstToLower(String String) {
      String s = "";
      int start = 0;
      int count = 0;
      while (String.charAt(start) == 32) {
          count++;
          start++;
      }
      for (int i = count; i < String.length(); i++) {
          if (String.charAt(i) >= 'A' && String.charAt(i) <= 'Z')
              s += (char) (String.charAt(i) + 32);
          else
              s += string.charAt(i);
      }
      return s;
  }

  public static String firstToUpper(String String) {
      String s = "";
      s += String.charAt(0);
      for (int i = 1; i < String.length(); i++) {
          if (String.charAt(i - 1) == ' ') {
              if (String.charAt(i) >= 'a' && String.charAt(i) <= 'z')
                  s += (char) (String.charAt(i) - 32);
              else
                  s += String.charAt(i);
          } else if (String.charAt(i) >= 'A' && String.charAt(i) <= 'Z')
              s += (char) (String.charAt(i) + 32);
          else
              s += String.charAt(i);
      }
      return s;
  }

  public static String deleteSpaces(String String) {
      String s = "";
      for (int i = 0; i < String.length(); i++) {
          if (String.charAt(i) != 32)
              s += String.charAt(i);
      }
      return s;
  }

  public static String camelCase(String String) {
      String = firstToLower(String);
      String = firstToUpper(String);
      String = deleteSpaces(String);
      return String;
  }


  
    public static int[] allIndexOf (String String, char chr) {
     int arrayLength = 0;
     for(int i = 0; i < String.length(); i++) { 
      if(String.charAt(i) == chr) 
      arrayLength++;
     }     
     int curIndex = 0; 
     int[] array = new int[arrayLength] ; 
     for(int i = 0; i < String.length(); i++){
      if(String.charAt(i) == chr) {
      array[curIndex] = i; 
      curIndex++;
     } 
    }
       
        return array; 
    }
}
