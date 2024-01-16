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


    public static String firstToLower(String string) {
      String str = "";
      int p = 0;
      int count = 0;
      while (string.charAt(p) == 32) {
          count++;
          p++;
      }

      for (int i = count; i < string.length(); i++) {
          if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
              str += (char) (string.charAt(i) + 32);
          else
              str += string.charAt(i);
      }
      return str;
  }

  public static String firstToUpper(String string) {
      String str = "";
      str += string.charAt(0);
      for (int i = 1; i < string.length(); i++) {
          if (string.charAt(i - 1) == ' ') {
              if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
                  str += (char) (string.charAt(i) - 32);
              else
                  str += string.charAt(i);
          } else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
              str += (char) (string.charAt(i) + 32);
          else
              str += string.charAt(i);
      }
      return str;
  }

  public static String deleteSpaces(String string) {
      String str = "";
      for (int i = 0; i < string.length(); i++) {
          if (string.charAt(i) != 32)
              str += string.charAt(i);
      }
      return str;
  }

  
public static String camelCase(String string) {
      string = firstToLower(string);
      string = firstToUpper(string);
      string = deleteSpaces(string);
      return string;
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
