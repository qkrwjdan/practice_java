class Practice2{
    public static void main(String[] args) {
        int[][] intArr = {
            {1,2,3},
            {3,4,5},
            {6,7,8}
        };

        addTwoDArr(intArr,3);
        showArr(intArr);
    }

    public static void addOneDArr(int[] arr,int add){
        for(int i =0;i < arr.length;i++){
            arr[i] += add;
        }
    }


    public static void addTwoDArr(int[][] arr,int add){
        for(int i =0;i < arr.length;i++){
            addOneDArr(arr[i],10);
        }
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

