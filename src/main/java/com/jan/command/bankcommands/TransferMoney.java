package com.jan.command.bankcommands;

import com.jan.command.domain.BankUser;

public class TransferMoney implements BankCommand {
    private final BankUser sourceUser;
    private final BankUser destinationUser;
    private final long amount;

    public TransferMoney(BankUser sourceUser, BankUser destinationUser, long amount) {
        this.sourceUser = sourceUser;
        this.destinationUser = destinationUser;
        this.amount = amount;
    }

    @Override
    public void execute() {
        sourceUser.withdraw(amount);
        destinationUser.deposit(amount);
    }

    @Override
    public void undo() {
        destinationUser.withdraw(amount);
        sourceUser.deposit(amount);
    }
}
