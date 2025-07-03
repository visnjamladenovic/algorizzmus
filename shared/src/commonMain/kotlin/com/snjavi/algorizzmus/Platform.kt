package com.snjavi.algorizzmus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform