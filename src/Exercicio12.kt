/*Escreva um algoritmo que leia o ano de nascimento de uma pessoa
e apresente uma linha do tempo, mostrando cada ano de vida da
pessoa e quantos anos ela tinha em cada ano até o ano atual.
* */

fun main() {
    println("Por gentileza, informe o seu ano de nascimento: ")
    var anoNascimento = readln().toInt()

    linhaDoTempo(anoNascimento)

}

fun linhaDoTempo(anoNascimento: Int) {

    var anoAtual = 2022

    var idade = anoAtual - anoNascimento

    println("|-----------------------Linha do tempo--------------------------------------|")

    for (i in anoAtual downTo anoNascimento) {
        var anosDeIdade = arrayListOf(idade)

        println("No ano de $i sua idade é $idade")
        idade--
    }


}







