package com.mufc.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
var prvBroj=0
var vtorBroj=0
var funkcija="nema"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //kalkulacija fun
        fun rezz(eden:Double,dva:Double):Double {
            var ask=0.0
            if (funkcija=="plus"){
                ask = dva+eden
            }
            if (funkcija=="minus"){
                ask = dva-eden
            }
            if (funkcija=="po"){
                ask = dva*eden
            }
            if (funkcija=="deleno"){
                ask = dva/eden
            }
            prvBroj=0
            vtorBroj=0
            funkcija="nema"
            return ask
        }
//broevi

        button1.setOnClickListener{
            if(prvBroj==0){
                prvBroj=1

            }
            else {
               var prv= prvBroj.toString()
                prv = prv + "1"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }

        button2.setOnClickListener{
            if(prvBroj==0){
                prvBroj=2

            }
            else {
                var prv= prvBroj.toString()
                prv = prv + "2"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }
        button3.setOnClickListener{
            if(prvBroj==0){
                prvBroj=3

            }
            else {
                var prv= prvBroj.toString()
                prv = prv + "3"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }

        button4.setOnClickListener{
            if(prvBroj==0){
                prvBroj=4

            }
            else {
                var prv= prvBroj.toString()
                prv = prv + "4"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }
        button5.setOnClickListener{
            if(prvBroj==0){
                prvBroj=5

            }
            else {
                var prv= prvBroj.toString()
                prv = prv + "5"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }

        button6.setOnClickListener{
            if(prvBroj==0){
                prvBroj=6

            }
            else {
                var prv= prvBroj.toString()
                prv = prv + "6"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }

        button7.setOnClickListener{
            if(prvBroj==0){
                prvBroj=7

            }
            else {
                var prv= prvBroj.toString()
                prv = prv + "7"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }

        button8.setOnClickListener{
            if(prvBroj==0){
                prvBroj=8

            }
            else {
                var prv= prvBroj.toString()
                prv = prv + "8"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }

        button9.setOnClickListener{
            if(prvBroj==0){
                prvBroj=9

            }
            else {
                var prv= prvBroj.toString()
                prv = prv + "9"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }

        button10.setOnClickListener{
            if(prvBroj==0){
                prvBroj=0

            }
            else {
                var prv= prvBroj.toString()
                prv = prv + "0"
                prvBroj=prv.toInt()
            }
            rezultat.text=prvBroj.toString()
        }

        //operacii
    plus.setOnClickListener {
        if (vtorBroj==0){
    vtorBroj=prvBroj
        prvBroj=0
        funkcija="plus"}
        else{
           vtorBroj=vtorBroj+prvBroj
            prvBroj=0
            rezultat.text=vtorBroj.toString()
        }

    }
        minus.setOnClickListener {
            if (vtorBroj==0) {
                vtorBroj = prvBroj
                prvBroj = 0
                funkcija = "minus"
            }
            else{
                vtorBroj=vtorBroj-prvBroj
                prvBroj=0
                rezultat.text=vtorBroj.toString()
            }
        }
        po.setOnClickListener {
            if (vtorBroj==0) {
            vtorBroj=prvBroj
            prvBroj=0
            funkcija="po"
            }
            else{
                vtorBroj=vtorBroj*prvBroj
                prvBroj=0
                rezultat.text=vtorBroj.toString()
            }
        }
        deleno.setOnClickListener {
            if (vtorBroj == 0) {
                vtorBroj = prvBroj
                prvBroj = 0
                funkcija = "deleno"
            } else {
                vtorBroj=vtorBroj/prvBroj
                prvBroj=0
                rezultat.text=vtorBroj.toString()
            }
        }

        ednakvo.setOnClickListener {
           val eden=prvBroj.toDouble()
            val dva =vtorBroj.toDouble()

             rezultat.text=rezz(eden,dva).toString()

        }


    }
}
