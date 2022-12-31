package POO.refatorandoDesafios.ePadoca

enum class TiposDeProdutos(val valor:Int) {
    PAES(valor = 1),
    SALGADOS(valor = 2),
    DOCES(valor = 3),
    FINALIZAR(valor = 0);

    companion object{
        fun categorias (valor: Int): TiposDeProdutos {
            return when(valor){
                PAES.valor -> PAES
                SALGADOS.valor -> SALGADOS
                DOCES.valor -> DOCES
                FINALIZAR.valor -> FINALIZAR
                else -> FINALIZAR
            }
        }
    }



}