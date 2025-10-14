// MATH RANDOM NOTES

public class RAND_oct13 {
    public static void main(String[] args) {
        // generating random numbers
        /*We can generate random numbers using the 
        Math.random();
        method
        */
        
        // the following procidure applies
        int numOfPossibleValues = 6;
        int minValuePossible = 2;
        int random = (int)(Math.random()*numOfPossibleValues) + minValuePossible;   // [2, 8)
        //                {                                 }
        //                     is what is getting casted
        
        // why not cast after the addition of min value
        /*
            - math.random() retrurns a double from [0,1)
                -> [0,1) is more like (0,1) because 
        */
        int num0 = 
        (int)(Math.random()*6)+1;
        //   {             }         (0,1]
        //  {                 }      (0,6]
    //  {                     }      (0,5]
    //  {                       }    (1, 6]
    
    
        int num1 =
        (int)(Math.random()*6+1);
        //   {             }         (0,1]
        //  {                 }      (0,6]
    //      {                   }    (1,7]
    //  {                       }    (1,6]


      // but [0,1) in the real world is (0,0)
    
    // we want [-3,3]
    int num2 =
    (int)(Math.random()*7)-3;
//       {            }         (0,1)
//       {               }      (0,7)
//  {                    }      (0,6)
//  {                       }   (-3,3)
    
    
    // we want [-3,3]
    int num3 =
    (int)(Math.random()*7-3);
//       {            }         (0,1)
//       {               }      (0,7)
//       {                  }   (-3,4)
//  {                       }   (-2,3)

        // examples 
        
        // [1,8]
        int num4 = (int)(Math.random()*7) + 1;
        
        // [2,11]
        int num5 = (int)(Math.random()*9) + 2;
         
        // [0,5]
        int num6 = (int)(Math.random()*5) + 0;
        
        // [-2, 2]
        int num7 = (int)(Math.random()*5) - 2;
        
        // [-7, -1]
        int num8 = (int)(Math.random()*7) - 7;
        
        // [67]
        int num9 = (int)Math.random() + 68;
    }
}
