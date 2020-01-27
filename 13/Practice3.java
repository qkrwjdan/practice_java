class Practice3{
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        changeArr(arr);
        showArr(arr);
    }
    public static void changeArr(int[][] arr){
        int[] temp = arr[arr.length-1];
        for(int i = arr.length-1;i > 0;i--){
                arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void showArr(int[][] arr){
        for(int[] ar : arr){
            for(int e : ar){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
