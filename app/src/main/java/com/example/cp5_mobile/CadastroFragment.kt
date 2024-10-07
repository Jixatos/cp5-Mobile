package com.example.cp5_mobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CadastroFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CadastroFragment : Fragment() {
    private lateinit var btnEnviar: Button
    private lateinit var txtResultado: TextView

    private var nome:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nomeAluno = arguments?.getString("nomeAluno")
    }
}