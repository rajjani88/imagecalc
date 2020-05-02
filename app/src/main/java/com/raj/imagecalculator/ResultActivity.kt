package com.raj.imagecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raj.imagecalculator.utils.CalculateEval
import kotlinx.android.synthetic.main.activity_result.*
import javax.script.ScriptEngineManager

class ResultActivity : AppCompatActivity() {


    private lateinit var resultText: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val mgr = ScriptEngineManager()
        val engine = mgr.getEngineByName("JavaScript")

        resultText = intent.getStringExtra("key_result")

        val x = engine.eval("1+2")

        tvExp.text = resultText

        tvCalculatedResult.text = x.toString()

    }
}
