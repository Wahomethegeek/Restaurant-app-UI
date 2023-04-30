package com.example.restaurantsapp

data class Restaurant(
    val id: Int,
    val title: String,
    val description: String
)
val dummyRestaurants = listOf(
    Restaurant(0, "Wahome's dishes", "At Wahome's we provide the best seafood dishes."),
    Restaurant(1, "Chafua MMU", "Comrade's affordable prices at Chafua"),
    Restaurant(2, "Hezzy Pizza", "Get the best Pizza in town and also burgers"),
    Restaurant(3, "Nairobi Kitchen", "Experience the full immersive dining experience"),
    Restaurant(4, "Baraka Hotel", "Get affordable lunch in Ongata Rongai"),
    Restaurant(5, "Merry Dinner", "Get the Christmas experience at Merry Dinner with Santa"),
    Restaurant(6, "Cheese Food shop", "Cheesy meals with cheesy ingredients, its all about cheese!"),
    Restaurant(7, "Spicy Grill Nairobi", "Get the best culinary experience in Nairobi"),
    Restaurant(8, "Kassy Pizza pub", "Relieve the childhood pizza experience at Kassy pub"),
    Restaurant(9, "Eternity lunch", "You will get the best Kenyan dishes served to you"),
    Restaurant(10, "Jamie's Burgers", "At Jamie's, we serve the best meat and vegan burgers!")
)