package POO.refatorandoDesafios.estoque



fun main(){
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


fun menu(numero: Int) {
    when (numero) {
        1 -> funcoes().adiciona()
        2 -> funcoes().editar()
        3 -> funcoes().estoque()
        4 -> funcoes().exibir()
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