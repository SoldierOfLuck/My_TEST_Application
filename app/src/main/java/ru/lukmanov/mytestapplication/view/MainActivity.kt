package ru.lukmanov.mytestapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.lukmanov.kotlin_course_app.R
import ru.lukmanov.kotlin_course_app.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.getRoot()
        setContentView(view)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}