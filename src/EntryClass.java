// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import arrayExamples.BasicArray;
import inputData.Vehicle;
import learnInheritance.ParentClass;
import learnInheritance.ToCallFewFn;
import methodOverloading.MethodOverloadingSample;

import java.util.Scanner;


public class EntryClass  {   // extends ParentClass
    public static void main(String[] args) {
        int val1;
        int val2;
        int answer;

        Vehicle v1 = new Vehicle();
        Vehicle.drive("car");
        v1.describe();
        ParentClass fromInheritancePack = new ParentClass();
       int result= fromInheritancePack.ParentConstructor(5,6);
       System.out.println("Using a parameterized Constructor to get addition of two numbers "+result);
//       fromInheritancePack.displayPrivateFn() // won't work because private function can be accessed within the package only
//        fromInheritancePack.displayProtectedFn(); protected can be accessed between classes if it is from the same package. not from a different package. it needs inheritance
        ToCallFewFn Sample = new ToCallFewFn();
        Sample.homeFn();
        MethodOverloadingSample methodOverloading = new MethodOverloadingSample();
        answer= methodOverloading.add(5, 6);
        System.out.println("Two param method gives: "+answer);
        answer= methodOverloading.add(5, 6,8   );
        System.out.println("Three param method gives: "+answer);
        answer= methodOverloading.add(5, 6,3,5);
        System.out.println("Four param method gives: "+answer);

//        MyCode mycode = new MyCode();
//        mycode.InitialFn();

        BasicArray arr1 = new BasicArray();
        arr1.simpleArray();
        arr1.multiDimensional();
        System.out.println("Enter two values one after the other in two lines");

        Scanner sc = new Scanner(System.in);
        val1 = Integer.parseInt(sc.nextLine());
        val2=Integer.parseInt(sc.nextLine());
        arr1.userDefinedArray(val1, val2);
        sc.close();
    }
}

//import java.util.Scanner;
//
//public class EntryClass {
//
//    private static void placementCheck(int cseVal, int eceVal, int mechVal){
//        if(cseVal>eceVal && cseVal>mechVal) {
//            System.out.println("Highest placement" );
//            System.out.println("CSE" );
//        }
//        else if (eceVal>cseVal && eceVal > mechVal){
//            System.out.println("Highest placement" );
//            System.out.println("ECE" );
//        }
//        else if (mechVal>cseVal && mechVal > eceVal){
//            System.out.println("Highest placement" );
//            System.out.println("MECH" );
//        }
//        else if( cseVal==eceVal && cseVal==mechVal){
//            System.out.println("None of the department has got the highest placement" );
//        }
//        else if(cseVal==eceVal )
//        {
//            System.out.println("Highest placement" );
//            System.out.println("CSE"+"\n"+"ECE" );
//        }
//        else if (eceVal==mechVal){
//            System.out.println("Highest placement" );
//            System.out.println("ECE"+"\n"+"MECH" );
//        }
//        else if (eceVal==0 && cseVal==0 && mechVal==0){
//            System.out.println("None of the department has got highest placement");
//        }
//    }
//    public static void main(String[] args) {
//        int cseCount=0;
//        int eceCount=0;
//        int mechCount=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no of students placed in CSE:");
//        cseCount = sc.nextInt();
//        System.out.println("Enter the no of students placed in ECE:");
//        eceCount = sc.nextInt();
//        System.out.println("Enter the no of students placed in MECH:");
//        mechCount = sc.nextInt();
//        if(eceCount<0 || cseCount<0 || mechCount <0){
//                System.out.println("Input is Invalid ");
//        } else
//        if(eceCount>=0 && cseCount>=0 & mechCount >=0){
//            placementCheck(cseCount, eceCount, mechCount);
//        }
//    }
//}
