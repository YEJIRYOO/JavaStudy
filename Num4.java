import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Num4 {
    public static void main(String[] args){
        List<Integer>list=new Vector<Integer>();
        Scanner sc=new Scanner(System.in);
        int sum=0;

        while(true){
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int tmp=sc.nextInt();

            if(tmp==0)break;
            list.add(tmp);
            sum+=tmp;

            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println("\n현재 평균 "+sum/list.size());
        }

        sc.close();
    }
}
