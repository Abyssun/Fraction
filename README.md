# Fraction
（1）编写以下分数类，实现分数的各类运算。



public class Fraction {

    private int fenzi;  //代表分数的分子部分

    private int fenmu;  //代表分数的分母部分

   

    public Fraction(int fenzi, int fenmu) {

       this.fenzi = fenzi;

       this.fenmu = fenmu;

    }

    public double toDouble() {

       //此处添加代码，将分数转换为浮点数，例如1/2转换为0.5

    }

    public Fraction invert() {

        //此处添加代码，得到分数的倒数，例如2/3的倒数为3/2

 }

    public Fraction add(Fraction r) {

       Fraction result = new Fraction(1, 1);

       result.fenmu =   //此处添加代码计算两分数相加后得到的分数的分母

       result.fenzi =   //此处添加代码计算两分数相加后得到的分数的分子

       return result;

    }

    public Fraction subtract(Fraction r) {

       //模仿上面分数相加的方法代码，实现两个分数相减

    }

    Fraction multiply(Fraction r) {

       //模仿上面分数相加的方法代码，实现两个分数相乘

    }

public Fraction divide(Fraction r) {

       //模仿上面分数相加的方法代码，实现两个分数相除

    }


    void print() {

     //返回“分子/分母”的字符串形式。注意要进行分数化简：（1）如果分母为1，则只保留分子（2）如果分子和分母有公约数，则去除最大公约数。

    }    

}




（2）针对以上分数类，编写测试类TestFraction，在main方法中创建分数对象，并调用分数类中定义的各方法，验证是否能得到预期结果。

