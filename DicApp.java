package num10;

import java.util.Scanner;

import static num10.Dictionary.kor2Eng;

public class DicApp {
    public void search(){
        Scanner scanner=new Scanner(System.in);
        String wordTmp;
        String engTmp;
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어?");
            wordTmp=scanner.next();
            engTmp=kor2Eng(wordTmp);
            if(wordTmp.equals("그만"))break;
            else if(engTmp.equals("존재하지 않습니다"))System.out.println(wordTmp+"는 저의 사전에 없습니다.");
            else System.out.println(wordTmp+"은 "+engTmp);
        }
        scanner.close();
    }

    public static void main(String[] args){
        DicApp dicApp=new DicApp();
        dicApp.search();
    }
}
