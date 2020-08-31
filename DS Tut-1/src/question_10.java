import java.util.Scanner;

public class question_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean temp = true;
        int n = s.nextInt();
        String[] str = new String[n];
        for (int i = 0; i <str.length ; i++) {
            str[i]=s.next();
        }
        for (int i = 0,j=str.length-1; i <j; i++,j--) {
            if(str[i].compareTo(str[j])!=0)
            {
                temp=false;

            }
        }
        if(temp==true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}