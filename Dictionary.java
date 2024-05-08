package num10;

public class Dictionary {
    private static String[] kor={"사랑","아기","돈","미래","희망"};
    private static String[] eng={"love","baby","money","future","hope"};
    public static String kor2Eng(String word){
        boolean state=false;
        if(word.equals("그만"))return "그만";
        else{
            for (int i = 0; i < 5; i++) {
                if (word.equals(kor[i])) {
                    state = true;
                    return eng[i];
                }
            }
        }
        return "존재하지 않습니다";
    }
}
