package com.example.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinlandmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        // layout inflater (sisirici) -> xml'le kod arasinda bir baglanti yapacagimiz zaman aklimiza bu gelmeli.
        val view = binding.root
        setContentView(view)

    }
}