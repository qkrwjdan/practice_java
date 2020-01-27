class Practice{
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,8,4,6,2,4};
        int min = maxValue(arr);
        int max = minValue(arr);

        System.out.println(min);
        System.out.println(max);
        
    }

    public static int minValue(int[] arr){
        int result = 0;
        for(int i =0;i<arr.length;i++){
            if( i == 0){
                result = arr[i];
            }
            else{
               if(result > arr[i]){
                   result = arr[i];
               }
            }
        }
        return result;
    }

    public static int maxValue(int[] arr){
        int result = 0;
        for (int i : arr){
            if (result < i){
                result = i;
            }
        }
        return result;
    }

}

