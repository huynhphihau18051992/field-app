package com.crayon.fieldapp.di

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.constants.Constants
import com.crayon.fieldapp.data.local.db.AppDatabase
import com.crayon.fieldapp.data.local.pref.AppPrefs
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.data.repository.*
import com.crayon.fieldapp.data.repository.impl.*
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val repositoryModule = module {
    factory { AppDispatchers(Dispatchers.Main, Dispatchers.IO) }
    single { createDatabaseName() }
    single { createAppDatabase(get(), get()) }
    single { createJobDao(get()) }
    single { createStoreDao(get()) }
    single { createProjectDao(get()) }
    single { createUserDao(get()) }
    single { createGroupStoreDao(get()) }
    single { createGroupUserDao(get()) }
    single<PrefHelper> { AppPrefs(get(), get()) }
    single { Gson() }
    single<UserRepository> { UserRepositoryImpl(get(), get())}
    single<ApplicationRepository> { ApplicationRepositoryImpl(get(), get()) }
    single<AttendanceRepository> { AttendanceRepositoryImpl(get(), get()) }
    single<JobRepository> { JobRepositoryImpl(get(), get()) }
    single<SwitchShiftRepository> { SwitchShiftRepositoryImpl(get(), get()) }
    single<ProjectRepository> { ProjectRepositoryImpl(get(), get()) }
    single<StoreRepository> { StoreRepositoryImpl(get(), get()) }
    single<GroupStoreRepository> { GroupStoreRepositoryImpl(get(), get()) }
    single<GroupUserRepository> { GroupUserRepositoryImpl(get(), get()) }
    single<RoleRepository> { RoleRepositoryImpl(get()) }
    single<NotificationRepository> { NotificationRepositoryImpl(get(), get()) }
    single<MemberInvitationRepository> { MemberInvitationRepositoryImpl(get(), get()) }
    single<TaskRepository> { TaskRepositoryImpl(get(), get()) }
}

fun createDatabaseName() = Constants.DATABASE_NAME

fun createAppDatabase(dbName: String, context: Context) =
    Room.databaseBuilder(context, AppDatabase::class.java, dbName).build()

fun createJobDao(appDatabase: AppDatabase) = appDatabase.jobDao()
fun createProjectDao(appDatabase: AppDatabase) = appDatabase.projectDao()
fun createStoreDao(appDatabase: AppDatabase) = appDatabase.storeDao()
fun createUserDao(appDatabase: AppDatabase) = appDatabase.userDao()
fun createGroupStoreDao(appDatabase: AppDatabase) = appDatabase.groupStoreDao()
fun createGroupUserDao(appDatabase: AppDatabase) = appDatabase.groupUserDao()
