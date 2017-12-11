/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.example_evosuite;

/**
 *
 * @author koduki
 */
public class FizBuzz {

    public static String apply(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Fizz";
        } else if (num % 3 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
