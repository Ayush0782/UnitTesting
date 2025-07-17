package com.test.UnitTesting;


import org.springframework.stereotype.Component;

@Component
public class GenericMethod {

    public char getFirstCharacter(String s){
        if(s.length()==0){
            return ' ';
        }
        return s.charAt(0);
    }
    public char getLastCharacter(String s){
        if(s.length()==0){
            return ' ';
        }
        return s.charAt(s.length()-1);
    }
}
