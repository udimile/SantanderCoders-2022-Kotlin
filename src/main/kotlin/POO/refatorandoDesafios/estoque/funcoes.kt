package POO.refatorandoDesafios.estoque

class funcoes {

    var idAtual = 1
    var pecas = mutableListOf<Peca>()

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
}