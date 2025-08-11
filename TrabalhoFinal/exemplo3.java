import java.util.*;
public class exemplo3 {

public static boolean calculadora(float n, float a, float b) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    float res = 0.0f;
    if((n == 1.0f)) {
        res = (a + b);
        System.out.println(res);
        return true;
    }
    if((n == 2.0f)) {
        res = (a - b);
        System.out.println(res);
        return true;
    }
    if((n == 3.0f)) {
        res = (a * b);
        System.out.println(res);
        return true;
    }
    if((n == 4.0f)) {
        res = (a / b);
        System.out.println(res);
        return true;
    }
    return false;
}

public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    float a = 0.0f;
    float b = 0.0f;
    float n = 0.0f;
    boolean flag = false;
    a = sc.nextFloat();
    b = sc.nextFloat();
    flag = true;
    while(flag) {
        n = sc.nextFloat();
        flag = calculadora(n, a, b);
    }
}

}
