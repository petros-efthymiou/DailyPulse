package com.petros.efthymiou.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform