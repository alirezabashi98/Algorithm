package functions

class DeleteDuplicateValues {

    fun testDeleteDuplicateValues() {

        val list = listOf('a', 'A', 'b', 'B', 'a', 'A')
        // Delete duplicate values
        println(list.distinct())
        // Delete duplicate values ​​ and display only lowercase letters
        println(list.distinctBy { it.toLowerCase() })

    }

}