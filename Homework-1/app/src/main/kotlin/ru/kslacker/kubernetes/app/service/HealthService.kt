package ru.kslacker.kubernetes.app.service

import org.springframework.stereotype.Service
import ru.kslacker.kubernetes.app.model.HealthResponse
import ru.kslacker.kubernetes.app.model.HealthStatus

@Service
class HealthService {
    fun getHealth(): HealthResponse {
        return HealthResponse(status = HealthStatus.OK)
    }
}