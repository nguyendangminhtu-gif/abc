package org.example.demosof3041.buoi5;

public class StringManipulator {
    public String concatenate(String str1,  String str2){
        if(str1 == null || str2 == null){
            throw new NullPointerException("Một trong hai số đang bị null");
        }
        return str1 + str2;
    }
}
