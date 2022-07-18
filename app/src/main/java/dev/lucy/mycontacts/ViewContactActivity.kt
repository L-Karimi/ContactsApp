package dev.lucy.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lucy.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras=intent.extras
        var name=extras?.getString("Name","")
        var Email=extras?.getString("Email","")
        var Address=extras?.getString("Address","")
        var Number=extras?.getString("Number","")
        binding.tvAdress.text=Address
        binding.tvNamee.text=name
        binding.tvPhone.text=Number
        binding.tvEmaill.text=Email


    }
}