class MobileCharging {

    fun testMobileCharging(k: Int): Int {

//      https://quera.ir/problemset/contest/submissions/17244

        var i = 0
        var m = 0

        if (k > 1 || k < 100) return 0

        while (i < k) {
            m += (i + 1)
            i++
        }
        return m

    }

}