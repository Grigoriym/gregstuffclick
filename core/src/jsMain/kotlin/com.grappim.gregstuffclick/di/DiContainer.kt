package com.grappim.gregstuffclick.di

object DiContainer {
    private val dependencies = mutableMapOf<String, Any>()

    fun <T : Any> register(key: String, instance: T) {
        dependencies[key] = instance
    }

    fun <T : Any> resolve(key: String): T {
        return dependencies[key] as? T ?: error("No dependency found for key: $key")
    }
}
