package logicaDeProgramacao.desafios.estoque

import java.lang.NumberFormatException

var idAtual = 1
var pecas = mutableListOf<Peca>()

fun main() {
    menuPrincipal()
}

fun menuPrincipal() {
    println("""
    Digite a opção desejada no Menu:
    1..................Adicionar item
    2.....................Editar item
    3.........Exibir itens em estoque
    4...........Exibir todos os itens
    0...............Finalizar sistema
""".trimIndent())

        try {
            val opcao = readln().toInt()
            menu(opcao)
        } catch (e: NumberFormatException) {
            println("Opção inválida!")
            menuPrincipal()
        }
}

class Peca(var nome: String, var quantidade: Int, val id: Int)

fun menu(numero: Int) {
    when (numero) {
        1 -> adiciona()
        2 -> editar()
        3 -> estoque()
        4 -> exibir()
        0 -> return
        else -> menuPrincipal()
    }
}
fun validaQuantidade(): Int? {
    val quantidade = try {
        readln().toInt()
    } catch (e: NumberFormatException) {
        null
    }
    if (quantidade == null || quantidade > 999 || quantidade < 0) {
        println("Quantidade invalida")
    }

    return quantidade
}

fun adiciona() {
    println("Informe o nome da peça:")
    val nome = readln()
    println("Informe a quantidade:")
    var quantidade: Int?

    quantidade = validaQuantidade()

    val peca = quantidade?.let { Peca(id = idAtual, nome = nome, quantidade = it) }
    idAtual++
    if (peca != null) {
        pecas.add(peca)
    }
    menuPrincipal()

}

    fun estoque() {
        val estoque = pecas.filter { it.quantidade > 0 }
        exibir(estoque)
    }

    fun exibir(pecasAExibir: List<Peca> = pecas) {
        println("ID | Peça | Quantidade")
        for (peca in pecasAExibir) {
            println("#%04d".format(peca.id) + " | ${peca.nome} | ${peca.quantidade}")
        }
        menuPrincipal()
    }

fun editar() {

    println("Informe o ID do produto:")

    val idPeca = readln().toInt()
    var pecaEditada: Peca? =
        pecas.filter { it.id == idPeca }.first()

        if (pecaEditada == null) {
            println("ID não cadastrado!!!")
            menuPrincipal()
        }
        println("Informe novo nome")
        pecaEditada?.nome = readln()
        println("Informe nova quantidade:")
        try {
            pecaEditada?.quantidade = validaQuantidade()!!
            menuPrincipal()
        } catch (e: NumberFormatException) {
            println("ID informado não é um número.")
            editar()
        }
    }