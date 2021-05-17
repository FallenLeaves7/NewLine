package 走台阶问题;

public class Run
{
    //一只小老鼠,每次可以选择走一个台阶,两个台阶
    //问,总共有多少种方法
    public int run(int n)
    {
        if (n <= 2)
        {
            //2的时候有(1+1)和(2)两种方法
            //1的时候有(1)一种方法
            return n;
        }
        else
        {
            return run(n - 1) + run(n - 2);
        }
    }
}
