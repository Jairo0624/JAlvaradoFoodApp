package com.example.jalvaradofoodapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jalvaradofoodapp.Elements.Header
import com.example.jalvaradofoodapp.ui.theme.Grisaseo

@Composable
fun HomeScreen(innerPadding : PaddingValues){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                innerPadding
            )
            .padding(horizontal = 15.dp, vertical = 25.dp)
    ){  //Header
        Header()

        Text(
            text = "Nuestras categorias",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = Grisaseo,
            modifier = Modifier.padding(vertical = 10.dp)
        )

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