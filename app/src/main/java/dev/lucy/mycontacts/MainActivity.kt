package dev.lucy.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.lucy.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        DisplayContacts()
    }

    fun DisplayContacts() {
        val contact1 = Contact("Lucy", "0797916750", "luciahkei101@gmail.com", "korongo road", "")
        val contact2 = Contact("Dave", "0797916750", "luciahkei101@gmail.com", "korongo road", "")
        val contact3 = Contact("Davis", "0797916750", "luciahkei101@gmail.com", "korongo road", "")
        val contact4 = Contact("Preston", "0797916750", "luciahkei101@gmail.com", "korongo road", "")
        val contact5 = Contact("Kirinyet", "0797916750", "luciahkei101@gmail.com", "korongo road", "")
        val contact7 = Contact("Ian", "0797916750", "luciahkei101@gmail.com", "korongo road", "")
        val contact8 = Contact("Lucy", "0797916750", "luciahkei101@gmail.com", "korongo road", "")
        val contact9 = Contact("Lucy", "0797916750", "luciahkei101@gmail.com", "korongo road", "")


        var contactList = listOf(contact1, contact2, contact3, contact4, contact5, contact7,contact8,contact9)
        var contactAdapt = ContactAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapt
    }
}