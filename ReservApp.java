package num12;

import java.util.Scanner;

public class ReservApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Reservation reservation=new Reservation();
        int serviceSelect;

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            serviceSelect=scanner.nextInt();

            switch (serviceSelect){
                case 1:
                    reservation.addRes();
                    break;
                case 2:
                    reservation.getAllRes();
                    break;
                case 3:
                    reservation.deleteRes();
                    break;
                case 4:
                    scanner.close();
                    return; //return으로 종료
                //없는 메뉴 입력 시 재입력
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    break;
            }
        }
    }

}
