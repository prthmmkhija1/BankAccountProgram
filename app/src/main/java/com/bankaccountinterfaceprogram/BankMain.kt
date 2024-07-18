package com.bankaccountinterfaceprogram

fun main() {
    val prthmMkhijasBankAccount=BankAccount("Pratham Makhija",10000.10)
    println(prthmMkhijasBankAccount.accountHolder) //we cant access private variables outside their own class(BankAccount)

    prthmMkhijasBankAccount.deposit(210.0)
    prthmMkhijasBankAccount.withdraw(5000.0)
    prthmMkhijasBankAccount.deposit(320.0)
    prthmMkhijasBankAccount.deposit(550.37)
    prthmMkhijasBankAccount.withdraw(2210.19)

    prthmMkhijasBankAccount.displayTransactionHistory()

    println("${prthmMkhijasBankAccount.accountHolder}'s balance is ${prthmMkhijasBankAccount.balance}")
}