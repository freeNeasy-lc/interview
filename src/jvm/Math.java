package jvm;
/*
    反编译文件在out\production\interview\jvm
    javap -c  Math.class > Math.txt
    反编译：将Math.class文件的反编译结果保存到Math.txt文件中
*/
public class Math {
    public static final int initData = 666;
    public static User user = new User();

    public int compute() {
        int a = 1;
        int b = 2;
        int c = (a+b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.compute();
        System.out.println("test");
    }
}
