package ru.kslacker.kubernetes.app.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.kslacker.kubernetes.app.model.HealthResponse
import ru.kslacker.kubernetes.app.service.HealthService

@RestController
@RequestMapping("/health")
class HealthController(
    val healthService: HealthService,
) {
    @GetMapping
    fun getHealth(): HealthResponse {
        return healthService.getHealth()
    }
}
