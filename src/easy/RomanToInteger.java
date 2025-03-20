package easy;

import java.util.Scanner;


    public class RomanToInteger {
        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            String n = scanner.nextLine();
            System.out.println(romanToInt(n));

        }

        public static int romanToInt(String s) {

            int resp = 0;
            int atual = 0;
            int prox = atual + 1;


            while (atual < s.length()){
                if (s.charAt(atual) == 'I'){
                    if(s.charAt(0) == 'I' && s.length() == 1){
                        resp+=1;
                    }
                    else if (s.charAt(prox) == 'X') {
                        resp += 9;
                        atual+=1;
                        prox+=1;
                    }
                    else if ((s.charAt(prox) == 'V')){
                        resp+=4;
                        atual+=1;
                        prox+=1;
                    }else resp+=1;
                } else if (s.charAt(atual) == 'X'){
                    if(s.charAt(0) == 'X' && s.length() == 1){
                        resp+=10;
                    }
                    else if (s.charAt(prox) == 'L') {
                        resp += 40;
                        atual+=1;
                        prox+=1;
                    }
                    else if ((s.charAt(prox) == 'C')){
                        resp+=90;
                        atual+=1;
                        prox+=1;
                    }else resp+=10;
                } else if (s.charAt(atual) == 'C'){
                    if(s.charAt(0) == 'C' && s.length() == 1){
                        resp+=100;
                    }
                    else if (s.charAt(prox) == 'D') {
                        resp += 400;
                        atual+=1;
                        prox+=1;
                    }
                    else if ((s.charAt(prox) == 'M')){
                        resp+=900;
                        atual+=1;
                        prox+=1;
                    }else resp+=100;

                } else if (s.charAt(atual) == 'M'){
                    resp+=1000;
                } else if (s.charAt(atual) == 'D') {
                    resp+=500;
                } else if (s.charAt(atual) == 'L') {
                    resp+=50;
                } else if (s.charAt(atual) == 'V') {
                    resp+=5;
                }


                atual+=1;
                if(atual == s.length()-1){
                    prox = atual;
                }else prox += 1;


            }


            return resp;
        }
}
