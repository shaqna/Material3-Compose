package com.maou.fontfamilylooks

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import com.maou.fontfamilylooks.ui.theme.FontFamilyLooksTheme


@Composable
fun DefaultFont(
    text: String = "Default Font - Depends on your phone",
) {
    Text(text = text, style = TextStyle(
        fontFamily = FontFamily.Default
    ))
}

@Composable
fun SansSerifFont(
    text: String = "SansSerif Font - Generic Font Family"
) {
    Text(text = text, style = TextStyle(
        fontFamily = FontFamily.SansSerif
    ))
}

@Composable
fun SerifFont(
    text: String = "Serif Font - Generic Font Family"
) {
    Text(text = text, style = TextStyle(
        fontFamily = FontFamily.Serif
    ))
}

@Composable
fun CursiveFont(
    text: String = "Serif Font - Generic Font Family"
) {
    Text(text = text, style = TextStyle(
        fontFamily = FontFamily.Cursive
    ))
}

@Composable
fun MonospaceFont(
    text: String = "Monospace Font - Generic Font Family"
) {
    Text(text = text, style = TextStyle(
        fontFamily = FontFamily.Monospace
    ))
}


@Preview(showBackground = true)
@Composable
fun FontFamilyPreview() {
    FontFamilyLooksTheme {
        Column {
            DefaultFont()
            SansSerifFont()
            SerifFont()
            CursiveFont()
            MonospaceFont()
        }
    }
}