package com.lwork.imageviewer.lib

import android.content.Context
import android.content.Intent

/**
 * author：LinZhiXin
 * date：2019/9/12
 * description：
 **/

object ImageViewer {

    lateinit var imageList: List<String>

    var startPosition = 0

    fun setStartPosition(position : Int) : ImageViewer {
        startPosition = position
        return this
    }

    fun setImageList(list: List<String>): ImageViewer {
        imageList = list
        return this
    }

    fun show(context: Context) {
        context.startActivity(Intent(context, ImageViewerActivity::class.java))
    }
}