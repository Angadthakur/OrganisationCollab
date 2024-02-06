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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ui.elements.BottomNavBar
import ui.elements.Orgcard
import ui.elements.Orgcard2
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
            Orgcard(picture = R.drawable.card_image)
            Spacer(modifier = Modifier.height(19.dp))
            Orgcard2()
        }}}
@Preview
@Composable
fun DisplayOrganisationCollaborations() {
    Collaborations()

}
