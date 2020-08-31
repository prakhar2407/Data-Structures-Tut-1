import java.util.Arrays;
import java.util.Scanner;

public class question_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] Sales = new int[5][6];
        int n=1;
        do {
            System.out.print("Enter Sales Person(1-4): ");
            int SalesPerson = s.nextInt();
            System.out.print("Enter Product(1-5): ");
            int Product = s.nextInt();
            System.out.print("Enter Price: ");
            int price = s.nextInt();
            System.out.println("Enter 1 to continue 0 to exit input: ");
            Sales[SalesPerson-1][Product-1]= price;
            n=s.nextInt();
        } while (n!=0);

        for (int i = 0; i <4 ; i++) {
            Sales[i][5]= findtotalrow(Sales,i,6);
        }
        for (int j = 0; j <5 ; j++) {
            Sales[4][j]=findtotalcol(Sales,5,j);
        }
        printtable(Sales);

    }

    private static int findtotalrow(int[][] sales, int row, int col) {
        int sum=0;
        for (int i = 0; i <col ; i++) {
            sum= sum + sales[row][i];
        }
        return sum;
    }

    private static int findtotalcol(int[][] sales, int row, int col) {
        int sum=0;
        for (int i = 0; i <row ; i++) {
            sum= sum + sales[i][col];
        }
        return sum;
    }

    private static void printtable(int[][] sales) {


        System.out.printf("%10s %2.5s %2.5s %3s %2.5s %2.5s %4s", "Sales Person", "1", "2", "3", "4","5","Total");
        System.out.println();
        for (int i = 0; i <5 ; i++) {
            int k=i+1;
            if(k==5)
            {
                System.out.printf("%-10s","Total");
            }
            else
                System.out.print("\t"+k+"\t");
            for (int j = 0; j <6 ; j++) {
                if(i==4 && j==5)
                {
                    break;
                }
                System.out.printf("\t "+sales[i][j]);
            }
            System.out.println();

        }


    }

}