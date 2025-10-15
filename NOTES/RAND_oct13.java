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


        // Mr I stooped here
            // the rest of this is my notes
        
        // That is the way Mr.I teaches them
        // this is the way that I prefer and I think this is a lot easier to memorize this formula
        int max = 6;
        int min = 13;
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        
        // examples 
        
        // [1,8]
        int num4 = (int) (Math.random() * 8)  + 1;
        
        // [2,11]
        int num5 = (int) (Math.random() * 10) + 2;
         
        // [0,5]
        int num6 = (int) (Math.random() * 6) + 0;
        
        // [-2, 2]
        int num7 = (int) (Math.random() * 5) - 2;
        
        // [-7, -1]
        int num8 = (int) (Math.random() * 7) - 7;
        
        // [67]
        int num9 = (int) (Math.random() * 1) + 67;

        // for diffrent range types here are the formulas
        // [,]         inclusive of both min and max
        int IncInc = (int) (Math.random() * (max - min + 1) + min);

        // [,)         inclusive of min, exclusive of max
        int IncEx  = (int) (Math.random() * (max - min) + min);

        // (,]        exclusive of min and inclusive of max
        int ExInc = (int) (Math.random() * (max - min)) + min + 1;

        // (,)        excllusive of both of the max and min
        int ExEx = (int)(Math.random() * (max - min - 1)) + (min + 1);

        // NOTE 
        /*
            if you only want to memorize 1 of the formulas
            for INTs [x,y)
            is the same as
            [x,y-1]
                - this is because it will never reach the high one on y so it will get dropped to the number lower inclusive
            
            meaning if you have problem
            [x,y)
            you can make this inclusive inclusive 
            [x,y-1]
                (int) (Math.random() * ((y-1) - x + 1) + x);
            which when simplified becomes 
                (int) (Math.random() * (x - y) + x);
                
            which is the same as the inclusive exclusive formula
        */

        /*
            for ints of (x,y]
            this is the same thing as
            [x+1,y]
            meaning once again you can use the [,] formula 
        */

        /*
            to get (,) in [,] form we can combine the 2 previous concepts 

            (x,y) is equal to [x+1,y-1]

            for example
            (2,7) => {3,4,5,6}
            (3,6) => {3,4,5,6}
            or 
            (-2, 4) => {-1,0,1,2,3}
            (-1, 3) => {-1,0,1,2,3}
        */


        // TEST
        /*
        Try out these then scroll down to see the answers
                // these are the base use the formula (int) (Math.random() * (max-min+1) + min)
            [3,6]
            [-4,14]
            [5,6]
            [0,64]
            [4,14]
            [-1,1]
            [0,1]

                // to get these from [x,y) to the base [,] do [x,y-1]
            [4,7)
            [-3,5)
            [-8,-4)
            [4,7)
            [3,6)
            [-1,8)
            [12,76)

                // to get these from (x,y] to the base [,] do [x+1,y]
            (4,6]
            (2,8]
            (1,9]
            (-65,3]
            (-12,4]
            (3,16]
            (-2,5]
            (1,4]
            (-3,3]

            (2,5)
            (-4,5)
            (1,2)
            (0,7)
            (3,8)
            (3,9)
            (-2,9)
            (-5,-3)
        */






        // ANSWERS
        //-------------------------------------------
            // INCLUSIVE INCLUSIVE PROBLEMS
        // [3,6]
            (int) (Math.random() * 4 + 3);
        // [-4,14]
            (int) (Math.random() * 19 - 4);
        // [5,6]
            (int) (Math.random() * 2 + 5);
        // [0,64]
            (int) (Math.random() * 65);
        // [4,14]
            (int) (Math.random() * 11 + 4);
        // [-1,1]
            (int) (Math.random() * (3) -1);
        // [0,1]
            (int) (Math.random() * 2);

            // INCLUSIVE EXCLUSIVE PROBLEMS
        // [4,7)        can be written as [4,6]
            (int) (Math.random() * 3 + 4);
        // [-3,5)       can be written as [-3,4]
            (int) (Math.random() * 9 - 3);
        // [-8,-4)      can be written as [-8,-5]
            (int) (Math.random() * 4 - 8);
        // [4,7)        can be written as [4,6]
            (int) (Math.random() * 3 + 4);
        // [3,6)        can be written as [3,5]
            (int) (Math.random() * 3 + 3);
        // [-1,8)       can be written as [-1,7]
            (int) (Math.random() * 9 - 1);
        // [12,76)      can be written as [12,75]
            (int) (Math.random() * 64 + 12);


            // EXCLUSIVE INCLUSIVE PROBLEMS
            // int ExInc = (int) (Math.random() * (max - min)) + min + 1;
        // (4,6]      can be written as [5,6]
            (int) (Math.random() * 2 + 5);
        // (2,8]      can be written as [3,8]
            (int) (Math.random() * 6 + 3);
        // (1,9]      can be written as [2,9]
            (int) (Math.random() * 8 + 2);
        // (-65,3]     can be written as [-64,3]
            (int) (Math.random() * 68 - 64);
        // (-12,4]    can be written as [-11,4]
            (int) (Math.random() * 16 - 11);
        // (3,16]     can be written as [4,16]
            (int) (Math.random() * 13 + 4);
        // (-2,5]     can be written as [-1,5]
            (int) (Math.random() * 7 - 1);
        // (1,4]      can be written as [2,4]
            (int) (Math.random() * 3 + 2);
        // (-3,3]     can be written as [-2,3]
            (int) (Math.random() * 6 -2);

            // EXCLUSIVE EXCLUSIVE  PROBLEMS
        // (2,5)     can be written as [3,4]
            (int) (Math.random() * 2 + 3);
        // (-4,5)    can be written as [-3,4]
            (int) (Math.random() * 8 - 3);
        // (1,2)     can be written as [2,1]
            (int) (Math.random() * 0 + 2);    // this is a weird one because there arent any ints from (1,2) but we will aways generate 2
        // (0,7)     can be written as [1,6]
            (int) (Math.random() * 6 + 1);
        // (3,8)     can be written as [4,7]
            (int) (Math.random() * 4 + 4);
        // (3,9)     can be written as [4,8]
            (int) (Math.random() * 5 + 4);
        // (-2,9)    can be written as [-1,8]
            (int) (Math.random() * 10 - 1);
        
        // (-5,-3)   can be written as [-4,-4]
            (int) (Math.random() * 1 - 4);       // WRONG
                // these are some to lookout for becasuase it should only ever generate -4 you have to 
                    (int) (Math.random() * 0) - 4
    //                    {            }            [0.00,1.00)
    //                    {                 }       [0.00]
    //              {                       }       [0]
    //              {                           }   [-4]
    }
}
