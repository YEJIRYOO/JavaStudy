import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num8 {
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map=new HashMap<>();

        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true){
            System.out.print("이름과 포인트 입력>> ");
            String tmpName=sc.next();
            if(tmpName.equals("그만"))break;
            int tmpPoint=sc.nextInt();

            if(map.containsKey(tmpName)){
                map.put(tmpName,map.get(tmpName)+tmpPoint);
            }
            else{
                map.put(tmpName,tmpPoint);
            }
            for(Map.Entry<String,Integer>getMemInfo: map.entrySet()){
                System.out.print("("+getMemInfo.getKey()+","+getMemInfo.getValue()+")");
            }
            System.out.println();
        }
        sc.close();
    }
}
