package com.example.mobile3_assignment2.screens

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mobile3_assignment2.NavRoutes

@Composable
fun Details(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize().background(
                brush = Brush.linearGradient(listOf(


                    Color(255, 128, 128),
                    Color(255, 102, 102),
                    Color(255, 77, 77),
                    Color(255, 51, 51),

                    )
                )),



        ) {

        Row() {
            Text(
                text = "Name: Keziah Robinson",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row( modifier = Modifier.padding(start = 10.dp)) {
            Text(
                text = "Course: Application Development",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )
        }
        Row(modifier = Modifier.padding(start = (10.dp))) {
            Text(
                text = "Department: Information Technology",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row() {
            Text(

                text = "Student Number : 219113149",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,

                )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 80.dp),)

        {
            Button(
                onClick = {navController.navigate(NavRoutes.CurrentModules.route)},
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.white)),
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp
                )

            ) {


                Text(
                    text = "Current Modules",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                )


            }

            Button(
                onClick = { navController.navigate(NavRoutes.Welcome.route) },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.white)),
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp
                )

            ) {


                Text(
                    text = "Go Back",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                )


            }
        }
    }
}