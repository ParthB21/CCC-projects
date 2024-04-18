//MY SOLUTION USING SWITCH

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        Scanner Q = new Scanner(System.in);
        int spice = 0;
        System.out.print("How many peppers do you want? ");
        
        int num = Q.nextInt();
        Q.nextLine();
        
        System.out.print("Which peppers do you want? ");
        System.out.print("\n");
        System.out.print("OPTIONS ARE:");
        System.out.print("Poblano, Mirasol, Serrano, Cayenne, Thai, Habanero");
        System.out.print("\n");
        String[] PE = new String[num] ;
        for (int i = 0; i < num; i++)
        {
        System.out.print("Enter pepper " + (i+1) + ":");
        PE[i] = Q.nextLine();

        switch (PE[i].toLowerCase()) {
        case "poblano":
            spice = spice + 1500;
            break;
        case "mirasol":
           spice = spice + 6000;
           break;
        case "serrano":
            spice = spice + 15500;
            break;
        case "cayenne":
            spice = spice + 40000;
            break;
        case "thai":
            spice = spice + 75000;
            break;
        case "habanero":
            spice = spice + 125000;
            break;
        }
        }
        System.out.print("The total spice is " + spice + " Scoville Heat units");
    }
}