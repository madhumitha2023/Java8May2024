package io.pragra.learning.october26;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "aabbbcccdddee";
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        for(char ch : input.toCharArray()){
            if(!seen[ch]){
                seen[ch] = true;
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}