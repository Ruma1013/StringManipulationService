package com.example.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class StringManipulationService {

    @WebMethod
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @WebMethod
    public int countCharacters(String text) {
        return text.length();
    }
}
