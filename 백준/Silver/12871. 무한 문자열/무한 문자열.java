import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        String t = bf.readLine();
        int sLen = s.length();
        int tLen = t.length();

        if(sLen == tLen){
            if(Objects.equals(s,t)){
                System.out.println(1);
            } else System.out.println(0);
            return;
        }

        int lcm = lcm(sLen, tLen);

        StringBuilder ss = new StringBuilder();
        StringBuilder tt = new StringBuilder();

        while(ss.length() != lcm) {
            ss.append(s);
        }
        while(tt.length() != lcm){
            tt.append(t);
        }

        if(ss.compareTo(tt) == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        /**
         * 1. 두 문자열의 길이 비교
         * 2. 길이가 같은 경우 문자열 바로 비교
         * 3. 길이가 다른 경우 최소공배수 구해서 비교
         * **/
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}