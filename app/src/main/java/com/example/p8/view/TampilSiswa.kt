package com.example.p8.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.example.p8.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    //edit 1 : parameter statusUiSiswa
    statusUiSiswa: Siswa,
    onBackButtonClicked:()-> Unit
){}