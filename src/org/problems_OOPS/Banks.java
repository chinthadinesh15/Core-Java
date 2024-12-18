package org.problems_OOPS;

import java.util.Scanner;

interface Ban 
{
    void createAccount();
    void deposite(double amount);
    void withdra(double amount);
}

class CreateAcc 
{
    private String name;
    private double acc;
    private double IFSC;
    private double balance;

    public CreateAcc(String name, double acc, double iFSC)
    {
        super();
        this.name = name;
        this.acc = acc;
        this.IFSC = iFSC;
        this.balance = 0.0; 
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getAcc() 
    {
        return acc;
    }

    public void setAcc(double acc) 
    {
        this.acc = acc;
    }

    public double getIFSC() 
    {
        return IFSC;
    }

    public void setIFSC(double iFSC) 
    {
        this.IFSC = iFSC;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + acc);
        System.out.println("IFSC Code: " + IFSC);
        System.out.println("Balance: " + balance);
    }
}

class Sbi extends CreateAcc implements Ban 
{
    public Sbi(String name, double acc, double iFSC) 
    {
        super(name, acc, iFSC);
    }

    @Override
    public void createAccount() 
    {
        System.out.println("SBI Account is Created for " + getName());
        display();
    }

    @Override
    public void deposite(double amount) 
    {
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + " to SBI account. New Balance: " + getBalance());
    }

    @Override
    public void withdra(double amount) 
    {
        if (getBalance() >= amount) 
        {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + " from SBI account. New Balance: " + getBalance());
        } else 
        {
            System.out.println("Insufficient balance in SBI account.");
        }
    }
}

class KotakBank extends CreateAcc implements Ban 
{
    public KotakBank(String name, double acc, double iFSC)
    {
        super(name, acc, iFSC);
    }

    @Override
    public void createAccount() 
    {
        System.out.println("KotakBank Account is Created for " + getName());
        display();
    }

    @Override
    public void deposite(double amount)
    {
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + " to KotakBank account. New Balance: " + getBalance());
    }

    @Override
    public void withdra(double amount) 
    {
        if (getBalance() >= amount) 
        {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + " from KotakBank account. New Balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance in KotakBank account.");
        }
    }
}

class Factorys 
{
    public static Ban getBank(String choice) 
    {
        if (choice.equalsIgnoreCase("sbi")) 
        {
            return new Sbi("Dinesh", 3351, 276);
        } 
        else if (choice.equalsIgnoreCase("KotakBank")) 
        {
            return new KotakBank("Suresh", 4242, 7654);
        } else 
        {
            System.out.println("No Such Bank Found");
            return null;
        }
    }
}

class Banks 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice\nSBI\nKotakBank");
        String choice = sc.next();
        Ban item = Factorys.getBank(choice);

        if (item != null) 
        {
            item.createAccount();

            System.out.println("Enter amount to deposit:");
            double depositAmount = sc.nextDouble();
            item.deposite(depositAmount);

            System.out.println("Enter amount to withdraw:");
            double withdrawAmount = sc.nextDouble();
            sc.close();
            item.withdra(withdrawAmount);
        }
    }
}



