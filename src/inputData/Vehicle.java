package inputData;

import java.util.Scanner;

public class Vehicle {
// any function defined as static is not required to be instantiated
    // it can be called directly by using classname and dot access specifier
    public static void drive(String vehicleName){
        System.out.println("I am driving a "+vehicleName);
    }

    // it is mandatory to provide access specifier to each function and classes. default is private
    // it will allow access within the package.
    public void  describe(){
        int No;
        System.out.println("Enter the number of Wheels");
        Scanner noOfWheels = new Scanner(System.in);
        No = Integer.valueOf(noOfWheels.nextLine());
//        No = sc.nextLine();
        System.out.println("Chosen the vehicle with "+No);
        noOfWheels.close();
    }
}
