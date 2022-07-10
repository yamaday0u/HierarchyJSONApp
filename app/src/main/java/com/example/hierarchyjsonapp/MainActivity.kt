package com.example.hierarchyjsonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    private val jsonData= "{\"name\": \"太郎\",\"age\": 27,\"address\":{\"prefecture\":\"東京都\",\"city\":\"千代田区\",\"address_line1\":\"飯田橋\",\"address_line2\":\"1-1-1\"}}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var profile = Gson().fromJson(jsonData, Profile::class.java)

        findViewById<TextView>(R.id.name).text = "名前："+profile.name
        findViewById<TextView>(R.id.age).text = "年齢："+profile.age.toString()
        findViewById<TextView>(R.id.address).text = makeAddress(profile.address)
    }

    private fun makeAddress(address: Address): String {
        return "住所：" + address.prefecture + address.city + address.addressLine1 + address.addressLine2
    }
}