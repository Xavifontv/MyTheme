package com.github.xavifontv.mytheme.services

import com.intellij.openapi.project.Project
import com.github.xavifontv.mytheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
