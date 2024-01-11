import java.lang.reflect.Array;

public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(findMissingInt(new int[] { 3, 0, 1 }));
        System.out.println(findMissingInt(new int[] { 0, 1, 2, 3, 4, 6 }));
        System.out.println(secondMaxValue(new int[] { 6, 9, 4, 7, 3, 4 }));
        System.out.println(secondMaxValue(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(containsTheSameElements(new int[] { 1, 2, 1, 1, 2 }, new int[] { 2, 1 }));
        System.out.println(containsTheSameElements(new int[] { 3, -4, 1, 2, 5 }, new int[] { 1, 3, -4, 5 }));
        System.out.println(isSorted(new int[] { 7, 7, 5, 4, 3, -12 }));
        System.out.println(isSorted(new int[] { 1,  -2, 3 }));
    }
 
    
    public static int findMissingInt (int[] array) {
    
       for( int i = 0; i < array.length; i++) {
         if(!contains(array , i))
        
         return  i;   
    }
    return 1;
}  
    

    public static int secondMaxValue(int [] array) {
        int max = array[0]; 
        int secondMax = array[0]; 
        for( int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                secondMax = max; 
                max = array[i];
             } else if (array[i] > secondMax && array[i] < max)
                secondMax = array[i];
            }
    
        return secondMax; 
        }

    public static boolean contains ( int array[] , int value) {
    
        for(int i = 0; i < array.length; i++){ 
        if(array[i] == value)
        return true;   
        }
        return false;
    }
   
    public static boolean containsTheSameElements(int [] array1 ,int[] array2) {
        for( int i = 0; i < array1.length; i++) { 
            if (!contains(array2, array1[i])) 
            return false; 
        }
        for(int i = 0; i < array2.length;i++) {
            if(!contains( array1, array2[i]))
            return false; 
        }
        return true;
        }
     
        
    public static boolean isSorted(int [] array) {
    
       for (int i = 0; i < array.length -2; i++) {
    int curVal = array[i]; 
    int nextVal = array[i+1]; 
    if(array[0] <= array.length-1){
        if(curVal > nextVal) {
            return false;
        }
    }
    if(array[0] >= array.length-1) {
        if(curVal < nextVal) {
            return false;
        }
    }


       }
    return true;
    }

}

