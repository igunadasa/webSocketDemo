package com.example.websocketdemo

class Greeting(private var content: String? = null) {
    fun getContent(): String? {
        return content
    }
}