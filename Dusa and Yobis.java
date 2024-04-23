// 2024 J2
import java.util.Scanner;
class DusaYobis{
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the size of dusa: ");
        int dusa = scanner.nextInt();
        int finals = dusa;
        int yobis;
        do
        {
            yobis = scanner.nextInt();
            if (dusa>yobis){
                dusa = dusa+yobis;
            finals = dusa;
            }
            
        }
        while(yobis<dusa);
        
    System.out.println("The final size is: " + finals);
    }
}
