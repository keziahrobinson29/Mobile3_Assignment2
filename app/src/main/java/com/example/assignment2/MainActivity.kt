package com.example.assignment2

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.background

import androidx.compose.material.*
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.Favorite

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text ("Welcome To My Jetpack Composed Journey")
                }
            }
        }




@Composable
fun Welcome(arg: String){
Column(

    Modifier.background(Color(0xff7249CC)),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center

   )
    {val openDialog = remember { mutableStateOf(false) }


        Text(text = "Welcome to My Jetpack Compose Journey", textAlign = TextAlign.Center,modifier = Modifier.padding(bottom = 70.dp)
        )


    Row() {
        val context = LocalContext.current
        Button(
            onClick = {  openDialog.value = true }
        ) {



            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Favorite",
            )
            Text("Information")

            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Favorite",
            )
        }

        if (openDialog.value) {

            AlertDialog(
                onDismissRequest = {
                    openDialog.value = false
                },
                title = {
                    Text(text = "My Jetpack Composed Journey")
                },
                text = {
                    Text("This is the start of my Jetpack Composed Journey learning to create Android Applications efficiently using kotlin. By the end of this year i will become proficient in Jetpack Compose")
                },

                confirmButton = {
                    Button(
                        onClick = {
                            openDialog.value = false
                        }) {
                        Text("Close")
                    }
                }

                )

        }
    }

    }
}



@Preview(showBackground = true)
@Composable
fun previewProject() {
    Welcome(arg = "Welcome to My Jetpack Compose Journey")

}