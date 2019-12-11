class OperatePromotion{
    public static void main(String[] args){
        /* 
        short num1 = 11;
        short num2 = 22;
        short result = num1 + num2;
        System.out.println(result)
        ERROR : Type mismatch : cannot convert from int to short
        */
        
        int num1 = 11;
        int num2 = 22;
        int result = num1 + num2;
        System.out.println(result);

        short s_num1 = 11;
        short s_num2 = 22;
        int op_result = s_num1 + s_num2;
        System.out.println(op_result);
        //result만 int 로 바꿔줘도 해결가능!
    }
}