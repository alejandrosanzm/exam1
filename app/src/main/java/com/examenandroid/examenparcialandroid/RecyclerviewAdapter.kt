package com.examenandroid.examenparcialandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val context: Context) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    var questionList: List<Question> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_adapter, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return questionList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.question.text = questionList[position].question
        // holder.answer1.text = questionList[position].answers[0]
        // holder.answer2.text = questionList[position].answers[1]
        // holder.answer3.text = questionList[position].answers[2]
        holder.correctAnswer.text = questionList[position].correct_answer
    }

    fun setMovieListItems(questionList: List<Question>) {
        this.questionList = questionList
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val question: TextView = itemView!!.findViewById(R.id.textView4)
        val answer1: TextView = itemView!!.findViewById(R.id.textView5)
        val answer2: TextView = itemView!!.findViewById(R.id.textView6)
        val answer3: TextView = itemView!!.findViewById(R.id.textView7)
        val correctAnswer: TextView = itemView!!.findViewById(R.id.textView8)
    }
}
