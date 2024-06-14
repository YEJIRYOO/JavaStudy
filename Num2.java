import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Character> list=new ArrayList<Character>();
        char tmp;
        double sum=0;

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F>>");
        for(int i=0;i<6;i++){
            tmp=sc.next().charAt(0);
            list.add(tmp);
        }

        for(int j=0;j<6;j++){
            if(list.get(j).equals('A'))sum+=4.0;
            else if(list.get(j).equals('B'))sum+=3.0;
            else if(list.get(j).equals('C'))sum+=2.0;
            else if(list.get(j).equals('D'))sum+=1.0;
            else sum+=0.0;
        }

        System.out.println(sum/6);

        sc.close();
    }
}
