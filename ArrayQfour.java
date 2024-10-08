public class ArrayQfour {
    public static void main(String[] args){
        boolean isLoggedIn = true;
        boolean hasPermission = false;

    if(!isLoggedIn){
        System.out.println("Access denied: you are not logged in");
    }else if(!hasPermission){
        System.out.println("Access denied: does not has permission ");
    }else{
        System.out.println("Access granted");
    }

    }    
}
