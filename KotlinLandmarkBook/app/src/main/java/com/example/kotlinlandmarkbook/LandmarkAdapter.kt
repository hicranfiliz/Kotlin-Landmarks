package com.example.kotlinlandmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlandmarkbook.databinding.RecyclerRowBinding

// Recycler view icin de adapter lazim. Sonucta bir baglama islemi burada da var.
// layout ile datayi birbirine baglar!!
// recycler view gorunumune baglanip verileri kulllaniciya gostermeyi saglar..
// listeView da old gibi recyclerView'in adapter'ini ayni yerde yazamiyorum Ayri bir sinifta yazmam lazimm.

class LandmarkAdapter(val landmarkList: ArrayList<Landmark>) :
    RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    // burada layout ile baglama islemini yapiyoruz..
    // Yani olusturdugumuz recycler_row u burada bagliyoruz.. Ama viewBinding kullnarak!!
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        // binding'i kullanabilmem icin soyle bir islem yapmam gerekiyor..:,
        // inflate: bunu sisir.
        // from icinde context'e burada @this diyemeyiz. Cunku activity ya da fragment icinde degiliz.
        // Ama bana burda parent veriliyor. Yani recycler view'in nereye baglanaci veriliyor. Context'i oradan alabilirz.
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        // burada benden gorunum isteiyor am aben gorunum degil bir binding olusturdum
        return LandmarkHolder(binding)
    }

    // baglandiktan sonra ne olacakk? Yani hangi text'te hangş veri kullnilacak?
    override fun getItemCount(): Int {
        // hem bunu hem onbindViewHolder yapmak icin bir sekilde mainActivity'deki landöarkListe ulasabilir olmam lazim..
        // Bunun icin class'in constructor'inda bunu veriyoruz.
        return landmarkList.size
    }

    // Bu da kac bundan kac tane olusturacagim:
    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmarkName",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}