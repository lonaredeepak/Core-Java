package com.company;

public class ToString
{   String name;
    String address;
   public void add(String name)
    {
        this.name=name;

    }
    public ToString(String address)
    {
         this.address=address;

    }
    public String toString()
    {
    return address+"  "+name;
    }
    public static void main(String[] args)
    {
        ToString ts = new ToString("Pune");
        System.out.println(ts);
        ts.add("Asur");
        System.out.println(ts);
    }
}
