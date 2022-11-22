package zuoye;

public class Fraction {
    private int fenzi; // 代表分数的分子部分
    private int fenmu;  //代表分数的分母部分
    
    public Fraction(int fenzi, int fenmu) {
         this.fenzi = fenzi;
         this.fenmu = fenmu;
    }
    public double toDouble() {
           //此处添加代码，将分数转换为浮点数，例如1/2转换为0.5
     return (double)fenzi / fenmu;
    }
    public Fraction invert() {
            //此处添加代码，得到分数的倒数，例如2/3的倒数为3/2
     Fraction daoshu = new Fraction(1, 1);
     daoshu.fenzi=fenmu;
     daoshu.fenmu=fenzi;
     return daoshu;
    }
    public Fraction add(Fraction r) {
     Fraction result = new Fraction(1, 1);
        result.fenmu =r.fenmu *fenmu;//此处添加代码计算两分数相加后得到的分数的分母
        result.fenzi =r.fenzi*fenmu+r.fenmu*fenzi ; //此处添加代码计算两分数相加后得到的分数的分子
        return result;
    }
    public Fraction subtract(Fraction r) {
           //模仿上面分数相加的方法代码，实现两个分数相减
     Fraction xiangjian = new Fraction(1, 1);
     xiangjian.fenzi=r.fenmu*fenzi-r.fenzi*fenmu;
     xiangjian.fenmu=r.fenmu*fenmu;
     return xiangjian;
    }
    public Fraction multiply(Fraction r) {
           //模仿上面分数相加的方法代码，实现两个分数相乘
     Fraction xiangcheng = new Fraction(1, 1);
     xiangcheng.fenmu=r.fenmu*fenmu;
     xiangcheng.fenzi=r.fenzi*fenzi;
     return xiangcheng;
    }
    public Fraction divide(Fraction r) {
         //模仿上面分数相加的方法代码，实现两个分数相除
     Fraction xiangchu = new Fraction(1, 1);
     xiangchu.fenmu=r.fenmu*fenzi;
     xiangchu.fenzi=r.fenzi*fenmu;
     return xiangchu;
    }
   
    void print() {
     // 返回“分子/分母”的字符串形式。注意要进行分数化简：（1）如果分母为1，则只保留分子（2）如果分子和分母有公约数，则去除最大公约数。
     int a = fenzi;
     int b = fenmu;
     if (a == b)
      System.out.println(1);
     else if (b == 0)
      System.out.println("分母不能为0");
     else if (a == 0)
      System.out.println("0");
     else if(a==-b)
      System.out.println("-1");
     else {
      if (a > b) {
       int temp = a;
       a = b;
       b = temp;
      }
      while (b % a != 0) {
       int temp = b % a;
       b = a;
       a = temp;
      }
      if (fenmu / a == 1)
       System.out.println(fenzi / a);
      else
       System.out.println(fenzi / a + "/" + fenmu / a);
     }
    }
   }