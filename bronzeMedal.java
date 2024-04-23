import java.util.Scanner;
class bronzeMedal {
    public static void main(String[] args)
    {

        // asking user for number of inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many students: ");
        int n = scanner.nextInt();
        int i;
        int j;
        int k;
        int BM;
        int count = 0;
        // storing numbers in array
        int[] num = new int[n];
        System.out.println("Enter the marks: ");
        for (i = 0; i < n; i++)
        {
            num[i] = scanner.nextInt();
        }

        for (i = 0; i < n; i++)
        {
            for (j = i + 1; j < n; j++)
            {
                if (num[i] < num[j]) // let's say 0th term is 2 and 1st term is 5
                {
                    int temp = num[i]; // so 2 is stored in temp
                    num[i] = num[j];   // now 5 is stored as 0th term
                    num[j] = temp;     // and 2  becomes 1st term
                                       // this process is repeated to sort in descending order
                }
            }
        }

        BM = num[2];
        System.out.println("Bronze medal is " + BM);

        for (k = 0; k < n; k++)
        {
            if (num[k] == BM)
            {
                count = count + 1;
            }
        }

        System.out.println("number of people with bronze medal is: " + count);
    }
}
