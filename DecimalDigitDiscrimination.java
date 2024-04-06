/*
실습문제 2번
 */
import java.util.Scanner;
public class DecimalDigitDiscrimination {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //키보드 표준 입력 스캐너 객체 생성

        System.out.print("2자리수 정수 입력(10~99)>> ");
        int num=sc.nextInt(); //sc로 부터 두자리 정수 받기

        int unit=num%10; ///십의 자리 구하기
        int tens=num/10; //일의 자리 구하기

        if(unit==tens) System.out.println("Yes! 10의 자리와 1의 자리가 같습니다."); //십의 자리 일의 자리 일치
        else System.out.println("No! 10의 자리와 1의 자리가 다릅니다."); //십의 자리 일의 자리 불일치

        sc.close(); //스캐너 닫기
    }
}
