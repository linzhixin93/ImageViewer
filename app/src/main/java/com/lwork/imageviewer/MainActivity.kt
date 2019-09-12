package com.lwork.imageviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.lwork.imageviewer.lib.ImageViewer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_show)
            .setOnClickListener {
                ImageViewer
                    .setImageList(arrayListOf(
                        "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568269644157&di=5cc21a70390ebae62ed3a954c62fd4cd&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201608%2F17%2F20160817123942_tfAu8.jpeg",
                        "https://ss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=a62e824376d98d1069d40a31113eb807/838ba61ea8d3fd1fc9c7b6853a4e251f94ca5f46.jpg",
                        "https://ss1.baidu.com/9vo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=05b297ad39fa828bce239be3cd1e41cd/0eb30f2442a7d9337119f7dba74bd11372f001e0.jpg",
                        "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568269644158&di=0cb52a4718f9e6f5d4ff01241b4356d5&imgtype=0&src=http%3A%2F%2Fwww.33lc.com%2Farticle%2FUploadPic%2F2012-10%2F2012101714103364371.jpg",
                        "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568269644157&di=dfdc9d2690e8da7f83d1c72d7b5437e8&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201205%2F20%2F20120520113807_ZhnCB.jpeg",
                        "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568269644155&di=bb618cde887a69b106383014be3e388b&imgtype=0&src=http%3A%2F%2Fwww.33lc.com%2Farticle%2FUploadPic%2F2012-8%2F2012838591869034.jpg"
                    ))
                    .show(this)
            }
    }
}
