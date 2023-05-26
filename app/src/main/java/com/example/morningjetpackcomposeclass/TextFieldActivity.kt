 package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class TextFieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           form()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun form(){
    Column(modifier = Modifier.fillMaxSize().background(color = Color.Yellow)) {
        Text(text = "PERSONAL DETAILS", fontSize = 40.sp, color = Color.Black, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)


        //FIRSTNAME
        var text by remember{ mutableStateOf("") }
        TextField(
            value = text ,
            onValueChange = {text=it},
            label = { Text(text = "Enter Firstname")},
            placeholder = { Text(text = "Enter Firstname")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Form")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "Form")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        //MIDDLENAME
        var mname by remember{ mutableStateOf("") }
        TextField(
            value = mname ,
            onValueChange = {mname=it},
            label = { Text(text = "Enter Middlename")},
            placeholder = { Text(text = "Enter Middlename")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Form")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "Form")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )


        //SURNAME
        var sname by remember{ mutableStateOf("") }
        TextField(
            value = sname ,
            onValueChange = {sname=it},
            label = { Text(text = "Enter Surname")},
            placeholder = { Text(text = "Enter Surname")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Form")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "Form")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        //EMAIL
        var myemail by remember{ mutableStateOf("") }
        TextField(
            value = myemail ,
            onValueChange = {myemail=it},
            label = { Text(text = "Enter Email")},
            placeholder = { Text(text = "Type your email")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Form")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        //PASSWORD
        var pass by remember{ mutableStateOf("") }
        TextField(
            value = pass ,
            onValueChange = {pass=it},
            label = { Text(text = "Enter Password")},
            placeholder = { Text(text = "Type your password")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "Form")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "Form")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        //CONTACT
        var phone by remember{ mutableStateOf("") }
        TextField(
            value = phone ,
            onValueChange = {phone=it},
            label = { Text(text = "Contact")},
            placeholder = { Text(text = "Enter Phone number")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold),
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "Form")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "Form")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )
    }

}





 @Preview(showBackground = true)
@Composable
fun formPreview(){
    form()
}
