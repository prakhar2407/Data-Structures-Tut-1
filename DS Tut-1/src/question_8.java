import java.util.Scanner;

public class question_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        Bubblesort(ar);
        System.out.println(getmedian(ar));

    }

    public static void Bubblesort(int ar[])
    {
        int i = 0;
        while (i <ar.length) {
            for (int j = 0; j < ar.length-1-i ; j++) {
                if(ar[j]>ar[j+1])
                {
                    swap(j,j+1,ar);
                }
            }
            i++;
        }
    }

    public static void swap(int first,int second,int ar[])
    {
        int temp;
        temp= ar[first];
        ar[first] = ar[second];
        ar[second]=temp;
    }

    private static int getmedian(int[] ar) {
        int medidan=0;
        if(ar.length%2==0)
        {
            medidan = (ar[(ar.length/2-1)]+ar[(ar.length/2)])/2;
            return medidan;
        }
        return ar[ar.length/2];
    }
}