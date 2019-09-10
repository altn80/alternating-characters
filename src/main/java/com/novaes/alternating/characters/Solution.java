/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.alternating.characters;

/**
 *
 * @author kbos
 */
public class Solution {
    
    
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int deletions = 0;
        char previous = Character.MIN_VALUE;
        for(char c : s.toCharArray()) {
            if(previous != Character.MIN_VALUE) {
                if(previous == c) {
                    deletions++;
                }
            }
            previous = c;
        }
        return deletions;
    }
}
