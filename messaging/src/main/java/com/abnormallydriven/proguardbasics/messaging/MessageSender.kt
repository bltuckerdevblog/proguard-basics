package com.abnormallydriven.proguardbasics.messaging

import android.util.Log

class MessageSender {

    fun sendMessage(message: Message){
        Log.d("SuperImportant", message.toString())
    }

    fun methodThatWeNeverUse(){
        //this was important once upon a time.
    }

}