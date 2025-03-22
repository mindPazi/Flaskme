package com.github.mindpazi.flaskme.services

import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.diagnostic.thisLogger

@Service(Service.Level.PROJECT)
class MyProjectService(private val project: Project) {

    init {
        thisLogger().info("Placeholder warning message for MyProjectService")
        thisLogger().info("Placeholder warning message for MyProjectService")
        thisLogger().info("Placeholder warning message for MyProjectService")
        thisLogger().info("Placeholder warning message for MyProjectService")
        thisLogger().info("Placeholder warning message for MyProjectService")
        thisLogger().info("Placeholder warning message for MyProjectService")
        thisLogger().info("Placeholder warning message for MyProjectService")
        thisLogger().info("Placeholder warning message for MyProjectService")

    }

    fun getRandomNumber(): Int = (0..100).random()
}
