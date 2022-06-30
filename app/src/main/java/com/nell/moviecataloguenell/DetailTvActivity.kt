package com.nell.moviecataloguenell

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_tv.*

class DetailTvActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    var tv: Tv? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tv)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        tv = intent.getParcelableExtra(EXTRA_DATA)

        tv_name.text = tv?.name
        overview.text = tv?.overview
        popularity.text = tv?.popularity
        original_language.text = tv?.original_language
        vote.text = tv?.vote
        tv_first_air_date.text = tv?.first_air_date
        Glide.with(img_poster).load(IMAGE_BASE + tv!!.poster).into(img_poster)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}