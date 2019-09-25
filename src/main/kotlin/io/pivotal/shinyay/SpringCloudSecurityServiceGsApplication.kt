package io.pivotal.shinyay

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudSecurityServiceGsApplication(val logger: Logger) {
//	val logger: Logger = LoggerFactory.getLogger(this::class.java.name)
}

fun main(args: Array<String>) {
	runApplication<SpringCloudSecurityServiceGsApplication>(*args)
}
