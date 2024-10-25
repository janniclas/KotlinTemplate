# Kotlin Project Template

This project works as a template to set up a new Kotlin library project including testing, documentation, logging,
versioning, and release configuration.
The project is structured as a multi-module build (in this example the modules are `core` and `model`), with a dedicated
build module (`buildSrc`). `buildSrc` contains two conventions plugins `kotlin-conventions` and `publish-conventions`.
They provide common functionality for Kotlin development (formatting, testing, documentation) and configurations for
publishing the code to maven central.

## Placeholders

The template repository contains a number of placeholders, which need to be replaced by the user.

Top level `build.gradle.kts`

* `rootProject.name = "YOUR_PROJECT_NAME"`

`LICENSE.md`

* `Copyright (c) {{INSERT_YOUR_COPYRIGHT}}`

`buildSrc/src/main/kotlin/publish-conventions.gradle.kts`

* configuration for the publication needs to be customized