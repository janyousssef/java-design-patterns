package com.jan.command;

import com.jan.command.bankcommands.DepositMoney;
import com.jan.command.bankcommands.TransferMoney;
import com.jan.command.domain.BankCommandInvoker;
import com.jan.command.domain.BankUser;

public class CommandRunner {
    static final BankUser jan = new BankUser("Jan", 1000);
    static final BankUser mostafa = new BankUser("Mostafa", 0);
    static final BankCommandInvoker invoker = new BankCommandInvoker();

    public static void main(String[] args) {
        part1();
        part2();
    }

    private static void part2() {
        System.out.println("---------Change command---------");
        DepositMoney deposit100 = new DepositMoney(jan, 100);
        invoker.setCommand(deposit100);

        System.out.println("---------Balances before deposit---------");
        jan.printBalance();
        mostafa.printBalance();
        System.out.println("---------Deposit 100 to Jan---------");
        invoker.execute();

        System.out.println("---------Balances after deposit---------");
        jan.printBalance();
        mostafa.printBalance();

        System.out.println("---------Transfers log---------");
        invoker.printLog();
    }

    private static void part1() {
        System.out.println("---------Balances before transfer---------");
        jan.printBalance();
        mostafa.printBalance();

        System.out.println("---------Transfer 500 from Jan to Mostafa---------");
        TransferMoney transfer500 = new TransferMoney(jan, mostafa, 500);
        invoker.setCommand(transfer500);
        invoker.execute();

        System.out.println("---------Balances after transfer---------");
        jan.printBalance();
        mostafa.printBalance();

        System.out.println("---------Undo transfer---------");
        invoker.undo();

        System.out.println("---------Balances after undo---------");
        jan.printBalance();
        mostafa.printBalance();

        System.out.println("---------Transfers log---------");
        invoker.printLog();
    }
}
