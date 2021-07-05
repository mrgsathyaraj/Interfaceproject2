public class CalculatorAccess {

    iCalculator add = new Addition();

    public void GetAddResult(int a ,int b)
    {
        int result = add.CalculateAdd(a,b);
        System.out.println("result is :"+result);

        add.Testdefaultmethod();
    }

    public void MulResult(int a ,int b)
    {
        int result = add.CalculatorMul(a,b);
        System.out.println("result is :"+result);
        iCalculator.TestStaticMethod();
    }

}
