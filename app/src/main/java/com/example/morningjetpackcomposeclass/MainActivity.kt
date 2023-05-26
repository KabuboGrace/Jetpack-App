package com.example.morningjetpackcomposeclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

        }
    }
}

@Composable
fun text(){
    var mContext= LocalContext.current
    Column(modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally


        ) {



        Text(
            text = "Welcome to Android",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
        )

        //first button

        Button(onClick = {

            mContext.startActivity(Intent(mContext, LayoutActivity::class.java))
        }) {
            Text(text = "Layout", color = Color.Gray)
        }
        Spacer(modifier = Modifier.height(20.dp))


        //second button
        Button(onClick = {
            mContext.startActivity(Intent(mContext, ImageActivity::class.java))
        }) {
            Text(text = "Image ", color = Color.Yellow)
        }
         Spacer(modifier = Modifier.height(20.dp))
        //third button
        Button(onClick = {
            mContext.startActivity(Intent( mContext,assignActivity::class.java))
        }) {
            Text(text = "Assignment ", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(20.dp))
        //Form
        Button(onClick = {
            mContext.startActivity(Intent( mContext,TextFieldActivity::class.java))
        }) {
            Text(text = "Form ", color = Color.Blue)
        }

        Spacer(modifier = Modifier.height(20.dp))
        //List
        Button(onClick = {
            mContext.startActivity(Intent( mContext,ListActivity::class.java))
        },

            ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription ="List" )
            Text(text = "List ", color = Color.Red)
        }

        Spacer(modifier = Modifier.height(20.dp))
        //Card
        Button(onClick = {
            mContext.startActivity(Intent( mContext,CardActivity::class.java))
        },

            ) {
            Text(text = "Breed", color = Color.White)
        }

        //Card2
        Button(onClick = {
            mContext.startActivity(Intent( mContext,AssignActivity2::class.java))
        },

            ) {
            Text(text = "Card", color = Color.White)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun textPreview(){
    text()
}