package org.akazakov.security.keycloak

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringSecurityKeycloakApplication

fun main(args: Array<String>) {
	runApplication<SpringSecurityKeycloakApplication>(*args)
}
