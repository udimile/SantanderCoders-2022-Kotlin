fun main() {
/*
* Faça um algoritimo que receba o comprimento do lado de um quadrado e calcule sua área e seu perímetro.

Exemplo:

Digite o lado do do quadrado:
12
A area do quadrado e de 144 e seu perimetro de 48
*
* */

    println("Digite o lado do quadrado: ")
   val lado = readln().toInt();
    val area = lado * lado;
    val perimetro = 4 * lado;
    println("A area do quadrado é de $area e o perímetro é de $perimetro")
}
