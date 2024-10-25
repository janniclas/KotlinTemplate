import org.gradle.kotlin.dsl.*

plugins {
    `maven-publish`
    signing
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            pom {
                name = project.name
                description = ""
                url = ""
                licenses {
                    license {
                        name = ""
                        url = ""
                    }
                }
                developers {
                    developer {
                        name = ""
                        email = ""
                    }
                }
                scm {
                    connection = "scm:git:git@"
                    developerConnection = "scm:git:ssh://"
                    url = ""
                }
            }
            groupId = ""
            artifactId = project.name
            from(components["java"])
        }
    }
    repositories {
        // publication target
        maven {
            name = "mavenCentral"
            val releasesRepoUrl =
                "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
            val snapshotsRepoUrl = "https://s01.oss.sonatype.org/content/repositories/snapshots/"
            url =
                uri(
                    if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl
                    else releasesRepoUrl
                )
            // credentials are assigned from project variables with the naming schema
            // repositoryNameUsername, repositoryNamePassword. For this example you need to define
            // mavenCentralUsername and mavenCentralPassword
            credentials(PasswordCredentials::class)
        }
    }
}

signing {
    val signingKey: String? by project
    val signingPassword: String? by project
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications["maven"])
}
