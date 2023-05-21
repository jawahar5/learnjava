package arrayExamples;

public class BasicArray {
    public void simpleArray(){
        int arr[] = new int[3];
        arr[0]= 4;
        arr[1] = 5;
        arr[2]=3;

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public void multiDimensional(){
        int arr[][]= new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]= (int)(Math.random() *100);
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        for (int n[] : arr){
            for(int  m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

    public void userDefinedArray(int a, int b){
        int arr[][]= new int[a][b];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]= (int)(Math.random() *100);
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
