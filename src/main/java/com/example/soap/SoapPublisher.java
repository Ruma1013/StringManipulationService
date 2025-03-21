package com.example.soap;

import javax.xml.ws.Endpoint;

public class SoapPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/stringmanipulation";
        Endpoint.publish(url, new StringManipulationService());
        System.out.println("SOAP Web Service started at: " + url);
    }
}
