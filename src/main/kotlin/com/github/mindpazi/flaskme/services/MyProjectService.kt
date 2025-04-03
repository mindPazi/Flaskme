package com.github.mindpazi.flaskme.services

import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.diagnostic.thisLogger
import com.jetbrains.python.psi.PyElementGenerator
import com.jetbrains.python.psi.LanguageLevel



@Service(Service.Level.PROJECT)
class MyProjectService(private val project: Project) {

    init {
        val generator = PyElementGenerator.getInstance(project)
        val pyExpr = generator.createExpressionFromText(LanguageLevel.getDefault(), "42 + 1")
        thisLogger().info("Generated Python expression: ${pyExpr.text}")
    }

    fun getRandomNumber(): Int = (0..100).random()
}
