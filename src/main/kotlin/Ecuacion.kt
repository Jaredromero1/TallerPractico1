class Ecuacion{
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0
    var suma: Double = 0.0
    var resta: Double = 0.0

    fun mostrar(){
        print("\nIngrese valor de a: ")
        a = readln().toDouble()
        print("Ingrese valor de b: ")
        b = readln().toDouble()
        print("Ingrese valor de c: ")
        c = readln().toDouble()
    }

    fun operacion(){
        suma = (-b + (Math.sqrt(b*b - (4*a*c))))/(2*a)
        resta = (-b - (Math.sqrt(b*b - (4*a*c))))/(2*a)

        println("\nLa solucion de la ecuacion cuadratica con + es: $suma")
        println("La solucion de la ecuacion cuadratica con - es: $resta")
    }

    fun validacion(){

        //valida si a no es 0
        if (a == 0.0 ){
            println("\n***** No se puede dividir un numero entre cero")
            println(mostrar())
        }

        //valida que la raiz no sea negativa
        if (a + c <= b || c + a <= b ){
            println(operacion())
        }
        else{
            print("\n***** El resultado de la raiz es negativa, por lo tanto no se puede realizar la raiz cuadrada\n")
            println(mostrar())
            println(operacion())
        }
    }

}