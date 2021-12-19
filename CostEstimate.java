import java.util.*;
public class CostEstimate {
    public static void main(String[] args) {
        Scanner src =new Scanner (System.in);
        System.out.println("Enter number of Interior wall");
        int numOfInterior = src.nextInt();
        System.out.println("Enter number of Exterior wall");
        int numOfExterior=src.nextInt();
        int surfaceAreaInt[]=new int[numOfInterior];
        int surfaceAreaOfExt[]=new int[numOfExterior];
        System.out.println("Enter surface area of Interior wall");
        for (int i = 0; i < surfaceAreaInt.length; i++) {
            surfaceAreaInt[i]=src.nextInt();
        }
        System.out.println("Enter surface area of Exterior wall");
        for (int i = 0; i < surfaceAreaOfExt.length; i++) {
            surfaceAreaOfExt[i]=src.nextInt();
        }
        int interiorCOst=0;
        for (int i = 0; i < surfaceAreaInt.length; i++) {
            interiorCOst = interiorCOst + surfaceAreaInt[i]*18;
        }
        int exteriorCost=0;
        for (int i = 0; i < surfaceAreaOfExt.length; i++) {
            exteriorCost = exteriorCost + surfaceAreaOfExt[i]*12;
        }
        System.out.println("Total = "+ (exteriorCost+interiorCOst));



        src.close();
    }
}
