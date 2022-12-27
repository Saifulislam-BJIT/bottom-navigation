package com.saiful.navigationproject.data

class Datasource {
    fun loadData(): List<Map<String, String>> {
        return listOf(
            mapOf(
                "author" to "Albert Einstein",
                "message" to "If you can\'t explain it simply, you don\'t understand it well enough."
            ),
            mapOf(
                "author" to "George Bernard Shaw",
                "message" to "Life isn\'t about finding yourself. Life is about creating yourself."
            ),
            mapOf(
                "author" to "Confucius",
                "message" to "Life is really simple, but we insist on making it complicated."
            ),
            mapOf("author" to "Elon Musk", "message" to "Life is too short for long-term grudges."),
            mapOf(
                "author" to "John Lennon",
                "message" to "Life is what happens while you are busy making other plans."
            ),
            mapOf(
                "author" to "Jackie Kennedy",
                "message" to "I want to live my life, not record it."
            ),
            mapOf(
                "author" to "Cesare Pavese",
                "message" to "We do not remember days, we remember moments."
            ),
            mapOf(
                "author" to "Friedrich Nietzsche",
                "message" to "To live is to suffer, to survive is to find some meaning in the suffering."
            ),
            mapOf(
                "author" to "Friedrich Nietzsche",
                "message" to "Hope in reality is the worst of all evils because it prolongs the torments of man."
            ),
            mapOf(
                "author" to "Martin Luther King, Jr.",
                "message" to "We must accept finite disappointment, but never lose infinite hope."
            ),
        )
    }
}