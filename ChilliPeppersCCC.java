//MY SOLUTION USING SWITCH

import java.util.Scanner;
class HelloWorld {
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int totalSpice = 0;
        System.out.print("How many peppers do you want? ");
        int num = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Which peppers do you want? ");
        System.out.print("\n");
        System.out.print("OPTIONS ARE:");
        System.out.print("Poblano, Mirasol, Serrano, Cayenne, Thai, Habanero");
        System.out.print("\n");
        String[] pepper = new String[num] ;
        for (int i = 0; i < num; i++)
        {
        System.out.print("Enter pepper " + (i+1) + ":");
        pepper[i] = scanner.nextLine();

        switch (pepper[i].toLowerCase()) {
        case "poblano":
            totalSpice = totalSpice + 1500;
            break;
        case "mirasol":
           totalSpice = totalSpice + 6000;
           break;
        case "serrano":
            totalSpice = totalSpice + 15500;
            break;
        case "cayenne":
            totalSpice = totalSpice + 40000;
            break;
        case "thai":
            totalSpice = totalSpice + 75000;
            break;
        case "habanero":
            totalSpice = totalSpice + 125000;
            break;
        }
        }
        System.out.print("The total spice is " + totalSpice + " Scoville Heat units");
    }
}
