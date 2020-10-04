/* byte, short, int, long,  float, double, boolean, char */
/* 位运算符 在二进制上运作: &, |, ;， -, <<, >>, >>>  */
/* 逻辑运算符： &&， ||， !  */

public class Main {
    public static void main(String[] args){
        // 自动转换数据类型
        
        /* short num = 10;
        int intnum = num;
        System.err.println(intnum); */
        // casting();
        // bitOperater();
        // operater();
        three();
    }
    public static void casting(){
        // 强制转换数据类型
        
        double num = 9.9;
        int intnum = (int)num;
        System.out.println(intnum);
    }
    public static void bitOperater(){
        // 加减乘除

        int num = 10;
        num++; // num = num + 1
        System.out.println(num);
    }
    // 位运算符 在二进制上运作
    /* &, |, ;， -, <<, >>, >>> */
    public static void operater(){
        int num1 = 1;  // 001
        int num2 = 4;  // 100
        // 1 | 0 = 1;
        // 0 | 0 = 0;
        //     0 0 1
        //     | | |
        //     1 0 0
        // >>> 1 0 1 = 5
        // System.out.println(num1|num2);
        
        num2 >>>= 1;  // num2 = num2 >>> 1 -->  100  ->   010 = 2
        System.out.println(num2);
    }

    // 三元运算符
    public static void three(){
        boolean flag =  true;
        int num = flag ? 100 : -100 ;
        System.out.println(num);
    }
    
}