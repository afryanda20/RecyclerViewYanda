package com.example.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.gundala,
                nameSuperhero = "Gundala",
                descSuperhero = "Super hero Indonesia"
            ),
            Superhero(
                R.drawable.batman,
                nameSuperhero = "Batman",
                descSuperhero = "Batman Super hero"
            ),
            Superhero(
                R.drawable.deadpool,
                nameSuperhero = "Deadpool",
                descSuperhero = "Deadpool super hero"
            ),
            Superhero(
                R.drawable.supermann,
                nameSuperhero = "Superman",
                descSuperhero = "Superman Super hero"
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "Hulk Super hero"
            ),
            Superhero(
                R.drawable.heroindo,
                nameSuperhero = "Hero Indonesia",
                descSuperhero = "Indonesia Super hero"
            ),
            Superhero(
                R.drawable.batman,
                nameSuperhero = "Batman",
                descSuperhero = "Batman Super hero"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superherolist){
            val intent = Intent ( this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}