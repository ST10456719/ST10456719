package za.ac.iie.historylessons

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() , View.OnClickListener {

    private lateinit var btnHistory: Button
    private lateinit var btnClear: Button
    private lateinit var editAge: EditText
    private lateinit var historyResults: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHistory = findViewById(R.id.btnHistory)
        btnClear = findViewById(R.id.btnClear)
        editAge = findViewById(R.id.editAge)
        historyResults = findViewById(R.id.historyResults)

        btnHistory.setOnClickListener(this)
        btnClear.setOnClickListener(this)
        editAge.text.toString()

    }

    override fun onClick(v: View?) {
        val editAge = editAge.text.toString().toInt()
        var historyResults = historyResults.text.toString()
        val historyResult = historyResults
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
        }
        when (v?.id) {
            R.id.btnHistory -> {
                historyResults.toInt()
            }

        }
        historyResult.toDouble()
        editAge.also { historyResults = it.toString() }
    }
}




