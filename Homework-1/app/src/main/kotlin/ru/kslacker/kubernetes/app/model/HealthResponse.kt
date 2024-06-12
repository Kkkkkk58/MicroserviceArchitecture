package ru.kslacker.kubernetes.app.model

data class HealthResponse(
    val status: HealthStatus,
)

enum class HealthStatus {
    OK
}