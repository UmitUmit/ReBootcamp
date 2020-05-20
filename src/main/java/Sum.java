import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class Sum {


    //Create a programm that will take any String and print the total sum of number in the String
    //Note: if a number next to each other like 14, is not 1 and 4, rather 14
    //java45ai15sqre1at82 --> 45+15+1+82

    public static void main(String[] args) {

        String str = "java45ai15sqre1at82";
        int sum = 0;
        String num = "";  //4

        for(int i =0; i < str.length(); i++){

            if(Character.isDigit(str.charAt(i))){

                num += str.charAt(i);

                if(i ==str.length()-1 ||!Character.isDigit(str.charAt(i+1))){
                    sum += Integer.parseInt(num);
                    num = "";  //--> reseting num
                }

            }


        }

        System.out.println(sum);
    }
}
