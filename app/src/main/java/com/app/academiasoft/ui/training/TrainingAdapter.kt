package com.app.academiasoft.ui.training

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.academiasoft.R
import kotlinx.android.synthetic.main.item_list.view.*

class TrainingAdapter(
    private val travels: List<Training>,
) : RecyclerView.Adapter<TrainingAdapter.TrainingViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TrainingViewHolder =
        TrainingViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_list, p0, false))

    override fun onBindViewHolder(p0: TrainingViewHolder, p1: Int) {
        p0.bind(travels[0])
    }

    override fun getItemCount() = 15

    inner class TrainingViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(training: Training) {
            // view.tvName.text = training.name
            // view.tvDescription.text = training.description
        }
    }
}

data class Training(
    val id: Long? = null,
    val name: String? = null,
    val description: String? = null
)