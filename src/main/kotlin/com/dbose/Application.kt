package com.dbose

import io.ktor.server.application.*
import com.dbose.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureMonitoring()
    configureSerialization()
    configureRouting()
    configureDefaultHeaders()
}
