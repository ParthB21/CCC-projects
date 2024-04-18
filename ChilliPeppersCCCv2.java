//Gursimar's solution using 2 arrays

import java.util.Scanner;
class ChilliPeppers {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int spice = 0;
        
        String[] pepperName = {"Poblano", "Mirasol", "Serrano", "Cayenne", "Thai", "Habanero"};
        int[] SHU = {1500, 6000, 15500, 40000, 75000, 125000};
        
        System.out.print("How many peppers? ");
        int pepperNo = input.nextInt();
        
        for (int i=0; i<pepperNo; i++)
        {
            String peppers = input.next();
            for (int j=0; j<6; j++)
            {
                if (peppers.equalsIgnoreCase(pepperName[j]))
                spice=spice+SHU[j];
            }
        }
        
        System.out.print("The total spice is " + spice + " Scoville Heat units");
    }
}