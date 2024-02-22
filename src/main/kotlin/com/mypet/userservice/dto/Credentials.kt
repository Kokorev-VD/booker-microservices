package com.mypet.userservice.dto

import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties("credentials")
class Credentials(
    val login: String,
    val password: String,
)
