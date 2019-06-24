package com.rohindh.smoosh.controller

import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rohindh.smoosh.utilities.EXTRA_DATA
import com.rohindh.smoosh.R
import kotlinx.android.synthetic.main.activity_gender.*

class GenderActivity : BaseActivity() {
    var selectedleague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)
    }
    fun onMensClicked(view: View){
        womensBtn.isChecked = false
        coedBtn.isChecked = false
        selectedleague = "mens"
    }
    fun onWomensClicked(view: View) {
        mensBtn.isChecked = false
        coedBtn.isChecked = false
        selectedleague = "womens"
    }
    fun onCoedClicked(view: View){
        womensBtn.isChecked=false
        mensBtn.isChecked = false
        selectedleague = "co-ed"
    }
     fun leagueNextClicked(view: View){
         if (selectedleague !="")
         {
             val nextleague = Intent(this, SkillActivity::class.java)
             nextleague.putExtra(EXTRA_DATA,selectedleague)
             startActivity(nextleague)
         }else{
             Toast.makeText(this,"please select a league",Toast.LENGTH_SHORT).show()
         }
     }
}
