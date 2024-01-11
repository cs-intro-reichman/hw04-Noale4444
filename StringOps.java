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

    public static String capVowelsLowRest (String string) {
      String vowels = "aeiou"; 
      String VOWELS = "AEIOU";
      String s1 = "";
      for(int i = 0; i < string.length(); i++){
        if(vowels.indexOf(string.charAt(i)) != -1)
           s1 += (char) (string.charAt(i) - 32); 
             if(VOWELS.indexOf(string.charAt(i)) != -1) 
                s1+= string.charAt(i);
                   if(vowels.indexOf(string.charAt(i)) == -1 && VOWELS.indexOf(string.charAt(i)) == -1) { 
                     if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
                     s1 += (char) (string.charAt(i) + 32);
                       else  
                         s1+= string.charAt(i); 
                         
                   }
      }

        return s1;
    }



    public static boolean isLetter(char ch){
      if (ch != ' '){
      return true; 
      }
      return false; 
    }

    public static char toUpperCase(char ch) { 
      char newChar; 
      if(ch >= 'a' && ch<= 'z'){
    newChar = (char) (ch - 32) ;
      return newChar;
    }
    else 
    return ch; 
  }

   public static char toLowerCase(char ch) { 
      char newChar; 
      if(ch >= 'A' && ch<= 'Z'){
    newChar = (char) (ch + 32) ;
      return newChar;
    }
    else 
    return ch; 
  }



      public static String camelCase(String string) {
          // rule 1
          String s = "";
          int firstSpaceIndex = string.indexOf(' ');
          String firstWord = (firstSpaceIndex != -1) ? string.substring(0, firstSpaceIndex) : string;
          for(int i = 0; i < firstWord.length(); i++) {
            s+= (char) (toLowerCase(firstWord.charAt(i)));
          }
          
          //rule 2
          boolean capitalIsNext = false; 
          for (int i = firstSpaceIndex + 1; i < string.length(); i++) {
              char curChar = string.charAt(i);


              if(isLetter(curChar)) {
                if(capitalIsNext) {
                  s += (char)(toUpperCase(string.charAt(i+1)));
                capitalIsNext = false; 
                } 
                else  {
                s+= (char)(toLowerCase(curChar)); 
                }
              }
                else if(curChar == ' ' && isLetter(string.charAt(i+1))){
                  capitalIsNext = true; 
                }
              }
                    return s; 
              }
  
             

  
    public static int[] allIndexOf (String string, char chr) {
     int arrayLength = 0;
     for(int i = 0; i < string.length(); i++) { 
      if(string.charAt(i) == chr) 
      arrayLength++;
     }     
     int curIndex = 0; 
     int[] index = new int[arrayLength] ; 
     for(int i = 0; i < string.length(); i++){
      if(string.charAt(i) == chr)
      index[curIndex] = chr; 
      curIndex++;
     } 

       
       
        return index; 
    }
}
