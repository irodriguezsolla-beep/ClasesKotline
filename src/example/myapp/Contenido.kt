package example.myapp


data class Retornar(var numero: Int, var cadena: String) {
    fun especificar(entrada:String): Retornar {
        var resultado = Retornar(numero, entrada)
        if (entrada == "negro") {
            resultado = Retornar (0, "Color")
        }else {
            resultado = Retornar (0, " ")
        }
        return resultado
    }



}

fun main() {
}