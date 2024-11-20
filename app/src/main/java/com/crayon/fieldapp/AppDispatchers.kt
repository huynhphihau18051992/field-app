package com.crayon.fieldapp

import kotlinx.coroutines.CoroutineDispatcher

class AppDispatchers(val main: CoroutineDispatcher,
                     val io: CoroutineDispatcher)