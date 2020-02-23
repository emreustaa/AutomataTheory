/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta_2;

/**
 *
 * @author Emre USTA
 */
public class FormalAutomata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isAccepted("aab"));
        System.out.println(isConsecutive("00111"));
    }

    static boolean isAccepted(String input) {
        boolean varMi = false;

        String a[] = input.split("");
        for (int i = 0; i < a.length; i++) {
            if (!a[0].contains("a")) {

                return varMi;

            } else {
                if (a[1].contains("b")) {
                    varMi = true;
                    return varMi;
                }
            }

        }

        return varMi;
    }

    static boolean isConsecutive(String input) {

        boolean varMi = false;
        String a[] = input.split("");
        for (int i = 0; i < a.length - 2; i++) {
            if (a.length > 2) {
                if (a[i].contains("0") && a[i + 1].contains("0") && a[i + 2].contains("0")) {
                    varMi = true;

                }
            }

        }
        return varMi;
    }
}
