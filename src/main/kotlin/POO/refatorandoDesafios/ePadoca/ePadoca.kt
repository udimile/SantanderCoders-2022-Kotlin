package POO.refatorandoDesafios.ePadoca

val menu = Menu()

private const val LINHA = "..........."

private val categorias = """
        1..................Pães
        2..............Salgados
        3.................Doces
        0......Finalizar compra
    """.trimIndent()

fun main() {
    println("Bem Vindo à padaria E-Padoca!")
    ePadoca()
    println("====================Comanda E-padoca=======================\n" +
            "Item${LINHA}Produto${LINHA}Qtd${LINHA}Valor${LINHA}Total")
    itensComanda.forEach { item ->
        println(item)
    }
    println("Valor total R$ %.2f".format(total))
}

fun ePadoca() {

    do {
        println(categorias)
        println("Escolha uma das opções do cardápio:")
        val escolhaMenuPrincipal = readln().toInt()
        var finalizaCompra = "N"

        when (escolhaMenuPrincipal) {
            TiposDeProdutos().PAES -> selecionaProduto(menuPaes, paes)
            categorias.SALGADOS -> selecionaProduto(menuSalgados, salgados)
            categorias.DOCES -> selecionaProduto(menuDoces, doces)
            else -> {
                println("Deseja mesmo finalizar a compra? (S/N)")
                finalizaCompra = readln().uppercase()
                if (finalizaCompra == "N") {
                    continue
                } else if (finalizaCompra == "S") {
                    adicionaCupom()
                }
            }
        }
    } while (escolhaMenuPrincipal != 0 || finalizaCompra != "S")
}
private fun adicionaCupom() {
    println("Deseja adicionar cupom (S/N)?")
    var adicionaCupom = readln().uppercase()
    if (adicionaCupom == "N") {
        return
    } else if (adicionaCupom == "S") {
        println("Digite o nome do cupom")
        var nomeCupom = readln().uppercase()
        when (nomeCupom) {
            "5PADOCA" -> total *= 0.95
            "10PADOCA" -> total *= 0.90
            "5OFF" -> total -= 5.00
            else -> {
                println("Cupom inválido.")
                adicionaCupom()
            }
        }
    }
}

private fun selecionaProduto(
    menuSelecionado: String,
    produtos: List<Pair<String, Double>>
) {
    do {
        println(menuSelecionado)
        val produtoSelecionado = readln().toInt()

        for ((i, produto) in produtos.withIndex()) {
            if (i.inc() == produtoSelecionado) {
                selecionaQuantidadeDoProduto(produto)

            }
        }
    } while (produtoSelecionado != 0)

}
fun selecionaQuantidadeDoProduto(produto: Pair<String, Double>) {
    println("Digite a quantidade:")
    val quantidade = readln().toInt()
    val totalItem = quantidade * produto.second
    val item = itemComanda(
        produto = produto.first,
        quantidade = quantidade,
        valorUnitario = produto.second,
        total = totalItem
    )
    itensComanda.add(item)
    total += totalItem
}

fun itemComanda(
    produto: String,
    quantidade: Int,
    valorUnitario: Double,
    total: Double
): String = "${itensComanda.size.inc()}$LINHA$produto$LINHA$quantidade$LINHA$valorUnitario${LINHA}R$$total"