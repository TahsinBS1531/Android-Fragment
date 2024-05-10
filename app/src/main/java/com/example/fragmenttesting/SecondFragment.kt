package com.example.fragmenttesting

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate()-2")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        println("onCreateView()-2")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("onAttach()-2")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("onViewCreated()-2")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("onViewStateRestored()-2")
    }

    override fun onStart() {
        super.onStart()
        println("onStart()-2")
    }

    override fun onResume() {
        super.onResume()
        println("onResume()-2")
    }

    override fun onPause() {
        super.onPause()
        println("onPause()-2")
    }

    override fun onStop() {
        super.onStop()
        println("onStop()-2")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("onSaveInstanceState()-2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("onDestroyView()-2")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy()-2")
    }

}