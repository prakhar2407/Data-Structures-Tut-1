import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);

            int arr[]=new int[10];

            System.out.println("Enter 10 integers for array");
            for (int j=0;j<10;j++){
                arr[j]=sc.nextInt();
            }

            //1
            System.out.println("Numbers at even index:");
            for(int j=0;j<10;j+=2){
                System.out.print(arr[j]+" , ");
            }

            System.out.println("\n");

            //2
            System.out.println("Every odd element:");
            for (int j=0;j<10;j++){
                if(arr[j]%2!=0){
                    System.out.print(arr[j]+" , ");
                }
            }

            System.out.println("\n");

            //3
            System.out.println("Elements in reverse order:");
            for(int j=9;j>=0;j--){
                System.out.print(arr[j]+" , ");
            }

            System.out.println("\n");

            //4
            System.out.println("Only first and last element:");
            System.out.print(arr[0]+" and "+arr[9]);

            System.out.println("\n");

            System.out.println("Choose option:");
            System.out.println("[1]CONTINUE");
            System.out.println("[2]END");
            int choice=sc.nextInt();

            if(choice==1){
                continue;
            }else if(choice==2){
                break;
            }else{
                System.out.println("None of the choices were selected2");
            }

        }

    }
}
