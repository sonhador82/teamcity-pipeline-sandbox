package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object Sandbox1 : BuildType({
    name = "Sandbox1"

    vcs {
        root(DslContext.settingsRoot)
    }
    steps {
        script {
            scriptContent = "echo hello"
        }
    }
})
