package space.alehandrozed.spravochnik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {

    }

    fun onClickHTML(view: View) {
        val intent = Intent(this,HtmlActivity::class.java)
        startActivity(intent)
    }
}