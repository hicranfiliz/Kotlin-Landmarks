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

        val intent = intent
        // casting: selectedLandmark'i al ve bunu Landmark objesi olara kaydet.
        var selectedLandmak = intent.getSerializableExtra("landmarkName") //as Landmark
        // bunlari serializable gonderdigim icin buraya da serializable gelir. Bu bizim istemedigimiz bir durumdur.
        // Cunku artik name degiskenine ulasamam.Ama ulasip bunlari  binding.text diyip gosterebiliyim.
        // Bu yuzden casting kullanacagiz..

        //binding.nameText.text = selectedLandmak.name
        //binding.countryName2.text = selectedLandmak.country
        //binding.imageView.setImageResource(selectedLandmak.image)

    }
}