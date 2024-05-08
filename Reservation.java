package num12;

import java.util.Scanner;

public class Reservation {
    private String[] S;
    private String[] A;
    private String[] B;
    Scanner scanner=new Scanner(System.in);

    public Reservation(){
        S=new String[10];
        A=new String[10];
        B=new String[10];

        for(int i=0;i<10;i++){
            S[i]="---";
            A[i]="---";
            B[i]="---";
        }
    }

    //좌석 예약
    //번호 범위 벗어날 시 재입력
    public void setSeat(String[] type) {
        System.out.print("이름>>");
        String name= scanner.next();
        while(true){
            System.out.print("번호>>");
            int seat=scanner.nextInt();
            if(seat<10&&seat>0){
                type[seat-1]=name;
                break;
            }
            else {
                System.out.println("존재하지 않는 번호입니다. 다시 입력하세요.");
            }
        }


    }

    //좌석 예약 취소
    //이름 조회 실패 시 재입력
    public void deleteSeat(String[] type){
        boolean check=false;
        while(true){
            printSeat(type);
            System.out.print("이름>>");
            String name= scanner.next();
            for(int i=0;i<10;i++){
                if(type[i].equals(name)){
                    type[i]="---";
                    check=true;
                    break;
                }
            }
            if(check==true) break;
            else if(check==false){
                System.out.println("존재하지 않는 이름입니다. 다시 입력하세요.");
                }
            }
        }

    public void printSeat(String[] type){
        for(int i=0;i<10;i++)System.out.print(type[i]+" ");
        System.out.println();
    }

    //좌석 예약
    //잘못된 좌석 유형 선택 시 재입력
    public void addRes(){
        boolean check = false;
        while(!check){
            System.out.print("좌석구분 S(1), A(2), B(3) >>");
            int seatType= scanner.nextInt();
            switch (seatType){
                case 1:
                    System.out.print("S>> ");
                    printSeat(S);
                    setSeat(S); //동일 클래스 내에 존재
                    check=true;
                    break;
                case 2:
                    System.out.print("A>> ");
                    printSeat(A);
                    setSeat(A);
                    check=true;
                    break;
                case 3:
                    System.out.print("B>> ");
                    printSeat(B);
                    setSeat(B);
                    check=true;
                    break; //break 잊지 말기
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }

        }

    }

    public void getAllRes(){
        System.out.print("S>>");
        printSeat(S);
        System.out.print("A>>");
        printSeat(A);
        System.out.print("B>>");
        printSeat(B);
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void deleteRes(){
        System.out.print("좌석구분 S(1), A(2), B(3) >>");
        int seatType= scanner.nextInt();
        switch (seatType){
            case 1:
                System.out.print("S>>");
                deleteSeat(S);
                break;
            case 2:
                System.out.print("S>>");
                deleteSeat(A);
                break;
            case 3:
                System.out.print("S>>");
                deleteSeat(B);
                break;
        }
    }
}
