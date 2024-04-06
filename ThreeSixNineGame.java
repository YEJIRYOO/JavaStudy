/*
실습문제 6번
 */
import java.util.Scanner;

public class ThreeSixNineGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>> ");
        int num = sc.nextInt(); //정수 입력 받기

        int unit = num % 10; // 일의 자리 구하기
        int tens = num / 10; // 십의 자리 구하기

        // 3/6/9 가 나오지 않는 경우 (패스) 출력
        if ((unit != 3 && unit != 6 && unit != 9) && (tens != 3 && tens != 6 && tens != 9)) {
            System.out.println("(패스)");
        }
        // 3/6/9 가 나오는 횟수 세기
        // 한 번 나오는 경우 count=1
        // 두 번 나오는 경우 count=2
        else {
            int count = 0;
            if (unit == 3 || unit == 6 || unit == 9) count++;
            if (tens == 3 || tens == 6 || tens == 9) count++;

            if (count == 1) {
                System.out.println("박수짝");
            } else if (count == 2) {
                System.out.println("박수짝짝");
            }
        }

        sc.close();
    }
}