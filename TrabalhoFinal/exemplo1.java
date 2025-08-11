import java.util.*;
public class exemplo1 {

public static float soma(float a, float b) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    return (a + b);
}

public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    float n = 0.0f;
    float sum = 0.0f;
    float rd = 0.0f;
    n = 5.0f;
    sum = 0.0f;
    rd = 0.0f;
    while((n > 0.0f)) {
        rd = sc.nextFloat();
        sum = soma(sum, rd);
        n = (n - 1.0f);
    }
    System.out.println(sum);
}

}
