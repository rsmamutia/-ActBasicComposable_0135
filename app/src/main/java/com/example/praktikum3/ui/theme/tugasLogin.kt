package com.example.praktikum3.ui.theme
import android.R.attr.logo
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.praktikum3.R

@Composable
fun TugasLogin() {
    val logo = painterResource(
        id = R.drawable.logo_umy
    )
    Column {
        Text(
            text = "Login"
        )
        Text(
            text = "Ini adalah halaman login,"
        )
        Image(
            painter = logo,
            contentDescription = null
        )
    }
}
