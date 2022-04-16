/*Escreva um algoritmo que leia dois números e apresente um menu
com 4 opções:
a. 1) Somar os números;
b. 2) Subtrair os números;
c. 3) Multiplicar os números;
d. 4) Dividir os números.
Leia a opção do usuário e execute a operação e apresente o resultado. Caso a opção digitada seja
inválida, apresente a mensagem de “Opção inválida” para o usuário
* */

fun main() {
    println("Informe dois números: ")
    var num1 = readln().toDouble()
    var num2 = readln().toDouble()

    menu(num1, num2)

}

fun menu(num1: Double, num2: Double) {

    do {

        print("|------------------------Informe a opção desejada:----------------------------------|\n")
        print("|------------------------- 01 - Somar os números -----------------------------------|\n")
        print("|------------------------- 02 - Subtrair números -----------------------------------|\n")
        print("|------------------------- 03 - Multiplicar os números -----------------------------|\n")
        print("|------------------------- 04 - Dividir os números ---------------------------------|\n")
        print("|------------------------- 05 - Sair -----------------------------------------------|\n")
        print("|------------------------Informe a opção desejada:----------------------------------|\n")

        val opcao = readln().toInt()

        calculadora(opcao, num1, num2)

    } while (true)

}

fun calculadora(opcao1: Int, num1: Double, num2:Double) {


    when(opcao1){
        1 -> println("O Resultado de $num1 + $num2 é = ${(num1 + num2)}")
        2 -> println("O Resultado de $num1 - $num2 é = ${(num1 - num2)}")
        3 -> println("O resultado de $num1 * $num2 é = ${(num1 * num2)}")
        4 -> println("O resultado de $num1 / $num2 é = ${(num1 / num2)}")
        5 -> System.exit(0)
        else -> println("Opção inválida")
    }

}




