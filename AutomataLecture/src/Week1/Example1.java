/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.Scanner;

/**
 *
 * @author Emre USTA
 */
public class Example1 {

    public static void main(String[] args) {
        String gelen;
        System.out.println("Bir string giriniz\n");
        Scanner s = new Scanner(System.in);
        gelen = s.nextLine();
        System.out.println(gelen);
        System.out.println("Dogru mu : " + validate(gelen));

    }

    static boolean validate(String gelen) {

        String state = "-1";
        for (char c : gelen.toCharArray()) {
            if (c == '0') {
                state = "0";
               
            }
            if (state.equals("0") && c == '1') {
                return true;
            }
        }

        return false;
    }

}
