package com.example.organisationcollaborations

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.organisationcollaborations.ui.theme.C1
import com.example.organisationcollaborations.ui.theme.C2
import com.example.organisationcollaborations.ui.theme.C3
import com.example.organisationcollaborations.ui.theme.S1
import com.example.organisationcollaborations.ui.theme.S2
import com.example.organisationcollaborations.ui.theme.S3
import ui.elements.BottomNavBar
import ui.elements.Orgcard
import ui.elements.TopTextRow


@Composable
fun Collaborations() {
    Scaffold (
        bottomBar = { BottomNavBar() }
    ){innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ) {

            TopTextRow(heading = R.string.new_post_heading)
            Orgcard(picture = R.drawable.card_image, gradient = Brush.verticalGradient(listOf(C1, C2,
                C3,)) )
            Spacer(modifier = Modifier.height(19.dp))
            Orgcard(picture = R.drawable.card_image, gradient = Brush.verticalGradient(listOf(S1, S2,
                S3)) )

        }}}
@Preview
@Composable
fun DisplayOrganisationCollaborations() {
    Collaborations()

}


