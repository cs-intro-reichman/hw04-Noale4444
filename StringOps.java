public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
     
    }

    public static String capVowelsLowRest(String string) {
      String vowels = "aeiou"; 
      String VOWELS = "AEIOU";
      String s1 = "";
      for(int i = 0; i < string.length(); i++){
        if(vowels.indexOf(string.charAt(i)) != -1)
           s1 += (char) (string.charAt(i) - 32); 
            else if(VOWELS.indexOf(string.charAt(i)) != -1) {
                s1+= string.charAt(i);
              }  else {
                if(vowels.indexOf(string.charAt(i)) == -1 && VOWELS.indexOf(string.charAt(i)) == -1) {
                  }  if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                     s1 += (char) (string.charAt(i) + 32);
                       }  else  {
                         s1+= string.charAt(i);  
                   }
                  }
                } 

        return s1;
    }


     public static String firstToLower(String string) {
      String s = ""; 
      int count = 0; 
      int start = 0; 
      while (string.charAt(start) == ' ') {
        count++;
        start++;
      }
       for(int i = count; i < string.length();i++){
        if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
         s+= (char) (string.charAt(i) + 32);
         else
         s + string.charAt(i);
        }
          return s;
      }

      

      public static String firstToUpper(String string) { 
        String s = "";
        s += string.charAt(0); 
        for(int i = 1; i < string.length();i++) { 
          if(string.charAt(i - 1) == ' ') {
            if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
             s+= (char) (string.charAt(i) - 32);
           else 
             s+= string.charAt(i); 
          }
        else if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') 
          s+= (char) (string.charAt(i) + 32);
          else 
           s+= string.charAt(i);

      }
             return s; 
        }
         
        

       public static String deletSpaces(String string) { 
        String s = ""; 
        for(int i = 0; i < string.length(); i++) { 
          if(string.charAt(i) != ' ' ) 
            s+= string.charAt(i);
        }
        return s; 
       }

       
       public static String camelCase(String string) {
        string = firstToLower(string);
        string = firstToUpper(string);
        string = deletSpaces(string);
     
        return string;
     }
     


  
    public static int[] allIndexOf (String string, char chr) {
     int arrayLength = 0;
     for(int i = 0; i < string.length(); i++) { 
      if(string.charAt(i) == chr) 
      arrayLength++;
     }     
     int curIndex = 0; 
     int[] array = new int[arrayLength] ; 
     for(int i = 0; i < string.length(); i++){
      if(string.charAt(i) == chr) {
      array[curIndex] = i; 
      curIndex++;
     } 
    }
       
        return array; 
    }
}
