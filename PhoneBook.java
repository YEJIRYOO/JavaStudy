package num8;

import java.util.Scanner;

public class PhoneBook {
    Scanner sc=new Scanner(System.in);
    private int count;
    private Phone phone[];
    private String nameTmp;
    private String telTmp;

    private void getCount(){
        System.out.print("인원수>>");
        count= sc.nextInt();
        phone=new Phone[count];
    }

    private void getInfo(){
        for(int i=0;i<count;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            nameTmp=sc.next();
            telTmp=sc.next();
            phone[i]=new Phone(nameTmp,telTmp);
        }
        System.out.println("저장되었습니다...");
    }

    private void search(){
        boolean state =false;
        while(true){
            System.out.print("검색할 이름>>");
            nameTmp= sc.next();
            if(nameTmp.equals("그만"))break;
            else {
                for(int j=0;j<count;j++){
                    if(nameTmp.equals(phone[j].getName())) {
                        System.out.println(phone[j].getName() + "의 번호는 " + phone[j].getTel() + " 입니다.");
                        state=true;
                    }
                }
                if(state==false)System.out.println(nameTmp+" 이 없습니다.");
            }
        }
        sc.close();
    }

    public static void main(String[] args){
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.getCount();
        phoneBook.getInfo();
        phoneBook.search();
    }
}