import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder str = new StringBuilder();

        for(int i = 0;  i < a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                str.append(Character.toLowerCase(c));
            }else{
                str.append(Character.toUpperCase(c));
            }
        }
        System.out.println(str.toString());
    }
}