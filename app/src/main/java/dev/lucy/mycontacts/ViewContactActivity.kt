package dev.lucy.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
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
        var Image=extras?.getString("Image","")

        binding.tvAdress.text=Address
        binding.tvNamee.text=name
        binding.tvPhone.text=Number
        binding.tvEmaill.text=Email
        Picasso.get()
            .load(Image).resize(350, 350)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .centerCrop()
            .into(binding.ivContact)


    }
}