package keywords

data class Person(
    var name: String = "",
    var age: Int = 0,
    var temperature: Float = 35.6f
) {
    fun isSick(): Boolean = temperature > 37.5f
}