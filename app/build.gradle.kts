plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.dicoding.financebro"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.dicoding.financebro"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    // OkHttp libraries
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging)

    // Core libraries
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.material)

    // Navigation Components
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.navigation.ui)

    // Data libraries
    implementation(libs.androidx.room.runtime)
    kapt(libs.androidx.room.compiler)
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.gson)
    implementation(libs.androidx.datastore.preferences)

    // ML and Chart libraries
    implementation(libs.tensorflow.lite)
    implementation(libs.mpandroidchart)
    implementation(libs.apache.commons.math3)

    // UI libraries
    implementation(libs.androidx.recyclerview)

    // Dependency Injection
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler) // Mengganti ksp dengan kapt

    // Firebase Authentication (Google login)
    implementation(libs.firebase.auth)
    implementation(libs.google.play.services.auth)

    // Testing libraries
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    testImplementation(libs.mockito.core)

    implementation(libs.cardview)

    // Import the Firebase BoM
    implementation(platform(libs.firebaseBom))

    // Add the dependency for the Firebase SDK for Google Analytics
    implementation(libs.firebaseAnalytics)
}


