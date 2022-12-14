package com.farhanfarkaann.finalprojectskripsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user : MutableMap<String, Any> = HashMap()
        user["first"] = "SHahzad"
        user["last"] = "Kocak"
        user["born"] = 1994

        FirebaseFirestore.getInstance().collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("TAG", "DocumentSnapshot add with ID : " + documentReference.id)
            }
            .addOnFailureListener{e -> Log.w("TAG","error adding document", e)}
    }
}