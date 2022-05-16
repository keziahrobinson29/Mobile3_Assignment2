package com.example.mobile3_assignment2.screens

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mobile3_assignment2.NavRoutes

@Composable
fun Welcome(navController: NavHostController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(listOf(

                    Color(255, 128, 128),
                    Color(255, 102, 102),
                    Color(255, 77, 77),
                    Color(255, 51, 51),

                    )
                )),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        Text(
            text = "Welcome to My Jetpack Compose Journey",
            style = MaterialTheme.typography.h4,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(30.dp))
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
                    text = "INFORMATION",
                    fontWeight = FontWeight.Bold
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
                    text = "START MY JOURNEY",
                    fontWeight = FontWeight.Bold
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