fun main() {
        println("Quantos anos você tem?")
        val idadeEmAnos = readln().toInt()
        val idadeEmMeses = idadeEmAnos * 12
        val idadeEmDias = idadeEmAnos * 365
        val idadeEmHoras = idadeEmDias * 24
        val idadeEmMinutos = idadeEmHoras * 60

        println("Sua idade equivale a: " +
                "$idadeEmMeses meses, " +
                "$idadeEmDias dias, " +
                "$idadeEmHoras horas, " +
                "$idadeEmMinutos minutos"
        )

}