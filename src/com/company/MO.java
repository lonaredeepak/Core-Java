package com.company;

/**
 * @Author Deepak Lonare
 */


class MO2
{
    void show()
    {
        System.out.println("Burun");

    }
}
public class MO extends MO2
{
    void show()
    {
        System.out.println("Paw");
    }
    public static void main(String [] args)
    {
        MO2 mo1= new MO();
        mo1.show();
        MO2 mo2 = new MO2();
        mo2.show();
        MO m3= new MO2();
    }

}
