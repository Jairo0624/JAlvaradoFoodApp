package com.example.jalvaradofoodapp.Model

data class Comida(
    val imagen : String,
    val titulo : String,
    val calificacion : String,
    val precio : String
)

val comidas = listOf(
    Comida("https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_WHOPPER_500X540px.png", "Whopper", "4.5" , "80.8"),
    Comida("https://www.mcdonalds.com.py/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBYkk9IiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--b2a0f5e11f242ef6eb4f9d5081289c97834ac46e/Papas%20med.png", "Papas Fritas", "4.3" , "35"),
    Comida("https://mcdonalds.es/api/cms/images/Z4j2nZbqstJ99hru_Big-Mac.png?auto=format,compress&rect=0,0,450,450&w=254&h=254", "Big Mac", "4.6" , "78.5"),
    Comida("https://mcdonalds.es/api/cms/images/Z41G5JbqstJ99nTF_Hero-McFlurry-Oreo_desk.png?rect=524,0,873,679&auto=compress&fm=webp", "McFlurry Oreo", "4.7" , "49.5"),
    Comida("https://mcdonalds.es/api/cms/images/Z44N05bqstJ99n-A_Hero-mcnuggets_desk.png?rect=524,0,873,679&auto=compress&fm=webp", "Chicken Nuggets", "4.4" , "50"),
    Comida("https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_COCACOLA_500X540px.png", "Coca Cola", "4.8" , "20"),
    Comida("https://static.vecteezy.com/system/resources/thumbnails/045/383/381/small_2x/a-cheesy-delicious-pizza-with-tasty-pepperoni-on-a-transparent-background-png.png", "Pizza Grande", "4.5" , "200"),
    Comida("https://file.adomicil.io/sushiroll.adomicil.io/_files/images/division/categorias0008rollos-clasicos-0995598716193623.png", "Sushi", "4.7" , "80"),
)
