package org.akazakov.security.keycloak

import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/test/")
class TestController {
    @GetMapping("user")
    @PreAuthorize("hasRole('USER')")
    fun getUserInfo(): ResponseEntity<String> = ResponseEntity.ok("User info")

    @GetMapping("admin")
    @PreAuthorize("hasRole('ADMIN')")
    fun getAdminInfo(): ResponseEntity<String> = ResponseEntity.ok("Admin info")
}