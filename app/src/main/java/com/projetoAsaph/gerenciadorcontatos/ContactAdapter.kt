package com.projetoAsaph.gerenciadorcontatos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu // Para o botão de clique simples
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(
    private val context: Context,
    private val contacts: List<String>
) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    // Cria o visual de cada item da lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contactName = contacts[position]
        holder.name.text = contactName

        holder.btnOptions.setOnClickListener { view ->
            val popup = PopupMenu(context, view)
            popup.menuInflater.inflate(R.menu.menu_popup, popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.popup_call -> showToast("Ligando para $contactName...")
                    R.id.popup_sms -> showToast("Enviando SMS para $contactName...")
                    R.id.popup_email -> showToast("Enviando Email para $contactName...")
                }
                true
            }
            popup.show()
        }


        holder.itemView.setOnCreateContextMenuListener { menu, _, _ ->
            val inflater = (context as android.app.Activity).menuInflater
            inflater.inflate(R.menu.menu_context, menu)
            menu.setHeaderTitle("Ações para $contactName")

            // Listener para os cliques do menu de contexto
            for (i in 0 until menu.size()) {
                menu.getItem(i).setOnMenuItemClickListener { item ->
                    when (item.itemId) {
                        R.id.context_edit -> showToast("Editando $contactName...")
                        R.id.context_delete -> showToast("Deletando $contactName...")
                        R.id.context_share -> showToast("Compartilhando $contactName...")
                    }
                    true
                }
            }
        }
    }

    override fun getItemCount(): Int = contacts.size

    private fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    // ViewHolder ajustado para os SEUS IDs (txtName e btnOptions)
    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.txtName)
        val btnOptions: ImageView = itemView.findViewById(R.id.btnOptions)
    }
}