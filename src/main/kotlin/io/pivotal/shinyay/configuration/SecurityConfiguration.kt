package io.pivotal.shinyay.configuration

import org.springframework.context.annotation.Bean
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

class SecurityConfiguration {

    @Bean
    fun securityFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain {
        http
                .authorizeExchange()
                .pathMatchers("/resources").hasAuthority("SCOPE_resource.read")
                .anyExchange().authenticated()
                .and()
                .oauth2ResourceServer().jwt()

        return http.build()
    }
}