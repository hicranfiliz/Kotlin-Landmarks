package com.example.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.kotlinlandmarkbook.databinding.ActivityDetailsBinding
import com.example.kotlinlandmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        // layout inflater (sisirici) -> xml'le kod arasinda bir baglanti yapacagimiz zaman aklimiza bu gelmeli.
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        // Bu datalari dizi halinde tutacagim..
        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val clockTower = Landmark("Izmir", "Turkiye", R.drawable.izmir)
        val anitkabir = Landmark("Anitkabir", "Turkiye", R.drawable.ankara)
        val eiffel = Landmark("Eiffel", "Fransa", R.drawable.paris)
        val collesium = Landmark("Collesium", "Italy", R.drawable.roma)

        landmarkList.add(pisa)
        landmarkList.add(clockTower)
        landmarkList.add(anitkabir)
        landmarkList.add(eiffel)
        landmarkList.add(collesium)

        // Adapter : layout ile data 'yi birbirine baglayan,
        // ayni zamanda listview ve recycler view gibi veri setlerini gosterecegimiz gorunumlere baglanip kullaniciya bunlari gostermeye yarayan yapi.
        // Adapter verimli yontemde ayri bir sinifa yazilabilir. Ya da listview gibi yontemde ayni yere yazilabilir.

        // mapping: landmark objelerini landmark'larin isimlerine cevir.

        // asagida bu xml'in icinde sadece 1 metin gosterebiliyoruz demek. Gosterecgimiz metin landmarklist
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            landmarkList.map { landmark -> landmark.name })
        binding.listView.adapter = adapter
    }

}