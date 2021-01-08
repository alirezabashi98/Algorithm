package factorial

@Suppress("NO_TAIL_CALLS_FOUND")
class Factorial {

    fun fact1(n:Int):Int{
        var fact = 1
        var check = n
        while (check > 0){
            fact *= check
            check--
        }
        return fact
    }

    tailrec fun fact2(n:Int):Int{
        if (n == 0) return 1
        return fact2(n-1) * n
    }

    tailrec fun fact3(n:Int,acc : Int=1):Int{
        if (n == 1)return acc
        return fact3(n-1,acc * n)
    }

}