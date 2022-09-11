class Operaciones{
    var valor1 : Int = 0
    var valor2 : Int = 0
    var valor3 : Int = 0

    fun pedirDatos(){
        print("\nIngresar primer valor: ")
        valor1 = readln().toInt()
        print("Ingresar segundo valor: ")
        valor2 = readln().toInt()
        print("Ingresar tercer valor: ")
        valor3 = readln().toInt()
    }

    fun validaciones(){
        //validacion numero negativo, cero e iguales
        if ((valor1 < 0 || valor2 < 0 ) || valor3 < 0) {
            print("\n***** No se permiten ingresar numeros negativos\n")
            print(pedirDatos())
        }
        else if ((valor1 == 0 || valor2 == 0 ) || valor3 == 0) {
            print("\n***** No se permite el numero 0\n")
            print(pedirDatos())
        }
        else if ((valor1 == valor2 || valor2 == valor3) || valor1 == valor3){
            print("\n***** Los numeros no pueden ser iguales\n")
            print(pedirDatos())
        }
        else if ((valor1 == 9 || valor2 == 9 )|| valor3 ==9){
            println("\n***** No se puede digitar el numero 9")
            print(pedirDatos())
        }

        //validacion de multiplos de 3

        println("---------------------------- ")

        if (valor1 % 3 == 0)
            println("El valor $valor1 es multiplo de 3")
        else
            println("El valor $valor1 no es multiplo de 3")
        if (valor2 % 3 == 0)
            println("El valor $valor2 es multiplo de 3")
        else
            println("El valor $valor2 no es multiplo de 3")
        if (valor3 % 3 == 0)
            println("El valor $valor3 es multiplo de 3")
        else
            println("El valor $valor3 no es multiplo de 3")
    }

    fun mayorMenor(){
        var mayor = if (valor1 > valor2 && valor1 > valor3) valor1 else if (valor2 > valor3) valor2 else valor3
        var menor = if (valor1 < valor2 && valor1 < valor3) valor1 else if (valor2 < valor3) valor2 else valor3

        println("---------------------------- ")

        //El numero mayor se debe sumar 10, si el numero menor es mayor a 5
        if (menor > 5)
            mayor = mayor + 10
        println("El numero mayor es: $mayor")

        //El numero menor se debe restar 5, si el numero mayor es menor a 100
        if (mayor < 100)
            menor = menor - 5
        println("El numero menor es: $menor")
    }
}