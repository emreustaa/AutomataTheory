/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Emre USTA
 */
public class Example2 {
    
    static ArrayList<String> list = new ArrayList();

    public static void main(String[] args) {
        populate(3, "");
        List<String> l = list.stream().filter(elm -> !elm.contains("11")).collect(Collectors.toList());
        
        print(l);
    }
    
    static void print(List<String> l) {
        for (String s : l) {
            System.out.println(s);
        }
    }
    
    static void populate(int n, String str) {
        if (str.length() == n) {
            list.add(str);
        } else {
            populate(n, str + "0");
            populate(n, str + "1");
        }
    }
    
}
