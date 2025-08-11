import java.util.*;
public class exemplo2 {

public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    float rd = 0.0f;
    boolean flag = false;
    flag = true;
    rd = sc.nextFloat();
    while(flag) {
        if((rd < 10.0f)) {
            flag = false;
        }
        rd = sc.nextFloat();
        System.out.println(rd);
    }
}

}
