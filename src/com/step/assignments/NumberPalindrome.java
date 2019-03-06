package com.step.assignments;

public class NumberPalindrome {

    public static void main(String[] args) {
        isPalindrome(-123);
    }

    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        Integer numberCopy = number;
        Integer reversedNumber = 0;
        Integer placeValue = (int) Math.pow(10,numberCopy.toString().length()-1);
         while (numberCopy>0){
             reversedNumber += (numberCopy%10)*placeValue;
             numberCopy = numberCopy/10;
             placeValue = placeValue/10;
         }
         if(number == reversedNumber) return true;
         return false;
    }
}
