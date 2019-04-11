package java.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(",");
        Set<String> set = new HashSet<>(Arrays.asList(split));
        String flag = null;
        flag = set.size() == split.length ? "false" : "true";
        System.out.println(flag);
    }
}

