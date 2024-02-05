package com.example.organisationcollaborations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.organisationcollaborations.ui.theme.OrganisationCollaborationsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrganisationCollaborationsTheme {
                Collaborations()

            }
        }
    }
}

@Preview()
@Composable
fun GreetingPreview() {
    OrganisationCollaborationsTheme {
        Collaborations()
    }
}


