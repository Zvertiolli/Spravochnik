package space.alehandrozed.spravochnik

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_html.*


class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.content_layout)
        setContentView(R.layout.activity_content)

//        textViewTitle.text = intent.getStringExtra("title")
//        textViewContent.text = intent.getStringExtra("content")
//        imageViewContent.setImageResource(intent.getIntExtra("image", R.drawable.som))
        webView.loadUrl("file:///android_asset/item_02.html")
    }
}