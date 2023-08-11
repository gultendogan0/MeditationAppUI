package com.example.meditationappui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditationappui.ui.theme.ButtonBlue
import com.example.meditationappui.ui.theme.DeepBlue
import com.example.meditationappui.ui.theme.TextWhite

@Composable
fun DetailScreen(featureName: String?){
    Box(modifier = Modifier
        .background(DeepBlue)
        .fillMaxSize()
    ) {
        //Text(text = featureName.toString())
        Column{
            BackAndFavoriteSection()
            FeatureDetail(featureName)
        }
    }
}

@Composable
fun BackAndFavoriteSection(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(32.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_star),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(32.dp)
        )
    }
}

@Composable
fun FeatureDetail(featureName: String?){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "$featureName",
                style = MaterialTheme.typography.labelSmall,
                fontSize = 24.sp
            )
            Text(
                text = "Best practice meditations",
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.padding(15.dp))

            BoxWithConstraints(
                modifier = Modifier
                    .padding(7.5.dp)
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(20.dp))
                    .background(color = Color(0xff8f98fd))
            ){
                val width = constraints.maxWidth
                val height = constraints.maxHeight

                // Medium colored path
                val mediumColoredPoint1 = Offset(0f, height * 0.3f)
                val mediumColoredPoint2 = Offset(width * 0.1f, height * 0.35f)
                val mediumColoredPoint3 = Offset(width * 0.4f, height * 0.05f)
                val mediumColoredPoint4 = Offset(width * 0.75f, height * 0.7f)
                val mediumColoredPoint5 = Offset(width * 1.4f, -height.toFloat())

                val mediumColoredPath = Path().apply {
                    moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
                    standardQuadFromTo(mediumColoredPoint1, mediumColoredPoint2)
                    standardQuadFromTo(mediumColoredPoint2, mediumColoredPoint3)
                    standardQuadFromTo(mediumColoredPoint3, mediumColoredPoint4)
                    standardQuadFromTo(mediumColoredPoint4, mediumColoredPoint5)
                    lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
                    lineTo(-100f, height.toFloat() + 100f)
                    close()
                }

                // Light colored path
                val lightPoint1 = Offset(0f, height * 0.35f)
                val lightPoint2 = Offset(width * 0.1f, height * 0.4f)
                val lightPoint3 = Offset(width * 0.3f, height * 0.35f)
                val lightPoint4 = Offset(width * 0.65f, height.toFloat())
                val lightPoint5 = Offset(width * 1.4f, -height.toFloat() / 3f)

                val lightColoredPath = Path().apply {
                    moveTo(lightPoint1.x, lightPoint1.y)
                    standardQuadFromTo(lightPoint1, lightPoint2)
                    standardQuadFromTo(lightPoint2, lightPoint3)
                    standardQuadFromTo(lightPoint3, lightPoint4)
                    standardQuadFromTo(lightPoint4, lightPoint5)
                    lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
                    lineTo(-100f, height.toFloat() + 100f)
                    close()
                }
                Canvas(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    drawPath(
                        path = mediumColoredPath,
                        color = Color(0xff9fa5fe)
                    )
                    drawPath(
                        path = lightColoredPath,
                        color = Color(0xffaeb4fd)
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_headphone),
                        contentDescription = "Music",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(bottom = 12.dp)
                    )
                    Text(
                        text = "Start",
                        color = TextWhite,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .clickable {

                            }
                            .align(Alignment.BottomEnd)
                            .clip(RoundedCornerShape(10.dp))
                            .background(ButtonBlue)
                            .padding(12.dp)
                    )
                }
            }

            Text(
                text = "Sleep music • 45 min",
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "Ease the mind into a restful night's sleep with these deep, amblent tones.",
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 8.dp, top = 8.dp, bottom = 8.dp)
            )


            Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.padding(start = 4.dp, top = 4.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "Star",
                    tint = Color.White,
                    modifier = Modifier.padding(bottom = 12.dp)
                )
                Text(
                    text = "12,542 Saved",
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 12.dp, top = 12.dp)
                )
            }

            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(start = 6.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_headphone),
                    contentDescription = "Headphone",
                    tint = Color.White,
                    modifier = Modifier.padding(bottom = 12.dp)
                )
                Text(
                    text = "43,453 Listening",
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 14.dp, top = 12.dp)
                )
            }

        }
    }
}