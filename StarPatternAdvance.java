public class StarPatternAdvance {
    public static void main(String[] args) {
        // Butterfly Pattern
        /*

        *             * 
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
         
        */
        /*
        int num = 4;
        int space = num * 2 - 2;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");
            }
            space= space-2;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Second part
        space=0;
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");
            }
            space= space+2;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    */
    //Solid Rohmbus
    /*

                * * * * * 
              * * * * *
            * * * * *
          * * * * *
        * * * * *

    */
    /*
    int num = 5;      
        for (int i = 1; i <= num; i++) {
            int space = num -i;
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");
            }
            space= space-2;
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }

   */
    //Number Pyramid
    /*
            1 
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5

    */
    /*
        int num = 5;      
        for (int i = 1; i <= num; i++) {
            int space = num-i;
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            
            System.out.println(); 
        }

      */

      //Palindrome Pattern
      /*
      
             1
            212
           32123
          4321234
         543212345

      */
      /*
      int num = 5;      
        for (int i = 1; i <= num; i++) {
            int space = num-i;
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println(); 
        }

    */






    }
}
