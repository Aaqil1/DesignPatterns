package com.example.designpatterns.structural.decorator;

/**
 * Problem: Security asked to encrypt messages, compliance asked to audit sends.
 * Rewriting BasicSender for every concern would cause combinatorial growth.
 *
 * Decorator wraps behavior at runtime, stacking concerns as needed.
 */
public class Main {
    public static void main(String[] args) {
        MessageSender sender = new BasicSender();
        MessageSender secureSender = new EncryptingSender(new AuditingSender(sender));

        sender.send("Plain hello");
        secureSender.send("Payroll file ready");
    }
}
