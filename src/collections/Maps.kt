package collections

fun main() {

    // Un-mutable map
    val namesToAges = mapOf(Pair("Peter", 24), Pair("Esther", 48))
    val namesToAges2 = mapOf(
        "Peter".to(24),
        "Esther" to 48 // infix fun "to"
    )

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old.")
    }


    // Mutable map
    val countryToInhabitants = mutableMapOf(
        "Germany" to 80_000_000,
        "USA" to 300_000_000
    )

    countryToInhabitants.put("Australia", 23_000_000)
    countryToInhabitants.putIfAbsent("USA", 320_000_000) // To overwrite value just use .put()

    println(countryToInhabitants)

    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.containsKey("France"))
    println(countryToInhabitants.containsValue(23_000_000))

    println(countryToInhabitants.get("Germany"))
    println(countryToInhabitants.getOrDefault("France", 0))
}