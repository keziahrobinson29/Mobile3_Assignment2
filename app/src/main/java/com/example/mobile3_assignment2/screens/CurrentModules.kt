package com.example.mobile3_assignment2.screens

import android.R
import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mobile3_assignment2.NavRoutes

@Composable
fun CurrentModules(navController: NavHostController) {
    val visible: MutableState<Boolean> = remember{ mutableStateOf(false) }
    alertDialog(visible = visible)

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
                ))),

        ) {

        Row() {
            Text(
                text = "Current Modules",
                color = Color.Black,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                style = TextStyle(textDecoration = TextDecoration.Underline)
            ) }
        Spacer(modifier = Modifier.height(25.dp))

//-------------------------------------------ADP------------------------------------------------------------

        Row() {
            Text(
                text = "Applications Development Practice 3",
                color = Color.Black,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold
            ) }

        Row(){

            Column(){
                Text(
                    text = "Practical  |  1 Year",
                    color = Color.Black,
                    fontSize = 16.sp,
                ) } }

        Spacer(modifier = Modifier.height(15.dp))
//-------------------------------------------ADT------------------------------------------------------------

        Row() {
            Text(
                text = "Applications Development Theory 3",
                color = Color.Black,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold

            ) }

        Row(){

            Column(){
                Text(
                    text = "    Theory  |  1 Year",
                    color = Color.Black,
                    fontSize = 16.sp,
                ) } }

        Spacer(modifier = Modifier.height(15.dp))
//--------------------------------------------ICT------------------------------------------------------------

        Row() {
            Text(
                text = "ICT Electives 3 | Mobile Programming",
                color = Color.Black,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold
            ) }

        Row(){

            Column(){
                Text(
                    text = "Practical  |  1 Year",
                    color = Color.Black,
                    fontSize = 16.sp,
                ) } }


        Spacer(modifier = Modifier.height(15.dp))

//--------------------------------------------PFP------------------------------------------------------------

        Row() {
            Text(

                text = "Professional Practice 3",
                color = Color.Black,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold,

                ) }

        Row(){

            Column(){
                Text(
                    text = "    Theory  |  1 Year",
                    color = Color.Black,
                    fontSize = 16.sp,
                ) } }

        Spacer(modifier = Modifier.height(15.dp))
//--------------------------------------------ITS------------------------------------------------------------

        Row() {
            Text(

                text = "Information Systems 3",
                color = Color.Black,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold,

                ) }

        Row(){

            Column(){
                Text(
                    text = "Practical  |  1 Year",
                    color = Color.Black,
                    fontSize = 16.sp,
                ) } }

        Spacer(modifier = Modifier.height(15.dp))
//----------------------------------------------PRM------------------------------------------------------------

        Row() {
            Text(

                text = "Project Management 3",
                color = Color.Black,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold,

                ) }

        Row(){

            Column(){
                Text(
                    text = "Practical  |  1 Year",
                    color = Color.Black,
                    fontSize = 16.sp,
                ) } }

        Spacer(modifier = Modifier.height(15.dp))
//-----------------------------------------------PRP------------------------------------------------------------

        Row() {
            Text(

                text = "Project Presentation 3",
                color = Color.Black,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold,

                ) }
        Row(){

            Column(){
                Text(
                    text = "Practical  |  1 Year",
                    color = Color.Black,
                    fontSize = 16.sp,
                ) } }

        Spacer(modifier = Modifier.height(15.dp))
//--------------------------------------------PRT------------------------------------------------------------

        Row() {
            Text(

                text = "Project 3",
                color = Color.Black,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold,
            )}

        Row(){

            Column(){
                Text(
                    text = "Practical  |  1 Year",
                    color = Color.Black,
                    fontSize = 16.sp,
                ) } }
        Spacer(modifier = Modifier.height(25.dp))
//-------------------------------------------Buttons------------------------------------------------------------

        val visible: MutableState<Boolean> = remember{ mutableStateOf(false) }
        alertDialog(visible = visible)


        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center
        ) {

            Button(
                onClick = {visible.value = true},
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.white)),
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp)
            ) {

                Text(
                    text = "Goodbye",
                    fontWeight = FontWeight.Bold)
            }

            Button(
                onClick = { navController.navigate(NavRoutes.Details.route) },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.white)),
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp
                )

            ){
                Text(
                    text = "Go Back",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,)
            } } } }
//-------------------------------------------Alert_Dialog----------------------------------------------------------

@Composable
fun alertDialog(visible: MutableState<Boolean>){
    val activity = (LocalContext.current as? Activity)

    if(visible.value){
        AlertDialog(onDismissRequest = { visible.value = false },
            dismissButton = {
                TextButton(onClick = {visible.value = false }){
                    Text(text = "No")
                }
            },
            confirmButton = {
                TextButton(onClick = {activity?.finish()}){
                    Text(text = "Yes")
                } },
            title = {Text(text = "My Jetpack Composed Journey")},
            text = {Text(text = "Leaving Now?")},
        )}}
