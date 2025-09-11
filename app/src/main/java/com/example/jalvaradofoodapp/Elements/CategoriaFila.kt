package com.example.jalvaradofoodapp.Elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.jalvaradofoodapp.Model.categorias
import com.example.jalvaradofoodapp.R
import com.example.jalvaradofoodapp.ui.theme.Grisaseo

@Composable
fun CategoriaFila(){
    Text(
        text = "Nuestras categorias",
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium,
        color = Grisaseo,
        modifier = Modifier.padding(vertical = 10.dp)
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp) // espacio entre ítems
    ) {
        items(categorias) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.width(100.dp) // ancho fijo para alinear texto
            ) {
                // Caja circular para la imagen
                Box(
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFE53935)), // rojo de fondo
                    contentAlignment = Alignment.Center
                ) {
                    AsyncImage(
                        model = it.imagen,
                        contentDescription = it.titulo,
                        modifier = Modifier
                            .size(70.dp) // imagen más pequeña que el círculo
                            .clip(CircleShape),
                        placeholder = painterResource(R.drawable.ic_launcher_foreground),
                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Texto debajo
                Text(
                    text = it.titulo,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color.DarkGray
                )
            }
        }
    }

}