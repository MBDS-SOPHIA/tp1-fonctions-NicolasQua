fun displayEvenOrOdd(isEven: Boolean, x: Int) {
    var cpt = 0
    var nb = if (isEven) 0 else 1

    while (cpt < x) {
        println(nb)
        nb += 2
        cpt++
    }
}
println("Exo 1")
displayEvenOrOdd(true, 5)
println("odd / even")
displayEvenOrOdd(false, 5)




fun fibonacci(x: Int): List<Int> {
    val fibList = mutableListOf(0)
    if (x > 1) fibList.add(1)

    var i = 2
    while (i < x) {
        val next = fibList[i - 1] + fibList[i - 2]
        fibList.add(next)
        i++
    }
    return fibList
}
println("Exo 2")
println(fibonacci(10))



fun facto(x: Int = 10): Long {
    var result: Long = 1
    var num = x

    while(num > 1) {
        result *= num
        num--
    }

    return result
}
println("Exo 3")
println("Factoriel 10 : ${facto()}")
println("Factoriel 5 : ${facto(5)}")
println("Factoriel 0 : ${facto(0)}")



fun nombresPremiers(x: Int) {
    var cpt = 0
    var num = 2

    while(cpt < x) {
        if (isPrime(num)) {
            println(num)
            cpt++
        }
        num++
    }
}

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
println("Exo 4")
println("Les 10 premiers nombres premiers")
nombresPremiers(10)


