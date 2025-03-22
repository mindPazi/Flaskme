package com.github.mindpazi.flaskme.services

import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.openapi.diagnostic.Logger

@Service(Service.Level.PROJECT)
class MyProjectService(private val project: Project) {
    private val LOG = Logger.getInstance(MyProjectService::class.java)

    init {
        LOG.info("🔧 MyProjectService initialized for ${project.name}")
    }

    fun getRandomNumber(): Int = (0..100).random()
}
