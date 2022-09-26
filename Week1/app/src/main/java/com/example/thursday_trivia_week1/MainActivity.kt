package com.example.thursday_trivia_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thursday_trivia_week1.ui.theme.Thursday_trivia_week1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Thursday_trivia_week1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Column {
                        logo()


                    }
                }
            }
        }
    }
}

@Composable
fun logo() {
    Column {
        Image(
            painter = painterResource(id = R.drawable.jetpack),
            contentDescription = "Image",
            modifier = Modifier
                .padding(26.dp)
//                .padding(horizontal = 16.dp, vertical = 6.dp)
                .width(350.dp)
//                .height(450.dp),

            )
        Text(
            text = "Shifa Shaikh",
            color = Color(56, 112, 179, 255),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(horizontal = 116.dp, vertical = 6.dp)
        )
        Text(
            text = "❤",
            fontSize = 80.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                    .padding(horizontal = 145.dp, vertical = 6.dp)
        )
        Text(
            text = "Jetpack Compose",
            color = Color(8, 48, 66, 255),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(horizontal = 80.dp, vertical = 6.dp)
        )

    }
}





@Preview(showBackground = true,
        widthDp = 390,
        heightDp = 800)
@Composable
fun DefaultPreview() {
    Thursday_trivia_week1Theme {
        logo()


    }
}