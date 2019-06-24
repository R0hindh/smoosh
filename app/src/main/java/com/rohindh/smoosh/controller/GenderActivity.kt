package com.rohindh.smoosh.controller

import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rohindh.smoosh.R
import com.rohindh.smoosh.model.Player
import com.rohindh.smoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_gender.*

class GenderActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!

    }



    fun onMensClicked(view: View){
        womensBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        mensBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "womens"
    }

    fun onCoedClicked(view: View){
        womensBtn.isChecked=false
        mensBtn.isChecked = false
        player.league = "co-ed"
    }

     fun leagueNextClicked(view: View){
         if (player.league !="")
         {
             val nextleague = Intent(this, SkillActivity::class.java)
             nextleague.putExtra(EXTRA_PLAYER,player)
             startActivity(nextleague)
         }else{
             Toast.makeText(this,"please select a league",Toast.LENGTH_SHORT).show()
         }
     }
}
