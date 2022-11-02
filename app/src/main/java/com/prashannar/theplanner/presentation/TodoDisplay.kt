package com.prashannar.theplanner.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prashannar.theplanner.R
import com.prashannar.theplanner.ui.theme.Grey
import com.prashannar.theplanner.ui.theme.Purple

@Preview(showSystemUi = true)
@Composable
fun TodoDisplay() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {

        Row(modifier = Modifier.align(Alignment.End)) {
            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "",
                modifier = Modifier.size(100.dp)
            )
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


    }

}