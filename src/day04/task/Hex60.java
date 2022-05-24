package day04.task;

public class Hex60 {
    //输出数字60的十六进制表示
    public static void main(String[] args) {
        int num = 60;
        int tmp = num & 15;
        String str = (tmp > 9) ? (char)(tmp - 10 + 'A') + "" : tmp + "";
        num = num >>> 4;
        tmp = num & 15;
        String str2 = (tmp > 9) ? (char)(tmp - 10 + 'A') + "" : tmp + "";
        System.out.println(str2 + str);
    }
}
