public class ArrayQthree {


    public static void main(String[] args){

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array element: ");

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        try{
            System.out.println("Accessing out  of bonds index: ");
            System.out.println(numbers[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Error: Invalid index la dei");
        }
    }
}
