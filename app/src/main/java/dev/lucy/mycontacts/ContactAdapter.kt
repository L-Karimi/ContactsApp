package dev.lucy.mycontacts

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter {

}

class contactViewHolder(itemview: View) :
    RecyclerView.ViewHolder(itemview) {
    var ivContact = itemview.findViewById<ImageView>(R.id.ivContact)
    var tvName = itemview.findViewById<TextView>(R.id.tvName)
    var tvPhonNumber = itemview.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvLocation = itemview.findViewById<TextView>(R.id.tvLocation)
    var tvEmail = itemview.findViewById<TextView>(R.id.tvEmail)

}