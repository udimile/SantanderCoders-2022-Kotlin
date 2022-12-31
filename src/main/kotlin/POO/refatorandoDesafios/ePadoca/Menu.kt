package POO.refatorandoDesafios.ePadoca

class Menu {
    val paes: List<Produtos> = listOf(
        Produtos(nome = "Pão frances", preco = 0.60),
        Produtos(nome = "Pão de leite", preco = 0.40),
        Produtos(nome = "Pão de milho", preco = 0.50)
    )
    val salgados: List<Produtos> = listOf(
        Produtos(nome = "Coxinha", preco = 5.00),
        Produtos(nome = "Esfiha", preco = 6.00),
        Produtos(nome = "Pão de queijo", preco = 3.00)
    )
    val doces: List<Produtos> = listOf(
        Produtos(nome = "Sonho", preco = 1.50),
        Produtos(nome = "Beijinho", preco = 2.00),
        Produtos(nome = "Queijadinha", preco = 3.00)
    )

    override fun toString(): String {
        return """
            
        """.trimIndent()
    }
}