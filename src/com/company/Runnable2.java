package com.company;


class Run1 implements Runnable
{
    public  void run()
    {
        for(int i=1;i<=5; i++)
        {
            System.out.println(" i " + i);
        }

    }
}


class Run2 implements Runnable
{
    public void run()
    {
        for(int j=10;j>=0;j--)
        {
            System.out.println(" j  " + j);
        }
    }
}




