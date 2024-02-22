package com.mypet.userservice.controller

import com.mypet.userservice.dto.Credentials
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping




@Controller
class ConfigController(
    private val credentials: Credentials
) {
    @GetMapping("/credentials")
    fun showCredentials() = ResponseEntity.ok("${credentials.login} and ${credentials.password}")
}