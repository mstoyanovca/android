package com.mstoyanov.musiclessons.repository

import androidx.room.*
import com.mstoyanov.musiclessons.model.Student
import com.mstoyanov.musiclessons.model.StudentWithPhoneNumbers

@Dao
interface StudentDao {
    @Query("SELECT * FROM student")
    fun findAll(): MutableList<Student>

    @Transaction
    @Query("SELECT * FROM student")
    fun findAllWithPhoneNumbers(): List<StudentWithPhoneNumbers>

    @Insert
    fun insert(student: Student): Long

    @Update
    fun update(student: Student)

    @Delete
    fun delete(student: Student)
}
