package com.example.jalvaradofoodapp.Model

import com.example.jalvaradofoodapp.Elements.Restaurantes

data class Restaurante(
    val imagen : String,
    val titulo : String
)

val restaurantes = listOf(
    Restaurante("https://centrosantafe.com.mx/cdn/shop/files/701.png?v=5733697768863393566", "Burger King"),
    Restaurante("https://i.pinimg.com/564x/10/84/70/1084704494593cdda1144c91ef188237.jpg", "McDonald's"),
    Restaurante("https://m.media-amazon.com/images/I/61sDhtXeCgL._AC_SL1000_.jpg", "KFC"),
    Restaurante("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkvcSRSllRcc3Jd1TYO09NteqHhrXWOQ3iww&s", "Pizza Hut"),
    Restaurante("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShcWDU7ksNGVWSKLBqpOi9RJ7yY7to4kW1Gg&s", "Subway"),
    Restaurante("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3GojlKYFEYKm-jlTWE7AY7rgmypjs5Wz8TA&s", "Carls Jr."),
    Restaurante("https://i.pinimg.com/474x/03/87/fa/0387fa3d83fa7beae04599a5b705426f.jpg", "Little Ceasars"),
    Restaurante("https://centrosantafe.com.mx/cdn/shop/files/1660.png?v=6658729206845675913","Chili's")
)
