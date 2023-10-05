package com.maou.typographylooks

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.maou.typographylooks.ui.theme.Typography


@Composable
fun DisplayText(
    large: String,
    medium: String,
    small: String
) {
    Column {
        Divider(thickness = 2.dp, color = Color.Cyan)
        Text(text = large, style = Typography.displayLarge, color = Color.Cyan)
        Text(text = medium, style = Typography.displayMedium, color = Color.Cyan)
        Text(text = small, style = Typography.displaySmall, color = Color.Cyan)
    }
}

@Composable
fun BodyText(
    large: String,
    medium: String,
    small: String
) {
    Column {
        Divider(thickness = 2.dp, color = Color.Black)
        Text(text = large, style = Typography.bodyLarge, color = Color.Black)
        Text(text = medium, style = Typography.bodyMedium, color = Color.Black)
        Text(text = small, style = Typography.bodySmall, color = Color.Black)
    }
}

@Composable
fun HeadlineText(
    large: String,
    medium: String,
    small: String
) {
    Column {
        Divider(thickness = 2.dp, color = Color.Blue)
        Text(text = large, style = Typography.headlineLarge, color = Color.Blue)
        Text(text = medium, style = Typography.headlineMedium, color = Color.Blue)
        Text(text = small, style = Typography.headlineSmall, color = Color.Blue)
    }
}

@Composable
fun TitleText(
    large: String,
    medium: String,
    small: String
) {
    Column {
        Divider(thickness = 2.dp, color = Color.Green)
        Text(text = large, style = Typography.titleLarge, color = Color.Green)
        Text(text = medium, style = Typography.titleMedium, color = Color.Green)
        Text(text = small, style = Typography.titleSmall, color = Color.Green)
    }
}

@Composable
fun LabelText(
    large: String,
    medium: String,
    small: String
) {
    Column {
        Divider(thickness = 2.dp, color = Color.Magenta)
        Text(text = large, style = Typography.labelLarge, color = Color.Magenta)
        Text(text = medium, style = Typography.labelMedium, color = Color.Magenta)
        Text(text = small, style = Typography.labelSmall, color = Color.Magenta)
    }
}