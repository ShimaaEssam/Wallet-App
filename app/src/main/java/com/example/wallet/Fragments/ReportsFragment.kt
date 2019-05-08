package com.example.wallet.Fragments

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.wallet.R
import com.example.wallet.adapter.ReportAdapter
import com.example.wallet.model.Report

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ReportsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ReportsFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ReportsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    lateinit var  recyclerView: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var reportAdapter: ReportAdapter
    lateinit var reports:List<Report>

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val rootView= inflater.inflate(R.layout.fragment_reports, container, false)
        reports= listOf(Report("01123456789","200 جنيه"," جارى التحويل","11/4/2019","10:11"))
//        reports= listOf(Report("01123456789","200 جنيه"," تم التحويل","11/4/2019","10:11"))
//        reports= listOf(Report("01123456789","200 جنيه"," فشل التحويل","11/4/2019","10:11"))
//        reports= listOf(Report("01123456789","200 جنيه"," جارى التحويل","11/4/2019","10:11"))

        recyclerView=rootView.findViewById(R.id.recyclerreports)
        recyclerView.setHasFixedSize(true)
        layoutManager= LinearLayoutManager(context)
        recyclerView.layoutManager=layoutManager
        reportAdapter = ReportAdapter(reports, this!!.context!!)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        recyclerView.setLayoutManager(layoutManager)
        recyclerView.setAdapter(reportAdapter)

        return rootView
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ReportsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ReportsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
