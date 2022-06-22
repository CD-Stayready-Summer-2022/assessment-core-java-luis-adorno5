package com.codedifferently.assessment01.part05;

public class Palindrome {
    public Integer countPalindromes(String input){
        int palindromeCount = 0;
        for(int i = 0; i<input.length(); i++){
            palindromeCount += searchForPalindromes(i, i, input);
            palindromeCount += searchForPalindromes(i, i+1, input);
        }
        return palindromeCount;
    }

    private int searchForPalindromes(int l, int r, String input){
        int palindromeCount = 0;
        while(l >= 0 && r < input.length() && input.charAt(l) == input.charAt(r)){
            palindromeCount++;
            l -= 1;
            r += 1;
        }
        return palindromeCount;
    }

}
