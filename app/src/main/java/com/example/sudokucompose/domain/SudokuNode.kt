package com.example.sudokucompose.domain

import java.io.Serializable

data class SudokuNode(
    val x:Int,
    val y:Int,
    val color:Int=0,
    var readOnly:Boolean=true

):Serializable{
    override fun hashCode(): Int {
        return getHash(x,y)
    }
}
internal fun getHash(x:Int,y: Int):Int{
    return "${x*100}$y".toInt()
}