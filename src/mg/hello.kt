package mg

/**
 * Created by Gungor-Mebitech on 6.05.2017.
 */

data class Customer(val name: String, val email: String)

fun main(args: Array<String>){
    val customer = Customer("Mustafa","mustafagungorq@gmail.com")
    println(customer.name +" "+ customer.email)
    val sumTotal = sum(4,5)
    println(sumTotal)
}

fun sum(a: Int, b:Int):Int{
    return a+b
}
