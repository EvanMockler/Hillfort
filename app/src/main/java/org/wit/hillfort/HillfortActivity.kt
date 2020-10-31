package org.wit.hillfort

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class HillfortActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        info("Hillfort Activity started..")
        setContentView(R.layout.activity_hillfort)
    }
}