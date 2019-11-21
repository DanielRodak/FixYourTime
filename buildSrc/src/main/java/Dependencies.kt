object Versions {
    object Kotlin {
        const val kotlin = "1.3.60"
    }

    object Android {
        const val build_tools_version = "29.0.1"
        const val compile_sdk_version = 29
        const val min_sdk_version = 23
        const val target_sdk_version = 29
        const val android_gradle_plugin = "3.6.0-beta01"
    }

    object Support {
        const val androidx = "1.0.2"
        const val constraint_layout = "1.1.3"
    }

    object JUnit {
        const val junit = "4.12"
    }

    object Instrumentation {
        const val androidx_junit = "1.1.1"
        const val androidx_espresso = "3.2.0"
    }

    object RxJava {
        const val rxJava2 = "2.2.10"
        const val rxJava2Android = "2.1.1"
        const val rxBinding = "2.1.1"
    }
}

object Dependencies {
    object Project {
        const val android_gradle_plugin =
            "com.android.tools.build:gradle:${Versions.Android.android_gradle_plugin}"
        const val kotlin_gradle_plugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.kotlin}"
    }

    object App {
        const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin.kotlin}"
        const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.Support.androidx}"
        const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.Support.androidx}"
        const val constraint_layout =
            "androidx.constraintlayout:constraintlayout:${Versions.Support.constraint_layout}"
    }

    object JUnit {
        const val junit = "junit:junit:${Versions.JUnit.junit}"
    }

    object Instrumentation {
        const val androidx_junit = "androidx.test.ext:junit:${Versions.Instrumentation.androidx_junit}"
        const val androidx_espresso =
            "androidx.test.espresso:espresso-core:${Versions.Instrumentation.androidx_espresso}"
    }

    object RxJava {
        const val rxJava2 = "io.reactivex.rxjava2:rxjava:${Versions.RxJava.rxJava2}"
        const val rxJava2Android = "io.reactivex.rxjava2:rxandroid:${Versions.RxJava.rxJava2Android}"
        const val rxBinding = "com.jakewharton.rxbinding2:rxbinding:${Versions.RxJava.rxBinding}"
    }
}