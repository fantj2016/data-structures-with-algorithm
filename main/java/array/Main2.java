package java.array;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine()
                .replace("[","")
                .replace("]","")
                .split(",");
        int num = Integer.valueOf(scanner.nextLine());
        int []result = new int[split.length];
        int index = 0;
        int temp = 0;
        for (int i = 0; i < split.length; i += num ){
            if (i+num > split.length) {
                temp = i;
                break;
            }else {
                for (int j = i+num-1; j >= i; j--) {
                    result[index++] = Integer.valueOf(split[j]);
                }
            }
        }
        for (int i = temp; i<split.length;i++  ){
            result[index++] = Integer.valueOf(split[i]);
        }
        print(result);
    }
    public static void print(int [] a){
        System.out.print("[");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            if (i != a.length-1){
                System.out.print(",");
            }
            if (i == a.length-1){
                System.out.print("]");
            }
        }
    }
}
