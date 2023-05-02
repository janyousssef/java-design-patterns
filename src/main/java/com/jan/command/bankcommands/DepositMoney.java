package com.jan.command.bankcommands;

import com.jan.command.domain.BankUser;

public class DepositMoney implements BankCommand {
    private final BankUser user;
    private final long amount;

    public DepositMoney(BankUser user, long amount) {
        this.user = user;
        this.amount = amount;
    }

    @Override
    public void execute() {
        user.deposit(amount);
    }

    @Override
    public void undo() {
        user.withdraw(amount);
    }
}
