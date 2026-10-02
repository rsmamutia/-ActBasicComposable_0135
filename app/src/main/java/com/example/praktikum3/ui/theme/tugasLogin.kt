package com.example.praktikum3.ui.theme
import android.R.attr.logo
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.praktikum3.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin() {
    val logo = painterResource(
        id = R.drawable.logo_umy
    )
    Column {
        Text(
            text = "Login",
            fontSize = 30.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Ini adalah halaman login,"
        )
        Image(
            painter = logo,
            contentDescription = null
        )
        Text(
            text = "Nama",
            fontSize = 18.sp,
            color = Color.Red
        )
        Text(
            text = "Risma Mutia Dewi",
            fontSize = 18.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "20240140135",
            fontSize = 24.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }
}
