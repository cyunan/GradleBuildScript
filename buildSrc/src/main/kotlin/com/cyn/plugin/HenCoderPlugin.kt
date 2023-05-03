package com.cyn.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


class HenCoderPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create("hencode", HenCoderExtension::class.java)
        project.afterEvaluate {
            println("Hello ${extension.name}")
        }
    }
}