package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class CardActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            food()

            }
        }
    }


@Composable
fun food(){

    var scrollstate= rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollstate),
        horizontalAlignment = Alignment.CenterHorizontally

        ) {

        //FirstCard
        Card(
            modifier = Modifier
                .padding(50.dp)
                .background(color = Color.Gray)
                .padding(20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.food2) , contentDescription = "Food",
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
            )
        }

        //SecondCard
        Card(
            modifier = Modifier
                .padding(50.dp)
                .background(color = Color.Gray)
                .padding(20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.food1) , contentDescription = "Food",
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
            )
        }

        //ThirdCard
        Card(
            modifier = Modifier
                .padding(50.dp)
                .background(color = Color.Gray)
                .padding(20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.food3) , contentDescription = "Food",
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
            )
        }

    }



}


@Preview(showBackground = true)
@Composable
fun cardPreview(){
    food()
}