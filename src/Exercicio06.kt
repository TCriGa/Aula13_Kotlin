/*Faça um programa que permita que a pessoa usuária digite o nome
de uma banda musical e insira o nome de 3 músicas dessa banda, as
músicas deverão ser armazenadas e no final o programa deverá
mostrar a seguinte mensagem:
NomeDaBanda
Musica1
Musica2
Musica3
* */

fun main() {
    musicasDaBanda()
}

fun musicasDaBanda() {
    println("Informe o nome da sua Banda preferida:")
    val nomeB = readln()
    val nomeBanda = arrayListOf<String>(nomeB)

    var musicasBanda = arrayOfNulls<String>(3)

    for (listaMusicas in musicasBanda.indices) {

        println("Informe o nome da ${(listaMusicas + 1)} ª bandas")
        musicasBanda[listaMusicas] = readln()

    }
apresentacaoBanda(nomeBanda, musicasBanda )

}

fun apresentacaoBanda(nomeB: ArrayList<String>, musicasBanda: Array<String?>) {
    println("//--------------------Nome da banda é: $nomeB -------------------------------//")

    for (listaMusicas in musicasBanda.indices) {
        println("Musica ${(listaMusicas + 1)} ª é : ${musicasBanda[listaMusicas]}")

    }
}










