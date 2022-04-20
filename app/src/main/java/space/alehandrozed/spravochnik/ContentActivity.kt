package space.alehandrozed.spravochnik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.press_bar_layout.*

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.content_layout)
        setContentView(R.layout.press_bar_layout)

//        textViewTitle.text = intent.getStringExtra("title")
//        textViewContent.text = intent.getStringExtra("content")
//        imageViewContent.setImageResource(intent.getIntExtra("image", R.drawable.som))
        wvPressTank.loadUrl("file:///android_asset/1.html")
    }
}