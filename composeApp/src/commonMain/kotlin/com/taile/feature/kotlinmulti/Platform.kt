package com.taile.feature.kotlinmulti

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform