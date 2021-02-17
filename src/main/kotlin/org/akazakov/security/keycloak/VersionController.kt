package org.akazakov.security.keycloak

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/public/version")
class VersionController {
    @GetMapping
    fun getVersion(): String = "v1"
}