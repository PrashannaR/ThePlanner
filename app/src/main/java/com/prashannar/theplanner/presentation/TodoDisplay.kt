package com.prashannar.theplanner.presentation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.prashannar.theplanner.R
import com.prashannar.theplanner.presentation.navigations.Screens
import com.prashannar.theplanner.ui.theme.Grey
import com.prashannar.theplanner.ui.theme.Purple


@Composable
fun TodoDisplay(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        var visibile by remember {
            mutableStateOf(false)
        }

        Image(
            painter = painterResource(id = R.drawable.up),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 12.dp)
                .size(50.dp)

        )

        Row(modifier = Modifier.align(Alignment.End)) {


            FloatingActionButton(
                onClick = { visibile = true },
                backgroundColor = Purple,
                contentColor = Color.White,
                modifier = Modifier

                    .padding(end = 16.dp)

            ) {
                Icon(
                    Icons.Filled.Add, contentDescription = "",
                )

            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Planning",
            fontFamily = FontFamily(Font(R.font.abrilfatface)),
            fontSize = 35.sp,
            color = Purple,
            modifier = Modifier.padding(start = 20.dp)
        )
        Text(
            text = "Your Events",
            fontFamily = FontFamily(Font(R.font.abrilfatface)),
            fontSize = 35.sp,
            color = Purple,
            modifier = Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth()
                .align(CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Text(
                text = "Today",
                fontSize = 18.sp,
                color = Purple,
                modifier = Modifier.padding(end = 8.dp),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Week",
                fontSize = 18.sp,
                color = Grey,
                modifier = Modifier.padding(end = 8.dp),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Month",
                fontSize = 18.sp,
                color = Grey,
                modifier = Modifier.padding(end = 8.dp),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "All List",
                fontSize = 18.sp,
                color = Grey,
                modifier = Modifier.padding(end = 8.dp),
                fontWeight = FontWeight.Bold
            )


        }

        Image(
            painter = painterResource(id = R.drawable.taskone),
            contentDescription = "",
            modifier = Modifier
                .align(CenterHorizontally)
                .size(300.dp)

        )

        Image(
            painter = painterResource(id = R.drawable.tasktwo),
            contentDescription = "",
            modifier = Modifier
                .align(CenterHorizontally)
                .size(300.dp)

        )

        if (visibile == true) {
            Image(
                painter = painterResource(id = R.drawable.plan),
                contentDescription = "",
                modifier = Modifier
                    .align(CenterHorizontally)
                    .size(300.dp)
                    .clickable { navController.navigate(Screens.StoryScreen.route) }

            )

        }


    }

}