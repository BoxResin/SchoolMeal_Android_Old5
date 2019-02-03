plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "winapi251.app.schoolmeal"
        minSdkVersion(14)
        targetSdkVersion(28)
        versionCode = 80
        versionName = "3.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        // 릴리즈 모드 옵션
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        // 디버그 모드 옵션
        getByName("debug") {
            applicationIdSuffix = ".debug"
        }
    }
}

// 의존성
dependencies {
    // 로컬 JAR
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // 코틀린
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.20")

    // AndroidX
    implementation("androidx.appcompat:appcompat:1.0.2")

    // Android KTX
    implementation("androidx.core:core-ktx:1.0.1")

    // 테스트
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.1")
}
