object KotlinVersions {
    const val kotlin = "1.3.60"
}

object AndroidVersions {
    const val build_tools_version = "29.0.1"
    const val compile_sdk_version = 29
    const val min_sdk_version = 23
    const val target_sdk_version = 29
    const val android_gradle_plugin = "3.6.0-beta01"
}

object SupportVersions {
    const val androidx = "1.0.2"
    const val constraint_layout = "1.1.3"
}

object JUnitVersions {
    const val junit = "4.12"
}

object InstrumentationVersions {
    const val androidx_junit = "1.1.1"
    const val androidx_espresso = "3.2.0"
}

object RxJavaVersions {
    const val rxJava2 = "2.2.10"
    const val rxJava2Android = "2.1.1"
    const val rxBinding = "2.1.1"
}

object ProjectDependencies {
    const val android_gradle_plugin =
        "com.android.tools.build:gradle:${AndroidVersions.android_gradle_plugin}"
    const val kotlin_gradle_plugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${KotlinVersions.kotlin}"
}

object AppDependencies {
    const val kotlin_stdlib =
        "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${KotlinVersions.kotlin}"
    const val androidx_appcompat =
        "androidx.appcompat:appcompat:${SupportVersions.androidx}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${SupportVersions.androidx}"
    const val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${SupportVersions.constraint_layout}"
}

object JUnitDependencies {
    const val junit = "junit:junit:${JUnitVersions.junit}"
}

object InstrumentationDependencies {
    const val androidx_junit =
        "androidx.test.ext:junit:${InstrumentationVersions.androidx_junit}"
    const val androidx_espresso =
        "androidx.test.espresso:espresso-core:${InstrumentationVersions.androidx_espresso}"
}

object RxJavaDependencies {
    const val rxJava2 = "io.reactivex.rxjava2:rxjava:${RxJavaVersions.rxJava2}"
    const val rxJava2Android =
        "io.reactivex.rxjava2:rxandroid:${RxJavaVersions.rxJava2Android}"
    const val rxBinding =
        "com.jakewharton.rxbinding2:rxbinding:${RxJavaVersions.rxBinding}"
}