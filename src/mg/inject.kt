package mg

/**
 * Created by Gungor-Mebitech on 6.05.2017.
 */

fun main(args: Array<String>){
    val value1 =getStringLength("Mustafa")
    println("Objedeki string değer : "+value1)
    /////////////////////////////////////////////
    val items = listOf("elma","armut","şeftali")
    for (item in items)
        println(item)
    /////Class lar arası haberleşme
    val myClass = InMyTwoClass(InMyClass("Mustafa"))

}

//Gönderilen text objesinde kaç harf olduğunu gösteren metod
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}