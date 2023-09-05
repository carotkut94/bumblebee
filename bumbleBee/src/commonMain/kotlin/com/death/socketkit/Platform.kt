package com.death.socketkit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform