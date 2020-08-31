import java.util.Arrays;
import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        System.out.println("Enter 5 elements for an array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }


        while (true){
            System.out.println("Enter choice-->");
            System.out.println("1.Sum of all elements");
            System.out.println("2.Sum of all alternative elements");
            System.out.println("3.Second largest element");
            int choice1=sc.nextInt();

            switch (choice1){

                case 1:
                    //1
                    int sum1=0;
                    for(int i=0;i<5;i++){
                        sum1=sum1+arr[i];
                    }
                    System.out.println("Sum is:"+sum1);
                    break;


                case 2:
                    //2
                    int sum2=0;
                    for(int i=0;i<5;i+=2){
                        sum2=sum2+arr[i];
                    }
                    System.out.println("Sum of alternative elements:"+sum2);
                    break;


                case 3:
                    //3
                    Arrays.sort(arr);
                    System.out.println("Second highest element:"+arr[3]);
                    break;


                default:
                    System.out.println("None of the choices were selected1");
                    break;



            }

            System.out.println("\n");


            System.out.println("[1]CONTINUE");
            System.out.println("[2]END");
            System.out.println("Choose option:");
            int choice2=sc.nextInt();

            if(choice2==1){
                continue;
            }else if(choice2==2){
                break;
            }else{
                System.out.println("None of the choices were selected2");
            }



        }


    }
}
