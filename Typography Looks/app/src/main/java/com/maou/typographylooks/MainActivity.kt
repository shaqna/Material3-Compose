package com.maou.typographylooks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maou.typographylooks.ui.theme.TypographyLooksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TypographyLooksTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    DisplayText(
                        large = "Display Large",
                        medium = "Display Medium",
                        small = "Display Small"
                    )
                    HeadlineText(
                        large = "Headline Large",
                        medium = "Headline Medium",
                        small = "Headline Small"
                    )
                    TitleText(
                        large = "Title Large",
                        medium = "Title Medium",
                        small = "Title Small"
                    )
                    BodyText(
                        large = "Body Large",
                        medium = "Body Medium",
                        small = "Body Small"
                    )
                    LabelText(
                        large = "Label Large",
                        medium = "Label Medium",
                        small = "Label Small"
                    )
                }
            }
        }
    }
}
