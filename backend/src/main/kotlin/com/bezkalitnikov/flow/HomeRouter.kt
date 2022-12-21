package com.bezkalitnikov.flow

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import org.springframework.web.reactive.function.server.coRouter

@Configuration(proxyBeanMethods = false)
class HomeRouter {
  @Bean
  fun route() = coRouter {
    GET("/home") { ok().bodyValueAndAwait("ok") }
  }
}