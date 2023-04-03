package com.mkiperszmid.habitsappcourse.authentication.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.mkiperszmid.habitsappcourse.R
import com.mkiperszmid.habitsappcourse.authentication.presentation.login.components.LoginForm
import com.mkiperszmid.habitsappcourse.core.presentation.HabitTitle

@Composable
fun LoginScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.loginbackground),
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.aspectRatio(1f).graphicsLayer(
                scaleX = 1.27f,
                scaleY = 1.27f
            )
        )
        Spacer(
            modifier = Modifier.fillMaxSize().background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        MaterialTheme.colorScheme.background,
                        MaterialTheme.colorScheme.background
                    )
                )
            )
        )
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
            Spacer(modifier = Modifier)
            Spacer(modifier = Modifier)
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HabitTitle(title = "Welcome To")
                HabitTitle(title = "Monumental Habits")
            }
            LoginForm()
        }
    }
}
