package javaPractice;

public class Anagram {

    public static void main(String[] args) {

        String a = "listen";
        String b = "silent";

        if(a.length() != b.length()){
            System.out.println("Not anagram");
            System.exit(0);    //----> we can't use break because this is loop, we can only stop it.
        }

        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");


        for(int i = 0; i < a.length(); i++){

            b = b.replaceFirst("" + a.charAt(i), "");

        }

        if(b.isEmpty()){

            System.out.println("Anagram");

        }else{
            System.out.println("Not Anagram");

        }

        //print(b.isEmpty() ? "Anagram" : " Not Anagram");  --> using ternary




    }

}
