import java.util.Arrays;
import java.util.Scanner;
public class Placement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
  int a = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int b = sc.nextInt();
         System.out.println("Enter the no of students placed in MECH:");
        int c = sc.nextInt();

        if(a>0 && b>0 && c>0){
            if(a>b && a>c){
                System.out.println("Highest placement" );
                System.out.println("CSE" );
            } else if(b>a && b>c){
                System.out.println("Highest placement" );
                System.out.println("ECE" );
            }
            else if(c>a && c>b){
                System.out.println("Highest placement" );
                System.out.println("MECH" );
            }
            else if( a==b && b==c){
                System.out.println("None of the department has got the highest placement" );

            } else if (a==b){
                System.out.println("Highest placement" );
                System.out.println("CSE"+"\n"+"ECE" );
            }
            else if(b==c){
                System.out.println("Highest placement" );
                System.out.println("ECE" );
            }
        } else if (a==0 && b==0 && c==0){
            System.out.println("None of the department has got highest placement");
        }else {
            System.out.println("Input is invalid");
        }
    }
}
