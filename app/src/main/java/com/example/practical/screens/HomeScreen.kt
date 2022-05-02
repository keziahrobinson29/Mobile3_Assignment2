package com.example.practical.screens
import android.R
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

import com.example.practical.NavRoutes

@Composable
fun HomeScreen(navController: NavHostController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(R.color.black)
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        Text(
            text = "Welcome to My Jetpack Compose Journey",
            style = MaterialTheme.typography.h4,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(30.dp))
        val context = LocalContext.current
        val visible: MutableState<Boolean> = remember{ mutableStateOf(false) }
        ShowDialog(visible = visible)



        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center
        ){
            Button(
                onClick = {visible.value = true},
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.white)),
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp
                )

            ) {


                Text(
                    text = "INFORMATION"
                )

                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Favorite",
                )
            }

            Button(
                onClick = {navController.navigate(NavRoutes.Details.route)},
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.white)),
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp
                )

            ) {


                Text(
                    text = "START MY JOURNEY"
                )

                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Favorite",
                )
            }
            }}
    }

    @Composable
    fun ShowDialog(visible: MutableState<Boolean>){
        val context = LocalContext.current
        if(visible.value){
            AlertDialog(onDismissRequest = { visible.value = false },
                dismissButton = {
                    TextButton(onClick = {visible.value = false }){
                        Text(text = "Cancel")
                    }
                },
                confirmButton = {
                    TextButton(onClick = {visible.value = false }){
                        Text(text = "Done")
                    } },
                title = {Text(text = "My Jetpack Composed Journey")},
                text = {Text(text = "This is the start of my Jetpack Composed Journey learning to create Android Applications efficiently using kotlin. By the end of this year i will become proficient in Jetpack Composed")},




                )


        }}