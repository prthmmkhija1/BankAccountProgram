package com.bankaccountinterfaceprogram

class BankAccount(var accountHolder:String, var balance:Double) {

    private val transactionHistory=mutableListOf<String>() //elements ni dale to datatype define krna pdega..

    fun deposit(amount:Double) {
        balance+=amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount:Double) {
        if(balance>=amount) {
            //We can withdraw money
            balance-=amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }
        else {
            //We can't withdraw money
            println("You don't have the funds to withdraw $$amount")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction History for $accountHolder")
        for(transaction in transactionHistory) {
            println(transaction)
        }
    }
}