package com.jan.command.domain;

import com.jan.command.bankcommands.BankCommand;

import java.time.LocalTime;
import java.util.ArrayList;

public class BankCommandInvoker {
    BankCommand command;
    ArrayList<String> log = new ArrayList<>();

    public BankCommandInvoker(BankCommand command) {
        this.command = command;
    }

    public void setCommand(BankCommand command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
        logExecution();
    }

    public void undo() {
        command.undo();
        logUndo();
    }

    public void printLog() {
        for (String logStatement : log) {
            System.out.println(logStatement);
        }
    }

    private void logExecution() {
        String logStatement = "Executed command: " + command.getClass()
                .getSimpleName() + " with params: " + command + " at " + LocalTime.now();
        log.add(logStatement);
    }

    private void logUndo() {
        String logStatement = "Undid command: " + command.getClass()
                .getSimpleName() + " with params: " + command + " at " + LocalTime.now();
        log.add(logStatement);

    }

}
