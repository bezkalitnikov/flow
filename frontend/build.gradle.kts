import com.github.gradle.node.npm.task.NpmTask

plugins {
  id("com.github.node-gradle.node") version "3.5.0"
  id("base")
}

node {
  version.set("18.12.1")
  download.set(true)
}

val npmBuild = tasks.register<NpmTask>("npmBuild") {
  dependsOn(tasks.named("npmInstall"))
  args.set(listOf("run", "build"))
}

tasks.register<NpmTask>("npmDev") {
  dependsOn(npmBuild)
  args.set(listOf("run", "dev"))
}

tasks.named("assemble") {
  dependsOn(npmBuild)
}