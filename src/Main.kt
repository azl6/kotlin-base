//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

}

fun varEVal(){
    //var = pode mudar
    //val = nao pode
    var possoMudar:String = "Oi"
    val naoPossoMudar:String = "Oi"

    possoMudar = "Olá"
    //naoPossoMudar = "Olá" ERRO!
}

fun variaveisNullable(){
    //o símbolo ? depois do tipo indica que a variável pode ser null
    //por padrão, nenhuma pode

    var naoPossoNull:String = "Oi"
    var possoNull:String? = "Oi"

    //naoPossoNull = null ERRO!
    possoNull = null

}

fun usandoWhen(){
    //o when é o switch case
    val testar:String = "CAMPO"

    when(testar){
        "CAMPO" -> println("É CAMPO!")
        "CIDADE" -> println("É CIDADE!")
        else -> println("É IRRECONHECÍVEL!")
    }

    //tbm pode ser usado para atribuir valores
    var toPrint:String = when(testar){
        null -> "NAO TINHA NADA!"
        else -> testar

    }
}

//funções tem o retorno definido da seguinte maneira
fun testeRetorno():String {
    return "Olá!"
}


//funções que não retornam nada retornam um Unit, que é como se fosse um void
fun retornoUnit():Unit {
    println("Olá!")
}

//funções que retornam algo "simples" podem ser simplificadas
fun souSimples():String = "Olá mundo!"
