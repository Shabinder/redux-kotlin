plugins {
    id("convention.common")
    id("org.jetbrains.dokka")
    id("io.github.gradle-nexus.publish-plugin")
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl by uri("https://oss.sonatype.org/service/local/")
            snapshotRepositoryUrl by uri("https://oss.sonatype.org/content/repositories/snapshots/")
        }
    }
}
