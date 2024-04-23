// 2024 J1
import java.util.Scanner;
class conveyerBeltSushi{
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
    

        System.out.print("Enter number of red plates: ");
        int red = scanner.nextInt();

        System.out.print("Enter number of green plates: ");
        int green = scanner.nextInt();

        System.out.print("Enter number of blue plates: ");
        int blue = scanner.nextInt();

        int cost = (red*3 + green*4 + blue*5);
        System.out.println("Cost is "+ cost);
    }
}
