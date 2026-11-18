package misc;

/**
 * Roman Numeral Converter
 * @author Colm Roach
 * idk yet
 */
import java.util.Scanner;
public class RomanNumeralConverter {
    static Scanner scan = new Scanner(System.in);
    static char[] romanNumeralList = {'M','D','C','L','X','V','I'};
    static int[] romanNumeralValues = {1000, 500, 100, 50, 10, 5, 1};
    static String[] specialNumeralList = {"CM","CD","XC","XL","IX","IV"};
    static int[] specialNumeralValues = {900, 400, 90, 40, 9, 4};
    
    public static void main(String[] args) {
        String numeral = "null";
        int counter = 0;
        while(true){
            System.out.print("Input: ");
            numeral = scan.nextLine().toUpperCase();
            if(checker(numeral)){
                switch(counter){
                    case 0 -> {System.out.println("incorrect you dumb loser. you need to input a ROMAN NUMERAL! AS IN M, D, C, L, X, V, AND I YOU DUMB STUPID IDIOT! I HATE YOU! PEOPLE LIKE YOU ARE THE BANE OF MY EXISTENCE! YOU ONLY SERVE TO CAUSE PAIN AND SUFFERING TO ALL OF THOSE AROUND YOU! TRY AGAIN! MAYBE THIS TIME YOUR STUPID FACE WILL INPUT A VALID ROMAN NUMERAL!");counter++;}
                    case 1 -> {System.out.println("OH WOW! GOOD JOB YOU STUPID IDIOT! TWO TIMES! I MEAN SERIOUSLY YOU GOT IT WRONG TWICE! WHAT IS WRONG WITH YOU?");counter++;}
                    case 2 -> {System.out.println("STOP! WHY? WHY ARE YOU LIKE THIS?");counter++;}
                    case 3 -> {System.out.println("NO! NO THAT'S NOT RIGHT! DO IT AGAIN!");counter++;}
                    case 4 -> {System.out.println("OH MY GOD HOW? THIS IS RIDICULOUS! JUST DO BETTER!");counter++;}
                    case 5 -> {System.out.println("I'M LOSING MY PATIENCE!");counter++;}
                    case 6 -> {System.out.println("I'M GETTING UPSET!");counter++;}
                    case 7 -> {System.out.println("y'know what? I'm done. I'm ignoring you.");counter++;}
                }
            }
            else{break;}
        }
        System.out.println(converter(numeral));
    }

    public static int converter(String numeral) {
        int total = 0;
        for(int i = 0; i < numeral.length(); i++){
            for(int index = 0; index < specialNumeralList.length; index++){
                if((i+2) <= numeral.length()){
                    if(numeral.substring(i,i+2).equals(specialNumeralList[index])){
                        total = total + specialNumeralValues[index];
                        i = i + 2;
                    }
                }
            }
            if(i < numeral.length()){
                for(int index = 0; index < romanNumeralList.length; index++){
                    if(numeral.charAt(i) == romanNumeralList[index]){
                        total = total + romanNumeralValues[index];
                    }
                }
            }
        }
        return total;
    }
    
    public static boolean checker(String numeral) {
        for(int i = 0; i<numeral.length(); i++){
            for(int index = 0; index<romanNumeralList.length; index++){
                if(numeral.charAt(i) == romanNumeralList[index]){break;}
                else if(index == romanNumeralList.length-1){return true;}
            }
        }
        return false;
    }
}
