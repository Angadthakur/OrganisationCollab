package ui.elements



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.organisationcollaborations.R

@Composable
fun Orgcard2(
    modifier: Modifier = Modifier,
) {

    val brush = Brush.verticalGradient(listOf(Color.Magenta,Color.Magenta, Color.White))

    Box (
        modifier = modifier
            .height(290.dp)
            .padding(horizontal = 10.dp)
            .fillMaxWidth()
            .background(
                brush = brush,
                shape = RoundedCornerShape(20.dp),



                )
    ) {
        Image(
            painter = painterResource(R.drawable.card_image),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .clip(RoundedCornerShape(20.dp))
                //.padding(bottom = 0.dp)
                .align(Alignment.TopCenter),
            /*.background(
                brush = brush,
                shape = RoundedCornerShape(20.dp)
            )*/
            //.width(600.dp),


            alignment = Alignment.Center,


            )
        Text(
            text = "Organisation Name",
            style = TextStyle(
                color = Color.Black,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold

            ),
            modifier = Modifier
                .padding(start = 13.dp, top = 198.dp)
        )
        Text(
            text = "Description",
            style = TextStyle(
                color = Color.Black,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold

            ),
            modifier = Modifier
                .padding(start = 13.dp, top = 215.dp)
        )
        Text(
            text = "Money raised -",
            style = TextStyle(
                color = Color.Black,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold

            ),
            modifier = Modifier
                .padding(start = 13.dp, top = 260.dp)

        )
        Text(
            text = "Impact -",
            style = TextStyle(
                color = Color.Black,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold

            ),
            modifier = Modifier
                .padding(start = 120.dp, top = 260.dp)

        )
        Text(
            text = "Volunteers -",
            style = TextStyle(
                color = Color.Black,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold

            ),
            modifier = Modifier
                .padding(start = 200.dp, top = 260.dp)

        )
        Spacer(modifier = Modifier.height(14.dp))
    }
}


@Preview
@Composable
fun DisplayCard2() {
    Orgcard2()
}