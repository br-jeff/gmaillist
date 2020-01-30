package learm.com.gmaillist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.email_item.view.*
import learm.com.gmaillist.Data.Email
import learm.com.gmaillist.Data.fakeEmails

class EmailAdapter(val emails : MutableList<Email>) : RecyclerView.Adapter <EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(email : Email) {
            with(email) {
                itemView.txt_date.text = user.first().toString()
                itemView.txt_icon
                itemView.txt_preview
                itemView.txt_subject
                itemView.image_star
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent , false)
    }

    override fun getItemCount(): Int {

        return fakeEmails().size
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
       fun bind(email: Email) {


       }
    }
}