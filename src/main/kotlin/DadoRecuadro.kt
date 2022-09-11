import kotlin.random.Random

class DadoRecuadro: Dado(valor = ((Math.random()*100) + 1).toInt()){
    fun imprimirasteriscos(){

        val randoms = Random.nextInt(1, 100)
        print("$randoms = ")

        for (i in 1..randoms){
           print("*")
        }
    }
}