package com.example.dars_27_fragment_example

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_blank.*

class BlankFragment : Fragment() {
    private var listener: BlankInterface? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listener?.let { it.onAction() }
        button.setOnClickListener { listener?.onAction() }

        val builder = AlertDialog.Builder(context)
//        with(builder){
//            setTitle("")
//            setPositiveButton()
//        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BlankInterface) {
            listener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
        //todo
    }

    interface BlankInterface {
        fun onAction()
    }
}