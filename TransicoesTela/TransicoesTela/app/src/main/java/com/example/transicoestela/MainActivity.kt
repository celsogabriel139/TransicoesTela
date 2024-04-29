import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

private val Any.activity_main: Any
    get() {
        TODO("")
    }

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProxima = null
        btnProxima.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setContentView(activityMain: Any) {
        TODO("Not yet implemented")
    }
}

private fun Nothing?.setOnClickListener(function: () -> Unit) {
    TODO("")
}

class R {
    companion object {
        val layout: Any
            get() {
                TODO()
            }
    }

}
