import com.github.gradle.node.npm.task.NpmTask

plugins {
  id("com.github.node-gradle.node") version "3.5.0"
  id("base")
}

node {
  version.set("18.12.1")
  download.set(true)
}

val appNpmBuild = tasks.register<NpmTask>("appNpmBuild") {
  dependsOn(tasks.named("npmInstall"))
  args.set(listOf("run", "build"))
}

tasks.named("assemble") {
  dependsOn(appNpmBuild)
}