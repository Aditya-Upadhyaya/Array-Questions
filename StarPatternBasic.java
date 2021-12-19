public class StarPatternBasic {
    public static void main(String[] args) {
        
    //Solid Rectangle 
    /*      * * * * * 
            * * * * *
            * * * * *
            * * * * *
    /
    /*int row= 4;
    int column=5;
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {      
            System.out.print("* ");
        }
        System.out.println();
    }
    */

    //Rectangl with blank space inside
    /*
    * * * * * 
    *       *
    *       *
    * * * * *
    */
    /*
    int row= 4;
    int column=5;
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= column; j++) {  
           if (i == 1 || j==1 || i==row || j==column) {
            System.out.print("* ");
           }
           else{
            System.out.print("  ");
           }
            
        }
        System.out.println();
    }
    */
   
    //One Side Star Half Pyramid
    /* 

    * 
    * *
    * * *
    * * * *
    * * * * *

    */
    
    /*
    int num = 5;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {  
            System.out.print("* ");
        }
        System.out.println();
    }
    */
    /*

    * * * * * 
    * * * *
    * * *
    * *
    *
    int num = 5;
    for (int i = 1; i <= num; i++) {
        for (int j = i; j <= num; j++) {  
            System.out.print("* ");
        }
        System.out.println();
    }

    */

    //Inverted half pyramid
     /*     * 
          * *
        * * *
      * * * *
    */
    /*
    int num = 4;
    for (int i = 1; i <= num; i++) {
        int space = num-i;
        for (int k = 1; k <= space; k++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {  
            System.out.print("* ");
        }
        System.out.println();
    }

    */

    //Inverted half pyramid with number 
    /*
    1 2 3 4 5 
    1 2 3 4   
    1 2 3     
    1 2       
    1
    */
    /*
    int num = 5;
    for (int i = num; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {  
            System.out.print(j+" ");
        }
        System.out.println();
    }
    */
    //Floyd's Triangle
    /*
    1
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15
    */
    /*
    int num = 5;
    int count=1;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {  
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }*/
    //0-1 Triangle
    /*
     1 
     0 1
     1 0 1
     0 1 0 1
     1 0 1 0 1

    */
    int num = 5;
    int flag=1;
    for (int i = 1; i <= num; i++) {
        if (i%2!=0) {
            flag=1;
        }
        else
        {
            flag =0;
        }
        for (int j = 1; j <= i; j++) {  
            if (flag==1) {
                System.out.print("1 ");
                flag=0;
            } else {
                System.out.print("0 ");
                flag=1;
            }
        }
        System.out.println();
    }




    }
}
