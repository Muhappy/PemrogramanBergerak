package com.example.absensi

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.absensi.fakultas.Fakultas
import com.example.absensi.landingcomponent.LandingComponent
import com.example.absensi.logincomponent.LoginComponent
import com.example.absensi.profilecomponent.ProfileComponent
import com.example.absensi.splashcomponent.SplashComponent
import com.example.absensi.ui.theme.AbsensiTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AbsensiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
//                   LoginComponent()
//                   SplashComponent()
//                    ProfileComponent()
//                    Fakultas()
                    LandingComponent()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AbsensiTheme {
//   LoginComponent()
//     SplashComponent()
//        ProfileComponent()
//        Fakultas()
        LandingComponent()
    }
}