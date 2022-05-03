package stringcalculator

class StringCalculator {

    fun run(text: String): Int {
        return run(parseFormula(text))
    }

    private fun parseFormula(text: String): List<String> {
        return checkElements(splitText(text))
    }

    private fun run(elements: List<String>): Int {
        var result = 0
        var index = 0

        while (elements.size - 1 > index) {
            val prevNumber = Integer.parseInt(elements[index++])
            val operator = elements[index++]
            val postNumber = Integer.parseInt(elements[index++])

            result += execute(prevNumber, postNumber, operator)
        }

        return result
    }

    private fun execute(a: Int, b: Int, operator: String): Int {
        return when(operator) {
            PLUS -> a + b
            MINUS -> a - b
            MULTI -> a * b
            DIV -> a / b
            else -> {
                throw IllegalArgumentException()
            }
        }
    }

    private fun splitText(text: String) = text.trim().split(DELIMITER)

    private fun checkElements(elements: List<String>): List<String> {
        if (elements.isEmpty()) {
            throw IllegalArgumentException()
        }

        return elements
    }

    companion object {
        const val DELIMITER = ","
        const val PLUS = "+"
        const val MINUS = "-"
        const val MULTI = "*"
        const val DIV = "/"
    }
}