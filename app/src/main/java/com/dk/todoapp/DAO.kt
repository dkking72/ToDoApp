package com.dk.todoapp

import androidx.room.*
import androidx.room.Entity

@Dao
interface DAO {
    @Insert
    suspend fun insertTask(entity: com.dk.todoapp.Entity)

    @Update
    suspend fun updateTask(entity: com.dk.todoapp.Entity)

    @Delete
    suspend fun deleteTask(entity: com.dk.todoapp.Entity)

    @Query("Delete from to_do")
    suspend fun deleteAll()

    @Query("Select * from to_do")
    suspend fun getTasks():List<CardInfo>

}