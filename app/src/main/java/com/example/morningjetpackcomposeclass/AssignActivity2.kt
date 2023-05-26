package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class AssignActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            games()

        }
    }
}
@Composable
fun games(){

    var scrollstate= rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollstate),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //Barbie
        Card(modifier = Modifier.fillMaxWidth()){
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.game1), contentDescription = "Barbie",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column() {
                    Text(
                        text = "Barbie",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )


                    Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif
                    )

                    Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        //Attila Starwar
        Card(modifier = Modifier.fillMaxWidth()){
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.games2), contentDescription = "Attila Starwar",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column() {
                    Text(
                        text = "Attila Starwar",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        //Baby Legs
        Card(modifier = Modifier.fillMaxWidth()){
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.games3), contentDescription = "Baby Legs",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column() {
                    Text(
                        text = "Baby Legs",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        //Baby Pooppybutthole
        Card(modifier = Modifier.fillMaxWidth()){

            Row() {
                Image(
                    painter = painterResource(id = R.drawable.game4), contentDescription = "Baby Pooppybutthole",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column() {
                    Text(
                        text = "Baby Pooppy",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        //Baby Wizard
        Card(modifier = Modifier.fillMaxWidth()){
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.games5), contentDescription = "Baby Wizard",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column() {
                    Text(
                        text = "Baby Wizard",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        //Family Guy
        Card(modifier = Modifier.fillMaxWidth()){
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.game6), contentDescription = "Family Guy",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column() {
                    Text(
                        text = "Family Guy",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        //Spongebob
        Card(modifier = Modifier.fillMaxWidth()){
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.game7), contentDescription = "Spongebob",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column() {
                    Text(
                        text = "Spongebob",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        //Ricky and Morty
        Card(modifier = Modifier.fillMaxWidth()){
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.game8), contentDescription = "Ricky and Morty",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column() {
                    Text(
                        text = "Ricky and Morty",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }

    }

}


@Preview(showBackground = true)
@Composable
fun gamesPreview(){
    games()
}