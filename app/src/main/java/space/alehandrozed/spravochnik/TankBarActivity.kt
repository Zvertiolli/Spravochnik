package space.alehandrozed.spravochnik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tank_bar.*

class TankBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tank_bar)
        tvTitle.setText(R.string.press_in_tank)
        tvContent.setText(R.string.heating_system)
    }


}