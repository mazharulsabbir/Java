/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mazharulsabbir.examplejavaproject;

/**
 *
 * @author Sabbir
 */
public class Main {
    public static void main(String[] args) {
        println("Hello World!");
        // instance of user class
        var user = new User();
        var name = "Hell0";
        var age = 10;
    }

    private static void println(String msg){
        System.out.println(msg);
    }
    
    public static class User{
        public User(){
            // this is called constructor.
            System.out.println("Hi! I'm from User class.");
        }
    }
}
