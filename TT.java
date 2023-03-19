import java.util.Scanner;
import java.util.TreeMap;
import java.util.List;
import java.util.EmptyStackException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class TT {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();

        calc(input);

    }

    public static String calc(String input){
        String string = input;
        String char_1, char_2;
        String[] chars = new String[3];
        int num_1, num_2, res;
        String result;

        if(string.contains("I") || string.contains("V") || string.contains("X")){
            if(string.contains("+")) {
                chars = string.split("\\+");
                char_1 = chars[0];
                char_2 = chars[1];

                if(char_1.contains("I") || char_1.contains("V") || char_1.contains("X")){
                    if(char_2.contains("I") || char_2.contains("V") || char_2.contains("X")){
                switch(char_1){
                    case "I":
                        char_1 = "1";
                        break;
                    case "II":
                        char_1 = "2";
                        break;
                    case "III":
                        char_1 = "3";
                        break;
                    case "IV":
                        char_1 = "4";
                        break;
                    case "V":
                        char_1 = "5";
                        break;
                    case "VI":
                        char_1 = "6";
                        break;
                    case "VII":
                        char_1 = "7";
                        break;
                    case "VIII":
                        char_1 = "8";
                        break;
                    case "IX":
                        char_1 = "9";
                        break;
                    case "X":
                        char_1 = "10";
                        break;
                }
                switch(char_2){
                    case "I":
                        char_2 = "1";
                        break;
                    case "II":
                        char_2 = "2";
                        break;
                    case "III":
                        char_2 = "3";
                        break;
                    case "IV":
                        char_2 = "4";
                        break;
                    case "V":
                        char_2 = "5";
                        break;
                    case "VI":
                        char_2 = "6";
                        break;
                    case "VII":
                        char_2 = "7";
                        break;
                    case "VIII":
                        char_2 = "8";
                        break;
                    case "IX":
                        char_2 = "9";
                        break;
                    case "X":
                        char_2 = "10";
                        break;
                }
                    }
                }

                num_1 = Integer.parseInt(char_1);
                num_2 = Integer.parseInt(char_2);

                res = num_1 + num_2;
                result = List.of("", "M", "MM", "MMM", "MMMM").get(res / 1000) +
                List.of("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM").get(res / 100 % 10) +
                List.of("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC").get(res / 10 % 10) +
                List.of("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX").get(res % 10);
                System.out.println(result);
     
            } else if(string.contains("-")){
                chars = string.split("\\-");
                char_1 = chars[0];
                char_2 = chars[1];

                if(char_1.contains("I") || char_1.contains("V") || char_1.contains("X")){
                    if(char_2.contains("I") || char_2.contains("V") || char_2.contains("X")){
                switch(char_1){
                    case "I":
                        char_1 = "1";
                        break;
                    case "II":
                        char_1 = "2";
                        break;
                    case "III":
                        char_1 = "3";
                        break;
                    case "IV":
                        char_1 = "4";
                        break;
                    case "V":
                        char_1 = "5";
                        break;
                    case "VI":
                        char_1 = "6";
                        break;
                    case "VII":
                        char_1 = "7";
                        break;
                    case "VIII":
                        char_1 = "8";
                        break;
                    case "IX":
                        char_1 = "9";
                        break;
                    case "X":
                        char_1 = "10";
                        break;
                }
                switch(char_2){
                    case "I":
                        char_2 = "1";
                        break;
                    case "II":
                        char_2 = "2";
                        break;
                    case "III":
                        char_2 = "3";
                        break;
                    case "IV":
                        char_2 = "4";
                        break;
                    case "V":
                        char_2 = "5";
                        break;
                    case "VI":
                        char_2 = "6";
                        break;
                    case "VII":
                        char_2 = "7";
                        break;
                    case "VIII":
                        char_2 = "8";
                        break;
                    case "IX":
                        char_2 = "9";
                        break;
                    case "X":
                        char_2 = "10";
                        break;
                }
                    }
                }
                
                num_1 = Integer.parseInt(char_1);
                num_2 = Integer.parseInt(char_2);

                res = num_1 - num_2;
                result = List.of("", "M", "MM", "MMM", "MMMM").get(res / 1000) +
                List.of("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM").get(res / 100 % 10) +
                List.of("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC").get(res / 10 % 10) +
                List.of("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX").get(res % 10);
                System.out.println(result);
     
            } else if(string.contains("*")){
                chars = string.split("\\*");
                char_1 = chars[0];
                char_2 = chars[1];
    
                if(char_1.contains("I") || char_1.contains("V") || char_1.contains("X")){
                    if(char_2.contains("I") || char_2.contains("V") || char_2.contains("X")){

                switch(char_1){
                    case "I":
                        char_1 = "1";
                        break;
                    case "II":
                        char_1 = "2";
                        break;
                    case "III":
                        char_1 = "3";
                        break;
                    case "IV":
                        char_1 = "4";
                        break;
                    case "V":
                        char_1 = "5";
                        break;
                    case "VI":
                        char_1 = "6";
                        break;
                    case "VII":
                        char_1 = "7";
                        break;
                    case "VIII":
                        char_1 = "8";
                        break;
                    case "IX":
                        char_1 = "9";
                        break;
                    case "X":
                        char_1 = "10";
                        break;
                }
                switch(char_2){
                    case "I":
                        char_2 = "1";
                        break;
                    case "II":
                        char_2 = "2";
                        break;
                    case "III":
                        char_2 = "3";
                        break;
                    case "IV":
                        char_2 = "4";
                        break;
                    case "V":
                        char_2 = "5";
                        break;
                    case "VI":
                        char_2 = "6";
                        break;
                    case "VII":
                        char_2 = "7";
                        break;
                    case "VIII":
                        char_2 = "8";
                        break;
                    case "IX":
                        char_2 = "9";
                        break;
                    case "X":
                        char_2 = "10";
                        break;
                }
                    }
                }
                
                num_1 = Integer.parseInt(char_1);
                num_2 = Integer.parseInt(char_2);

                res = num_1 * num_2;
                result = List.of("", "M", "MM", "MMM", "MMMM").get(res / 1000) +
                List.of("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM").get(res / 100 % 10) +
                List.of("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC").get(res / 10 % 10) +
                List.of("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX").get(res % 10);
                System.out.println(result);
     
            } else if(string.contains("/")){
                chars = string.split("\\/");
                char_1 = chars[0];
                char_2 = chars[1];
    
                if(char_1.contains("I") || char_1.contains("V") || char_1.contains("X")){
                    if(char_2.contains("I") || char_2.contains("V") || char_2.contains("X")){
                switch(char_1){
                    case "I":
                        char_1 = "1";
                        break;
                    case "II":
                        char_1 = "2";
                        break;
                    case "III":
                        char_1 = "3";
                        break;
                    case "IV":
                        char_1 = "4";
                        break;
                    case "V":
                        char_1 = "5";
                        break;
                    case "VI":
                        char_1 = "6";
                        break;
                    case "VII":
                        char_1 = "7";
                        break;
                    case "VIII":
                        char_1 = "8";
                        break;
                    case "IX":
                        char_1 = "9";
                        break;
                    case "X":
                        char_1 = "10";
                        break;
                }
                switch(char_2){
                    case "I":
                        char_2 = "1";
                        break;
                    case "II":
                        char_2 = "2";
                        break;
                    case "III":
                        char_2 = "3";
                        break;
                    case "IV":
                        char_2 = "4";
                        break;
                    case "V":
                        char_2 = "5";
                        break;
                    case "VI":
                        char_2 = "6";
                        break;
                    case "VII":
                        char_2 = "7";
                        break;
                    case "VIII":
                        char_2 = "8";
                        break;
                    case "IX":
                        char_2 = "9";
                        break;
                    case "X":
                        char_2 = "10";
                        break;
                }
                    }
                }

                num_1 = Integer.parseInt(char_1);
                num_2 = Integer.parseInt(char_2);

                res = num_1 / num_2;
                result = List.of("", "M", "MM", "MMM", "MMMM").get(res / 1000) +
                List.of("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM").get(res / 100 % 10) +
                List.of("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC").get(res / 10 % 10) +
                List.of("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX").get(res % 10);
                System.out.println(result);
     
            
            }
            
        } else if(string.contains("+")){
                chars = string.split("\\+");
                char_1 = chars[0];
                char_2 = chars[1]; 

                num_1 = Integer.parseInt(char_1);
                num_2 = Integer.parseInt(char_2);
                
                if(num_1 > 0 && num_1 < 11 && num_2 > 0 && num_2 < 11)
                {
                res = num_1 + num_2;
                result = Integer.toString(res);
                System.out.println(result);
                } else {
                    System.out.println("Invalid.Input.Exception: programm terminated");
                }

        } else if(string.contains("-")){
                chars = string.split("\\-");
                char_1 = chars[0];
                char_2 = chars[1];
                
                num_1 = Integer.parseInt(char_1);
                num_2 = Integer.parseInt(char_2);

                if(num_1 > 0 && num_1 < 11 && num_2 > 0 && num_2 < 11)
                {
                res = num_1 - num_2;
                result = Integer.toString(res);
                System.out.println(result);
                } else {
                    System.out.println("Invalid.Input.Exception: programm terminated");
                }

        } else if(string.contains("*")){
                chars = string.split("\\*");
                char_1 = chars[0];
                char_2 = chars[1];
                
                num_1 = Integer.parseInt(char_1);
                num_2 = Integer.parseInt(char_2);

                if(num_1 > 0 && num_1 < 11 && num_2 > 0 && num_2 < 11)
                {
                res = num_1 * num_2;
                result = Integer.toString(res);
                System.out.println(result);
                } else {
                    System.out.println("Invalid.Input.Exception: programm terminated");
                }

        } else if(string.contains("/")){
                chars = string.split("\\/");
                char_1 = chars[0];
                char_2 = chars[1];
                
                num_1 = Integer.parseInt(char_1);
                num_2 = Integer.parseInt(char_2);

                if(num_1 > 0 && num_1 < 11 && num_2 > 0 && num_2 < 11)
                {
                res = num_1 / num_2;
                result = Integer.toString(res);
                System.out.println(result);
                } else {
                    System.out.println("Invalid.Input.Exception: programm terminated");
                }
            }

        return string;
    }
}
