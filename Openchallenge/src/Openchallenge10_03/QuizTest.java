package Openchallenge10_03;

import java.util.Scanner;

public class QuizTest {

    public static void main(String[] args) {

        String num = "";
        String temp = "";
        boolean value = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");

        num = scan.nextLine();
        for(int i=0; i<num.length()-1; i++){
            temp += num.charAt(i);
            if(temp.indexOf(num.charAt(i+1)) != -1){
            	value = false;
            }
        }

        System.out.println(value);
    }
}