package com.github.logertower.myplugin.services

import com.intellij.openapi.project.Project
import com.github.logertower.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
