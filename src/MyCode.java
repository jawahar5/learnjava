import java.util.Scanner;

public class MyCode {

    private static void placementCheck(int cseVal, int eceVal, int mechVal){
        if(cseVal>eceVal && cseVal>mechVal) {
            System.out.println("Highest placement" );
            System.out.println("CSE" );
        }
        else if (eceVal>cseVal && eceVal > mechVal){
            System.out.println("Highest placement" );
            System.out.println("ECE" );
        }
        else if (mechVal>cseVal && mechVal > eceVal){
            System.out.println("Highest placement" );
            System.out.println("MECH" );
        }
        else if( cseVal==eceVal && cseVal==mechVal){
            System.out.println("None of the department has got the highest placement" );
        }
        else if(cseVal==eceVal )
        {
            System.out.println("Highest placement" );
            System.out.println("CSE"+"\n"+"ECE" );
        }
        else if (eceVal==mechVal){
            System.out.println("Highest placement" );
            System.out.println("ECE"+"\n"+"MECH" );
        }
        else if (eceVal==0 && cseVal==0 && mechVal==0){
            System.out.println("None of the department has got highest placement");
        }
    }
    public static void main(String[] args) {
        int cseCount=0;
        int eceCount=0;
        int mechCount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        cseCount = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        eceCount = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        mechCount = sc.nextInt();
        if(eceCount<0 || cseCount<0 || mechCount <0){
            System.out.println("Input is Invalid ");
        } else
        if(eceCount>=0 && cseCount>=0 & mechCount >=0){
            placementCheck(cseCount, eceCount, mechCount);
        }
    }
}
