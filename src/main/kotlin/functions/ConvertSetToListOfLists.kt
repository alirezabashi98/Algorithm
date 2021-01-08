package functions

class ConvertSetToListOfLists {

    fun testConvertSetToListOfLists() {

        val food = listOf("🥕", "🍋", "🍏", "🍇", "🍒")

        // [  ["🥕","🍋"] , ["🍏","🍇"] , ["🍒"]  ]
        food.chunked(2)

        // [  "🍋" , "🍇" , "🍒" ]
        food.chunked(2) { it.last() }

        // [  ["🥕", "🍋", "🍏"] , ["🍋", "🍏", "🍇"] , ["🍏", "🍇", "🍒"]  ]
        food.windowed(3)


        // [  ["🍏","🍋","🥕"] , ["🍇","🍏","🍋"] , ["🍒","🍇","🍏"] , ["🍒","🍇"] , ["🍒"]   ]
        food.windowed(3, partialWindows = true) {
            it.reversed()
        }

        /**
         * To better understand the window
         *
         * size - the number of elements to take in each window
         *
         * step - the number of elements to take in each window
         *
         * partialWindows - controls whether or not to keep partial windows in the end if any, by default false which means partial windows won't be preserved


        val sequence = generateSequence(1) { it + 1 }

        val windows = sequence.windowed(size = 5, step = 1)
        println(windows.take(4).toList()) // [[1, 2, 3, 4, 5], [2, 3, 4, 5, 6], [3, 4, 5, 6, 7], [4, 5, 6, 7, 8]]

        val moreSparseWindows = sequence.windowed(size = 5, step = 3)
        println(moreSparseWindows.take(4).toList()) // [[1, 2, 3, 4, 5], [4, 5, 6, 7, 8], [7, 8, 9, 10, 11], [10, 11, 12, 13, 14]]

        val fullWindows = sequence.take(10).windowed(size = 5, step = 3)
        println(fullWindows.toList()) // [[1, 2, 3, 4, 5], [4, 5, 6, 7, 8]]

        val partialWindows = sequence.take(10).windowed(size = 5, step = 3, partialWindows = true)
        println(partialWindows.toList()) // [[1, 2, 3, 4, 5], [4, 5, 6, 7, 8], [7, 8, 9, 10], [10]]

         */

    }

}