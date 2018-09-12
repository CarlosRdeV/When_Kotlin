package seccionCuatro

fun main(args : Array<String>){

    //Pedimos un dato por consola
    println("Dame el promedio ")

    //Recuperamos ese dato en la variable
    val promedio : Int = readLine()!!.toInt()

    //Evaluamos ese dato con when(variable a evaluar)
    //Similar a un switch / case
    when(promedio){

        //Si promedio == 10 -> realizar esta opcion
        10 -> println("Resultado sobresaliente: $promedio")
        9 -> println("Resultado bueno: $promedio")

        //podemos generar rangos en nuestros casos usando in
        in 6..7  ->  println("Resultado suficiente: $promedio")
        in 0..5 ->  println("Resultado insuficiente: $promedio")

        //ahora creamos nuestro caso si no entra en las demas
        //posibilidades = default en switch case
        else ->  println("Error, verifique las calificaciones ingresadas")

    }
}
