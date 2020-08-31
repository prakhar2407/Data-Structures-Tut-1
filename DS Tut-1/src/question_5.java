import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int row = s.nextInt();
        int col = s.nextInt();
        int[][] ar= new int[row][col];

        for (int i = 0; i <row ; i++)
            for (int j = 0; j < col; j++) {
                ar[i][j] =check(s.nextInt());
            }

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        checkodd(ar,row,col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void checkodd(int[][] ar,int row, int col) {
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                if (ar[i][j] % 2 != 0) {
                    ar[i][j] = ar[i][j] * 2;
                }
            }

        }
    }
    public static int check(int ar)
    {

        Scanner s = new Scanner(System.in);
        int count =0;
        int temp = ar;

        while (temp!=0)
        {
            temp= temp/10;
            count++;
        }

        if(count<=2)
        {
            return ar;
        }

        System.out.print("Wrong Input Enter Again: ");
        return check(s.nextInt());

    }
}