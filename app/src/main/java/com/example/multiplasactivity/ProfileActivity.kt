package com.example.multiplasactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiplasactivity.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener {
            //utiliza-se o finish, pq se usar o mesmo metodo da primeira activity
            //vai ficar criando varias activitys e o botao de voltar do dipositivo
            //vai ficar voltando entre as activitys até conseguir sair da aplicação
            finish()
        }
    }
}