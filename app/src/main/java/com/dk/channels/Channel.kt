package com.dk.channels

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    while (true){
        print(">> ")
        val userInput = scanner.nextLine()
        if(userInput == "quit") break
        println(userInput)
    }

}
