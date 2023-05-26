package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard()
        }
    }
}

@Composable
fun mycard(){
    Column(modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Breed", fontSize = 30.sp, fontWeight = FontWeight.Black)

        Card(
            modifier = Modifier
                .padding(30.dp)
                .background(color = Color.Gray)
                .padding(20.dp)
        ) {


            Text(text = "Bulldog", fontStyle = FontStyle.Italic, fontSize = 30.sp)
            Image(
                painter = painterResource(id = R.drawable.bulldog), contentDescription = "pic",
                modifier = Modifier
                    .size(width = 150.dp, height = 50.dp)
                    .clip(shape = CircleShape)
            )

        }

        //Secondcard
        Card(
            modifier = Modifier
                .padding(30.dp)
                .background(color = Color.Gray)
                .padding(20.dp)
        ) {


            Text(text = "Rottweiler", fontStyle = FontStyle.Italic, fontSize = 30.sp)
            Image(
                painter = painterResource(id = R.drawable.rott), contentDescription = "pic",
                modifier = Modifier
                    .size(width = 150.dp, height = 50.dp)
                    .clip(shape = CircleShape)
            )

        }

        //ThirdCard
        Card(
            modifier = Modifier
                .padding(30.dp)
                .background(color = Color.Gray)
                .padding(20.dp)
        ) {


            Text(text = "German Shepherd", fontStyle = FontStyle.Italic, fontSize = 30.sp)
            Image(
                painter = painterResource(id = R.drawable.germ), contentDescription = "pic",
                modifier = Modifier
                    .size(width = 150.dp, height = 50.dp)
                    .clip(shape = CircleShape)
            )

        }



    }
}

@Preview(showBackground = true)
@Composable
fun mycardpreview(){
    mycard()
}