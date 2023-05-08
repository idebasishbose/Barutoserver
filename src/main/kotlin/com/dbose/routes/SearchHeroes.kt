package com.dbose.routes

import com.dbose.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {
    val heroRepository: HeroRepository by inject()

    get("/boruto/heroes/search") {
        val query = call.request.queryParameters["query"]
        val startTime = System.currentTimeMillis()

        val apiResponse = heroRepository.searchHeroes(query = query)

        val endTime = System.currentTimeMillis()
        val timeElapsed = endTime - startTime
        println("Time complexity: $timeElapsed ms")

        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }

}