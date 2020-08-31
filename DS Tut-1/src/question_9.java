import java.util.Arrays;
import java.util.Scanner;



public class question_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of pairs want to add: ");
        int n = s.nextInt();
        pairs[] pair = new pairs[n];
        for (int i = 0; i <pair.length; i++) {
            pair[i]= new pairs(s.nextInt(),s.nextInt());
        }


        for (int i = 0; i <pair.length ; i++) {
            if(pair[i].getA1()>pair[i].getA2())
            {
                int a1 = pair[i].getA1();
                int a2 = pair[i].getA2();
                pair[i].setA2(a1);
                pair[i].setA1(a2);
            }
        }
        int i = 0;
        System.out.print("[");
        while (i <pair.length) {
            System.out.print("("+pair[i].getA1()+","+pair[i].getA2()+")");
            i++;
        }
        System.out.print("]");
    }



    static class pairs
    {
        int a1;
        int a2;

        public void setA1(int a1) {
            this.a1 = a1;
        }

        public void setA2(int a2) {
            this.a2 = a2;
        }

        public int getA1() {
            return a1;
        }

        public int getA2() {
            return a2;
        }

        public pairs(int a1, int a2) {
            this.a1 = a1;
            this.a2 = a2;
        }
    }
}