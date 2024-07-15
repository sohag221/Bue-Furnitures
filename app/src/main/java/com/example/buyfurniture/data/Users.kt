package com.example.buyfurniture.data

import java.nio.file.Path

class Users(
    val firstName :String,
    val lastName : String,
    val email : String,
    var imagePath: String = ""
) {

    constructor(): this("","","","")
}