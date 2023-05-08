package com.dbose.plugins

import com.dbose.routes.getAllHeroes
import com.dbose.routes.root
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        staticResources("/images", "images")
    }
}
