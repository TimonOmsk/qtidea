package com.github.timonomsk.qtidea.services

import com.intellij.openapi.project.Project
import com.github.timonomsk.qtidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
