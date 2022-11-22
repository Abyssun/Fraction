package zuoye;

public class TestFraction {
    public static void main(String[] args) { 
    
     Fraction f1 = new Fraction(2,4);
     Fraction f2 = new Fraction(1,2);
     System.out.println("化简分数1得：");
     f1.print();
     System.out.println("化简分数2得：");
     f2.print();
     System.out.println("分数1倒数为：");
     f1.invert().print();
     System.out.println("相加得：");
     f1.add(f2).print();
     System.out.println("相减得：");
     f1.subtract(f2).print();
     System.out.println("相乘得："); 
     f1.multiply(f2).print();
     System.out.println("相除得：");
     f1.divide(f2).print();
    }
   
   }