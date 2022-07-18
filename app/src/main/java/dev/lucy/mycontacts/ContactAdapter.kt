package dev.lucy.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.lucy.mycontacts.databinding.ContactListItemBinding

class ContactAdapter(var contactList: List<Contact>) :
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
//        return contactViewHolder
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvEmail.text = currentContact.email
        holder.binding.tvPhoneNumber.text = currentContact.phoneNumber
        holder.binding.tvLocation.text = currentContact.address
        Picasso.get()
            .load(currentContact.image).resize(250, 250)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .centerCrop()
            .into(holder.binding.imgContact)
        var context = holder.itemView.context
        holder.binding.imgContact.setOnClickListener {
            Toast.makeText(
                context,
                "You have clicked on ${currentContact.name} the image",
                Toast.LENGTH_SHORT
            ).show()

        }
        holder.binding.cvContact.setOnClickListener {
            val intent = Intent(context, ViewContactActivity::class.java)
            intent.putExtra("Email", currentContact.email)
            intent.putExtra("Name", currentContact.name)
            intent.putExtra("Address", currentContact.address)
            intent.putExtra("Image", currentContact.image)
            intent.putExtra("Number", currentContact.phoneNumber)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}

class ContactViewHolder(var binding: ContactListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

}

