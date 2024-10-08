public class ArrayQone {

    public static void main(String[] args){
    
    int[][] matrix = {
        {1, 2, 3}, //number
        {4, 5, 6, 7}, //number
        {8, 9} //number 
    };

    System.out.println("\nThe length of the array is: " + matrix.length + "\n");

    System.out.println("The length of ");
    for(int i = 0; i < matrix.length; i++){
        int r = i + 1;
        System.out.println("Sub-array " + r + " is: " + matrix[i].length);
    }
    

System.out.println("\nThose element of the array in a formatted manner is:");
    for(int i =0 ; i < matrix.length; ++i){
        for(int j =0; j<matrix[i].length;++j){
            System.out.print(matrix[i][j]);
        }
        System.out.println(" ");
    }    
}
}
