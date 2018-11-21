package com.test;

public class ThreadDemo
{
    public static void main (String s[])
    {
        new Thread(new B()).start();
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        Thread current = Thread.currentThread();
        System.out.println("线程的id:"+current.getId());
        System.out.println("线程的code:"+current.hashCode());
    }
}
 
class B implements Runnable
{
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

