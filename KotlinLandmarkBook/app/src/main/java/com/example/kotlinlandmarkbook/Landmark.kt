package com.example.kotlinlandmarkbook

import java.io.Serializable

// kendi olusturdugum landmark sinifinin serilestirileblir old soyluyorum..
class Landmark(val name: String, val country: String, val image: Int) : Serializable {
}