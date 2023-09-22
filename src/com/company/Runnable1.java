package com.company;


class Runnable1
{
    public static void main(String args[])
    {
        Run1 aa = new Run1();
        Run2 bb = new Run2();
        Thread tt = new Thread(aa);
        Thread cc = new Thread(bb);

        tt.start();
        cc.start();
        System.out.println("The Thread is END ");
    }
}
