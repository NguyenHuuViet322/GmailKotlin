package com.example.mailkotlin

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlin.random.Random



class MailAdapter(private  val context : Activity, private val mail:Array<Mail>) : ArrayAdapter<Mail>(context, R.layout.list_item, mail) {
    override fun getView(position: Int, view: View?, parent: ViewGroup) :View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_item, null, true)

        val name = rowView.findViewById(R.id.name) as TextView
        val desc = rowView.findViewById(R.id.desc) as TextView
        val status = rowView.findViewById(R.id.status) as ImageButton
        val time = rowView.findViewById(R.id.time) as TextView
        val avatar = rowView.findViewById(R.id.avatar) as ImageView
        val avatarText = rowView.findViewById(R.id.avatartext) as TextView
        val avatarInt = Random.nextInt(0,5);

        if (avatarInt%5 == 1) {
            avatar.setImageDrawable(ContextCompat.getDrawable( getContext() ,R.drawable.baseline_circle_24))
        }
        if (avatarInt%5 == 0) {
            avatar.setImageDrawable(ContextCompat.getDrawable( getContext() ,R.drawable.baseline_circle_24_1))
        }
        if (avatarInt%5 == 2) {
            avatar.setImageDrawable(ContextCompat.getDrawable( getContext() ,R.drawable.baseline_circle_24_2))
        }
        if (avatarInt%5 == 3) {
            avatar.setImageDrawable(ContextCompat.getDrawable( getContext() ,R.drawable.baseline_circle_24_3))
        }
        if (avatarInt%5 == 4) {
            avatar.setImageDrawable(ContextCompat.getDrawable( getContext() ,R.drawable.baseline_circle_24_4))
        }

        name.text = mail[position].name
        desc.text = mail[position].desc
        time.text = mail[position].time
        avatarText.text = mail[position].name[0].toString().uppercase()

        return rowView
    }
}