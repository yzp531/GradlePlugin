package com.example.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
class CustomPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('CustomPluginTask') {
            doLast {
                println "hello1.5"
            }
        }
    }
}
