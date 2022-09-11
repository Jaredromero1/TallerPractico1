class Empleado{
    var nombre: String = ""
    var salario: Double = 0.0

    fun datos(){
        print("Ingrese su nombre: ")
        nombre = readln().toString()
        print("Ingrese salario base: $")
        salario = readln().toDouble()
    }

    fun sueldo(){
        val ISSS = salario * 0.03
        val AFP = salario * 0.04
        val RENTA = salario * 0.05
        val salarioNeto = salario - ISSS - AFP - RENTA

        println("\n--------------------------------------------")
        print("$nombre Su salario neto es: $$salarioNeto")
        println("\n--------------------------------------------\n")
        println("Su ISSS es: $$ISSS")
        println("Su AFP es: $$AFP")
        println("Su Renta es: $$RENTA")
    }
}