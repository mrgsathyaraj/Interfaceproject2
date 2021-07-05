public interface iCalculator{

    static int a =5;

    int CalculateAdd(int a , int b);

    int CalculatorMul(int a, int b);

    default void Testdefaultmethod()
    {
        System.out.println("test default method form add");

    }

    static int TestStaticMethod()
    {
        System.out.println("static method return value as a :"+a);
        return a;
    }

}
