package com.example.testingrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// const val   API_KEY
const val BASE_URL = "https://api.publicapis.org/"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val response = retrofit.create(APIService::class.java)
        val call = response.getApiList()
        call.enqueue(object : Callback<ApisResult> {
            override fun onResponse(call: Call<ApisResult>, response: Response<ApisResult>) {

                if (!response.isSuccessful) {
                    Toast.makeText(this@MainActivity, response.code().toString(), Toast.LENGTH_SHORT).show()


                }
                val conteudo = response.body()
                val apiList: List<Entries> = conteudo?.entries?.clone() as List<Entries>
                apiList.forEach { it ->  Log.d("Response", "${it}")}

            }
            override fun onFailure(call: Call<ApisResult>, t: Throwable) {

                t.message?.let { Log.d("MSG", it) }
            }

        })

    }
}




