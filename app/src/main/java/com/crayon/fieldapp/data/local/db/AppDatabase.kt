package com.crayon.fieldapp.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.crayon.fieldapp.data.local.dao.*
import com.crayon.fieldapp.data.model.*

@Database(
    entities = [
        Job::class,
        Store::class,
        Project::class,
        User::class,
        GroupUser::class,
        GroupStore::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun jobDao(): JobDao

    abstract fun storeDao(): StoreDao

    abstract fun projectDao(): ProjectDao

    abstract fun userDao(): UserDao

    abstract fun groupStoreDao(): GroupStoreDao

    abstract fun groupUserDao(): GroupUserDao


}