import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[] = new int[n];
        for (int i=0;i<ar.length;i++) {
            ar[i] = s.nextInt();
        }
        int count=0;
        int count7=0;
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]==6)
            {
                if(i!=ar.length) {
                    if (ar[i + 1] == 6) {
                        count++;
                        i++;
                    } else if (ar[i + 1] == 7) {
                        count7++;
                        i++;
                    }
                }
            }

        }
        System.out.println("Count Two6's: "+count);
        System.out.println("Count 67's: "+count7);
    }
}