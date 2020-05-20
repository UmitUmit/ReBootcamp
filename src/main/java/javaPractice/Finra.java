package javaPractice;

public class Finra {

    //Write a program that prints out the numbers from 1 to 30 but for the numbers which are a multiple
    // of 3, print "FIN" instead of the numbers which are a number of 5, print "RA" INSTEAD OF the
    // number. For numbers chich are a multiple of both 3 and 5, print "FINRA" instead of the number

public static void main(String[] args){

    for(int i = 1; i <= 30; i++){

        String print = "";

        if(i % 3 == 0) print = "FIN";

        if(i % 5 == 0) print += "RA";

        if(print.isEmpty()){
            System.out.println(i);
        } else{
            System.out.println(print);
        }

    }
}


}
