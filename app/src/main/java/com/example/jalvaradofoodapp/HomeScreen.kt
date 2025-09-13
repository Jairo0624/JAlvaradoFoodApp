package com.example.jalvaradofoodapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jalvaradofoodapp.Elements.Header
import com.example.jalvaradofoodapp.Elements.CategoriaFila
import com.example.jalvaradofoodapp.Elements.ComidaVista
import com.example.jalvaradofoodapp.Elements.Restaurantes

@Composable
fun HomeScreen(innerPadding : PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(horizontal = 15.dp, vertical = 25.dp)
    ) {  //Header
        Header()
        //Categorias
        CategoriaFila()
        //Restaurantes
        Restaurantes()
        //Comidas
        ComidaVista()
        
    }
}




@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun HomeScreenPreview(){
    HomeScreen(innerPadding = PaddingValues(0.dp))
}