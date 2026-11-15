package Arrays;

public class Maximum {
    public static void main(String[] args) {

        int[] arr = {1,2,5,6,89};
        System.out.println(max(arr));

        int maxRange = maxRange(arr,0,2);
        System.out.println(maxRange);
    }


    static int max(int[] arr){
        if(arr == null){
            return -1;
        }
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr,int start, int end){
        if(end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int max = arr[0];
        for(int i =start;i<=end;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
