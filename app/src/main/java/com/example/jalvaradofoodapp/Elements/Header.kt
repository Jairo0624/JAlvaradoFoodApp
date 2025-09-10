package com.example.jalvaradofoodapp.Elements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jalvaradofoodapp.ui.theme.Grisaseo
import com.example.jalvaradofoodapp.ui.theme.RojoPrincipal

@Composable
fun Header(){
    //Header
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding( horizontal = 5.dp , vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = null,
            modifier = Modifier
                .size(40.dp),
            tint = RojoPrincipal

        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Hola Jairo",
                fontSize = 26.sp,
                fontWeight = FontWeight.Medium,
                color = Grisaseo
            )

        }

        Icon(
            imageVector = Icons.Default.ExitToApp,
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .padding(start = 10.dp),
            tint = RojoPrincipal
        )
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)



@Composable
fun HeaderPreview(){
    Header()
}