package com.jan.command;

import com.jan.command.bankcommands.TransferMoney;
import com.jan.command.domain.BankCommandInvoker;
import com.jan.command.domain.BankUser;

public class CommandRunner {
    public static void main(String[] args) {
        BankUser jan = new BankUser("Jan", 1000);
        BankUser mostafa = new BankUser("Mostafa", 0);
        System.out.println("---------Balances before transfer---------");
        jan.printBalance();
        mostafa.printBalance();

        System.out.println("---------Transfer 500 from Jan to Mostafa---------");
        TransferMoney transfer500 = new TransferMoney(jan, mostafa, 500);
        BankCommandInvoker invoker = new BankCommandInvoker(transfer500);
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
