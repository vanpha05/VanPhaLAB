/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.bai2;

/**
 *
 * @author LENOVO
 */
public class Number {

    private String value;

    public String getValue() {
        return value;
    }

    public Number(String value) {
        this.value = value;
    }

    public Number addTwoNum(Number o) {
        return new Number(addLargeNum(this.value, o.value));
    }

    public String addLargeNum(String so1, String so2) {

        int max = Math.max(so1.length(), so2.length());
        so1 = String.format("%" + max + "s", so1).replace(' ', '0');
        so2 = String.format("%" + max + "s", so2).replace(' ', '0');
        StringBuilder result = new StringBuilder();
        int sodu = 0;
        for (int i = so1.length() - 1; i >= 0; i--) {
            int s1 = so1.charAt(i) - '0';
            int s2 = so2.charAt(i) - '0';
            int sum = s1 + s2 + sodu;
            result.append(sum % 10);
            sodu = sum / 10;
        }
        if (sodu > 0) {
            result.append(sodu);

        }
        return result.reverse().toString();
    }

    public String MutiplyLargeNum(String so1, String so2) {
        
        return "";
    }
}
