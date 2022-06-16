package dev.rehema.assesment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class CalculatorActivity : AppCompatActivity() {
    lateinit var tilnum1:TextInputLayout
    lateinit var tilnum2:TextInputLayout
    lateinit var etnum1:EditText
    lateinit var etnum2:EditText
    lateinit var btnsum:Button
    lateinit var btnmin:Button
    lateinit var btnmod:Button
    lateinit var btnmult:Button
    lateinit var tvresult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        tilnum1=findViewById(R.id.tilnum1)
        tilnum2=findViewById(R.id.tilnum2)
        etnum1=findViewById(R.id.etnum1)
        etnum2=findViewById(R.id.etnum2)
        btnmin=findViewById(R.id.btnmin)
        btnmod=findViewById(R.id.btnmod)
        btnmult=findViewById(R.id.btnmult)
        btnsum=findViewById(R.id.btnsum)
        tvresult=findViewById(R.id.tvresult)
        btnsum.setOnClickListener {
            var inputs = obtainInput()
            Add(inputs!!.number1, inputs!!.number2)

       }
        btnmult.setOnClickListener {
            var inputs = obtainInput()
            max(inputs!!.number1, inputs!!.number2)
    }
        btnmin.setOnClickListener {
            var inputs = obtainInput()
            sub(inputs!!.number1, inputs!!.number2)

       }
        btnmod.setOnClickListener {
            var inputs = obtainInput()
           modulus(inputs!!.number1,inputs!!.number2)


       }


        }
    data class MyInputs(var number1: Double, var number2: Double)

    fun obtainInput(): MyInputs?{
      var num1 = etnum1.text.toString()
       var num2 = etnum2.text.toString()
       if (num1.isBlank()){
           tilnum1.error = "Number required"
          return null
       }
       if (num1.isBlank()){
           tilnum2.error = "Number required"
          return null
       }
       return MyInputs(num1.toDouble(), num2.toDouble())
   }
    fun Add(num1:Double, num2:Double){
        var total = num1+num2
       tvresult.text= total.toString()
   }
   fun sub(num1:Double, num2:Double) {
       var total = num1 - num2
        tvresult.text = total.toString()

    }
    fun max(num1:Double, num2:Double) {
       var total = num1 * num2
       tvresult.text = total.toString()
    }
   fun modulus(num1:Double, num2:Double) {
       var total = num1 % num2
       tvresult.text = total.toString()
    }

    }





