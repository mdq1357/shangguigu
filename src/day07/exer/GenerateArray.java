package day07.exer;
/*面试题目：
创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
*/
public class GenerateArray {
    public static void main(String[] args){
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 30 + 1);
            for (int j = 0; j < i; j++) {
                if(arr[j] == arr[i]){
                    i--;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
