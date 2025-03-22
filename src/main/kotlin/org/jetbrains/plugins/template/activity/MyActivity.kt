package org.jetbrains.plugins.template.activity

import com.intellij.openapi.startup.ProjectActivity
import com.intellij.openapi.project.Project
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.diagnostic.thisLogger
import org.jetbrains.plugins.template.services.MyProjectService

class MyActivity : ProjectActivity {

    override suspend fun execute(project: Project) {
        thisLogger().info("Placeholder warning message for MyActivity")
        thisLogger().info("Placeholder warning message for MyActivity")
        thisLogger().info("Placeholder warning message for MyActivity")
        thisLogger().info("Placeholder warning message for MyActivity")
        thisLogger().info("Placeholder warning message for MyActivity")
        thisLogger().info("Placeholder warning message for MyActivity")
        thisLogger().info("Placeholder warning message for MyActivity")
        thisLogger().info("Placeholder warning message for MyActivity")

        val service = project.getService(MyProjectService::class.java)
        val numero = service.getRandomNumber()

        thisLogger().info("🔢 MyProjectService ha restituito il numero: $numero")
    }
}
