package com.bezkalitnikov.flow

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok

@Configuration(proxyBeanMethods = false)
@RequestMapping("/api/v1/")
class IndexRouter {
  @Bean
  fun indexRoute(): RouterFunction<ServerResponse> {
    return RouterFunctions.route(GET("/")) { ok().contentType(MediaType.APPLICATION_JSON).bodyValue("{status:ok}") }
  }
}