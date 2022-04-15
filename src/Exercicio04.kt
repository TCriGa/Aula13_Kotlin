/*Faça um programa que receba 10 números inteiros informados pela
pessoa usuária, armazene-os e verifique quais números são pares, e
exiba para o usuário apenas os números pares da lista.
* */

fun main() {

    var listaN = IntArray(10)

    for (num: Int in listaN.indices){
        println("Informe o ${num + 1} número")
        listaN[num] = readln().toInt()

    }


   for (num: Int in listaN.indices){
       if (listaN[num] % 2 ==0){
           println("São números pares ${listaN[num]}")
       }
   }


}


