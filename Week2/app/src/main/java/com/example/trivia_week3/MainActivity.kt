package com.example.trivia_week3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trivia_week3.ui.theme.Trivia_Week3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Trivia_Week3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Game("Android")
                }
            }
        }
    }
}

@Composable
fun Game(name: String) {

    Column(){
        Image(
            painter = painterResource(id = R.drawable.hands),
            contentDescription = "banner image",
            modifier = Modifier.paddingFromBaseline(top = 0.dp)
        )
        Text(
            text = "Score",
            fontSize = 30.sp,
            modifier = Modifier
                .padding(horizontal = 160.dp, vertical = 15.dp),
        )
        Text(
            text = "0 / 4",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(horizontal = 145.dp, vertical = 0.dp)
        )
        Row {
            Spacer(modifier = Modifier.width(80.dp))
            Column() {
                Text(
                    text = "You chose",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(top = 150.dp)
//                        .padding(horizontal = 70.dp, vertical = 150.dp)

                )
//                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Rock",
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )
            }
            Spacer(modifier = Modifier.width(80.dp))
            Column() {
                Text(
                    text = "Android chose",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(top = 150.dp)
//                        .padding(horizontal = 35.dp, vertical = 150.dp)
                )
                Text(
                    text = "Paper",
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
//                        .padding(horizontal = 45.dp, vertical = 0.dp)
                )
            }
        }
        Row() {
            Spacer(modifier = Modifier.width(25.dp))
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(size = 15.dp),
                modifier = Modifier
                    .padding(top = 100.dp)
                    .height(100.dp)
                    .width(100.dp)
                )
                {
                Text(
                    text = "Rock",
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(size = 15.dp),
                modifier = Modifier
                    .padding(top = 100.dp)
                    .height(100.dp)
                    .width(100.dp)
                )
            {
                Text(text = "Paper")
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(size = 15.dp),
                modifier = Modifier
                    .padding(top = 100.dp)
                    .height(100.dp)
                    .width(100.dp)
                )
            {
                Text(text = "Scissors")
            }
        }
        Text(text = "#JetpackCompose",
            fontSize = 20.sp,
            modifier = Modifier
            .padding(horizontal = 120.dp, vertical = 35.dp))
    }



}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Trivia_Week3Theme {
        Game("Android")
    }
}