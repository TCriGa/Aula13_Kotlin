/*Faça um programa que receba 10 números inteiros informados pela
pessoa usuária, armazene-os e verifique quais números são pares, e
exiba para o usuário apenas os números pares da lista.
* */

fun main() {

    var listaN = arrayListOf<Int>(10)

    listaN.forEach { num ->
        println("Informe o $listaN número")
        listaN[num] = readln().toInt()

    }
}


