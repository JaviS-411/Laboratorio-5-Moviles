package com.example.labo04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.labo04.Navigation.AppNavigation
import com.example.labo04.ui.theme.Labo04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Labo04Theme {
                AppNavigation()
            }
        }
    }
}
