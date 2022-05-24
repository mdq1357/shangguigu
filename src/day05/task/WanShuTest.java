package day05.task;

public class WanShuTest {
    public static void main(String[] args) {
        int factor = 0;
        for(int i = 1;i <= 1000;i++){
//            factor = 0;
            for(int j = 1;j < i;j++){
                if(i % j == 0){ //因数
                    factor += j;
                }
            }
            if(factor == i){
                System.out.println(i);
            }
            //重置factor
            factor = 0;
        }
    }
}
