public class ArrayQtwo {
    public static void main(String[] args){
        int[] intArray = new int[4];
        double[] doubleArray = new double[4];
        char[] charArray = new char[4];
        boolean[] booleanArray = new boolean[4];
        String[] stringArray = new String[4];

        System.out.println("Default value of int array: ");
        for(int i = 0; i < intArray.length; i++){
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        System.out.println("\nDefault value of double array: ");
        for(int i = 0; i < doubleArray.length; i++){
            System.out.println("Element at index " + i + ": " + doubleArray[i]);
        }

        System.out.println("\nDefault value of char array: ");
        for(int i = 0; i < charArray.length; i++){
            System.out.println("Element at index " + i + ": '" + charArray[i] + "'");
        }

        System.out.println("\nDefault value of boolean array: ");
        for(int i = 0; i < booleanArray.length; i++){
            System.out.println("Element at index " + i + ": " + booleanArray[i]);
        }

        System.out.println("\nDefault value of String array: ");
        for(int i = 0; i < stringArray.length; i++){
            System.out.println("Element at index " + i + ": " + stringArray[i]);
        }
    }
}
