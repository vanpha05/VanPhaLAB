/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author LENOVO
 */
public class ChangeBaseNum {

    private int fromBase;
    private int toBase;
    private String input;

    public ChangeBaseNum(int fromBase, int toBase, String input) {
        this.fromBase = fromBase;
        this.toBase = toBase;
        this.input = input;
    }

    int binToDec() {
        int result = 0;
        int base = 1;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '1') {
                result += base;
            }
            base *= 2;
        }
        return result;
    }

    String decToBin() {
        int dec = Integer.parseInt(input);
        if (dec == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (dec != 0) {
            result.insert(0, Integer.toString(dec % 2));
            dec /= 2;
        }
        return result.toString();
    }

    String decToHex() {
        final char[] HEXDIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int dec = Integer.parseInt(input);
        if (dec == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (dec != 0) {
            result.insert(0, HEXDIGITS[dec % 16]);
            dec /= 16;
        }
        return result.toString();
    }

    int hexToDec() {
        int result = 0;
        int base = 1;
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            if (c >= '0' && c <= '9') {
                result += base * (c - '0');
            } else {
                result += base * (c - 'A' + 10);
            }
            base *= 16;
        }
        return result;
    }

    String hexToBin() {
        input = Integer.toString(hexToDec());
        return decToBin();
    }

    String binToHex() {
        input = Integer.toString(binToDec());
        return decToHex();
    }
}
