package com.example.galactictours

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galactictours.ui.theme.GalacticToursTheme

val BebasNeue = FontFamily(
    Font(R.font.bebasneue, FontWeight.Normal)
)

val Inter = FontFamily(
    Font(R.font.inter, FontWeight.Normal)
)

@Composable
fun InfoScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Back and bookmark image
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = "BackArrow",
                    modifier = Modifier.size(14.dp)
                )

                Text(
                    text = "Back",
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.bookmark),
                contentDescription = "Bookmark",
                modifier = Modifier.size(47.dp)
            )
        }

        // Earth image
        Image(
            painter = painterResource(id = R.drawable.earth_1),
            contentDescription = "Header",
            modifier = Modifier.size(300.dp)
        )

        // Main content row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left column for "Planet" text
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Planet",
                    fontSize = 14.sp,
                    color = Color.White,
                    fontFamily = Inter
                )
            }

            // Right column for rating and reviews
            Column(
                horizontalAlignment = Alignment.End
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Verified Icon",
                        modifier = Modifier.size(18.dp)
                    )

                    Spacer(modifier = Modifier.width(4.dp))

                    Text(
                        text = "4.8",
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Inter
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "8 billion reviews",
                    fontSize = 10.sp,
                    color = Color.White,
                    fontFamily = Inter
                )
            }
        }

        //  The Earth and description
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = "THE EARTH",
                fontSize = 54.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = BebasNeue
            )

            Text(
                text = "Nestled in the vastness of space, Earth is the third planet from the Sun and the only known celestial body to harbour life (so far). With its diverse ecosystems, ranging from lush forests to expansive deserts, and its vast oceans teeming with life, Earth is a vibrant oasis in the cosmos. Its atmosphere provides the perfect conditions for a rich tapestry of flora and fauna, making it a haven for countless species, including humans. From the highest peaks to the deepest ocean trenches, Earth's beauty and biodiversity inspire awe and reverence, earning it the nickname \"The Blue Jewel\" of the solar system.",
                fontSize = 12.sp,
                color = Color.White,
                fontFamily = Inter,
                lineHeight = 14.52.sp
            )
        }

        //  First row of cards
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        ) {

            //  Card 1
            Column (
                modifier = Modifier
                    .padding(horizontal = 5.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF11083E))
                    .padding(4.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(150.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    // Left side content
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "71%",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 32.sp,
                            fontFamily = BebasNeue
                        )

                        Text(
                            text = "H20 Surface Coverage",
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Inter
                        )
                    }

                    // Right side content
                    Image(
                        painter = painterResource(id = R.drawable.drop),
                        contentDescription = "Water",
                        modifier = Modifier.size(28.dp)
                    )
                }
            }

            //  Card 2
            Column (
                modifier = Modifier
                    .padding(horizontal = 5.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF11083E))
                    .padding(4.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(180.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    // Left side content
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "42%",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 32.sp,
                            fontFamily = BebasNeue
                        )

                        Text(
                            text = "Technological Advancement",
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Inter
                        )
                    }

                    // Right side content
                    Image(
                        painter = painterResource(id = R.drawable.chip),
                        contentDescription = "Chip",
                        modifier = Modifier.size(28.dp)
                    )
                }
            }
        }

        //  Card 3, the long one at the bottom
        Row {
            Column (
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF11083E))
                    .padding(4.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(360.dp)
                ) {
                    // Left side content
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "FACTS ABOUT EARTH",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            fontFamily = BebasNeue
                        )

                        Text(
                            text = "3 videos available",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontFamily = Inter
                        )

                    }

                    Button(
                        onClick = { },
                        colors = ButtonDefaults.textButtonColors(containerColor = "#7920C2".toColor())
                    ) {
                        Text(
                            text = "Watch",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Inter
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InfoScreenPreview() {
    GalacticToursTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = "#090011".toColor()
        ) {
            InfoScreen()
        }
    }
}