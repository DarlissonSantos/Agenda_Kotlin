package br.com.alura.agenda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.ArrayAdapter
import android.widget.Button
import android.content.Intent




class ListaAlunosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)

        val alunos = arrayOf("Daniel", "Ronaldo", "Jeferson", "Felipe")
        val listaAlunos = findViewById<View>(R.id.lista_alunos) as ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, alunos)
        listaAlunos.adapter = adapter

        val novoAluno = findViewById<View>(R.id.novo_aluno) as Button
        novoAluno.setOnClickListener {
            val intent = Intent(this@ListaAlunosActivity, FormularioActivity::class.java)
            startActivity(intent)
        }
    }
}
