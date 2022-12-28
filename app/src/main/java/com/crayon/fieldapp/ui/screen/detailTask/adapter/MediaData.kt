package com.crayon.fieldapp.ui.screen.detailTask.adapter

data class MediaData(
    val id: String? = null,
    var thumbnail: String,
    var uri: String,
    var type: Int,
    var note: String? = null,
    var isCompleted: Boolean
)