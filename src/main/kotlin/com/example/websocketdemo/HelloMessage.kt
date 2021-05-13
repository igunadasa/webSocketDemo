package com.example.websocketdemo

class HelloMessage(private var name: String? = null) {

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }
}