/*
실습문제 12-(2)
 */
import java.util.Scanner;
import java.lang.String;

public class ArithmeticOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //키보드 표준 입력 스캐너 객체 생성
        System.out.print("연산>> ");

        int num1=sc.nextInt(); //피연산자1 받기
        String op=sc.next(); //next 디폴트로 문자열(string) 반환, blank 로 구분 연산자 받기
        int num2=sc.nextInt(); //피연산자2 받기
        int result=0; //결과값 선언 및 초기화

        switch(op){
            case "+": //연산자 op=="+" 덧셈 수행
                result=num1+num2;
                break;
            case "-": //연산자 op=="-" 뺄셈 수행
                result=num1-num2;
                break;
            case "*": //연산자 op=="*" 곱셈 수행
                result=num1*num2;
                break;
            case "/": //연산자 op=="/" 몫 연산 수행
                if(num2==0) { //0으로 나눌 경우 처리
                    System.out.print("0으로 나눌 수 없습니다.");
                    System.exit(0); //시스템 종료
                }
                else result=num1/num2;
                break;
            //사칙연산 이외의 경우 문자열 출력 후 시스템 종료
            default:
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
        }

        System.out.println(num1+op+num2+"의 계산 결과는 "+result); //연산 결과 출력
        sc.close(); //스캐너 닫기
    }
}
