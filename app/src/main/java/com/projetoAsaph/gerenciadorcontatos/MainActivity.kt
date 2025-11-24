package com.projetoAsaph.gerenciadorcontatos

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate // <--- Importação nova necessária
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.projetoAsaph.gerenciadorcontatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val contacts = listOf("Asaph Lindo", "Sophie Rodriguez", "Arthur Ataide")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerContacts.layoutManager = LinearLayoutManager(this)
        binding.recyclerContacts.adapter = ContactAdapter(this, contacts)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_add ->
                Toast.makeText(this, "Abrindo formulário para adicionar contato...", Toast.LENGTH_SHORT).show()

            R.id.menu_about ->
                Toast.makeText(this, "App criado pelo aluno mais lindo, Asaph Gabriel, como atividade prática de menus no Android.", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}