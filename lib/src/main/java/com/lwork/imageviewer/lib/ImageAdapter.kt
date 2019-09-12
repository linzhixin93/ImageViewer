package com.lwork.imageviewer.lib

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

/**
 * author：LinZhiXin
 * date：2019/9/12
 * description：
 **/

class ImageAdapter : PagerAdapter() {

    lateinit var imageList : List<String>

    override fun getCount(): Int = imageList.size

    override fun isViewFromObject(view: View, obj: Any): Boolean = view == obj

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imgItem = LayoutInflater.from(container.context).inflate(R.layout.item_image, container, false)
        val iv = imgItem.findViewById<ImageView>(R.id.photo_view)
        val pb = imgItem.findViewById<ProgressBar>(R.id.pb_image_item)
        container.addView(imgItem)
        Glide.with(container.context)
            .load(imageList[position])
            .fallback(R.drawable.load_failed)
            .error(R.drawable.load_failed)
            .transition(DrawableTransitionOptions.withCrossFade())
            .listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    pb.visibility = View.GONE
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    pb.visibility = View.GONE
                    return false
                }
            })
            .into(iv)
        return imgItem
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View?)
    }

}