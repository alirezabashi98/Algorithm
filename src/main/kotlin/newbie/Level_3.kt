package newbie

fun Level_3() {

    var str: String = "Hello world !"

    println(str.length) //13

    println(str.subSequence(0, 5)) // Hello

    println(str[0]) //H

    println(str.get(4)) //o

    for (item in str) {

        println(item)

    }

//    \n , \r , \t , \b , \' , \" , \\ , \$

    println("length of str id ${str.length}")

    var a = "Hello"
    var b = "Hello again"
    var c = "Hello"
    var d1 = "Hel"
    var d2 = "lo"
    var d = d1 + d2

    println(a === c)  // true
    println(a == c)   // true
    println(a === b)  // false
    println(a == b)   // false
    println(a === d)  // false
    println(a == d)   // true

}