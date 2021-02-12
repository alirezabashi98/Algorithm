package functions

class PartitionFunction {

    data class Person(val name: String, val age: Int)

    fun testPartitionFunction(){

        val members = listOf(
            Person("ali",18),
            Person("sobhan",8),
            Person("alireza",18),
            Person("milad",32),
            Person("aref",16),
            Person("sajad",23),
            Person("omid",10),
            Person("reza",47),
            Person("mmd",29)
        )

        val (kids,adults) = members.partition { it.age < 18 }

    }

}