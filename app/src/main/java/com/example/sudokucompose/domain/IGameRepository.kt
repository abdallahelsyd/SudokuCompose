package com.example.sudokucompose.domain

import java.lang.Exception

interface IGameRepository {
    suspend fun saveGame(
        elapsedTime:Long,
        onSuccess:(Unit)->Unit,
        onError:(Exception)->Unit
    )

    suspend fun updateGame(
        game:SudokuPuzzle,
        onSuccess:(Unit)->Unit,
        onError:(Exception)->Unit
    )
    suspend fun updateNode(
        x:Int,
        y:Int,
        color:Int,
        elapsedTime:Long,
        onSuccess:(isComplete:Boolean)->Unit,
        onError:(Exception)->Unit
    )
    suspend fun getCurrentGame(
        game:SudokuPuzzle,
        onSuccess:(currentGame:SudokuPuzzle,isComplete:Boolean)->Unit,
        onError:(Exception)->Unit
    )
    suspend fun getSettings(
        onSuccess:(Settings)->Unit,
        onError:(Exception)->Unit
    )
    suspend fun updateSettings(
        settings: Settings,
        onSuccess:(Settings)->Unit,
        onError:(Exception)->Unit
    )
}