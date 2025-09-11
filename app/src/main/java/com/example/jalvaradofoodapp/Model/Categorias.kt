package com.example.jalvaradofoodapp.Model

data class Categoria(
    val titulo: String,
    val imagen: String,

)

val categorias = listOf(
    Categoria("Comida Rapida", "https://images.pexels.com/photos/3616956/pexels-photo-3616956.jpeg" ),
    Categoria("Japonesa", "https://images.pexels.com/photos/31393444/pexels-photo-31393444.jpeg" ),
    Categoria("Mexicana", "https://images.pexels.com/photos/8448332/pexels-photo-8448332.jpeg" ),
    Categoria("Postres", "https://images.pexels.com/photos/1055272/pexels-photo-1055272.jpeg" ),
    Categoria("Mariscos", "https://images.pexels.com/photos/262959/pexels-photo-262959.jpeg" )
)
