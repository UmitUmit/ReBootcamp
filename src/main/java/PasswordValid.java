public class PasswordValid {

    public static void main(String[] args) {

        String password = "a?G6jdaja";

        boolean length =  password.length() >= 8;
        boolean lower = password.matches(".*[a-z].*"); //--> include everthing from lowercase a-z
        boolean upper = password.matches(".*[A-Z].*"); //--> including everything from Capital A-Z
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@$?].*");


        boolean valid = length && lower && upper && number && special;

        if(valid){
            System.out.println("Password is valid");
        }else   System.out.println("Not a valid password");


    }
}
