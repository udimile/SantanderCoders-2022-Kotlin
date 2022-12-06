fun main() {
    /*
    Faça um algoritimo que leia a base e a altura de um triangulo e calcule a sua area.
    F => base*altura/2
*/
    println("Digite a base do triangulo: ")
    val base = readln().toDouble()
    println("Digite a altura do triangulo: ")
    val altura = readln().toDouble()

    val area = (base * altura)/2

    println("A area do triângulo é de $area")
}