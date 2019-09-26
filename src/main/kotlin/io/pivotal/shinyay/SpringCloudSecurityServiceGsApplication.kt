package io.pivotal.shinyay

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.jwt.Jwt
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class SpringCloudSecurityServiceGsApplication(val logger: Logger) {
//	val logger: Logger = LoggerFactory.getLogger(this::class.java.name)

	@GetMapping("/resource")
	fun resource(@AuthenticationPrincipal jwt: Jwt): String {
		logger.trace("***** JWT HEADERS: ${jwt.headers}")
		logger.trace("***** JWT CLAIMS: ${jwt.claims}")
		logger.trace("***** JWT TOKEN: ${jwt.tokenValue}")

		return "Resource accessed by: ${jwt.claims["user_name"]} (with subjectId: ${jwt.subject})"
	}
}

fun main(args: Array<String>) {
	runApplication<SpringCloudSecurityServiceGsApplication>(*args)
}
