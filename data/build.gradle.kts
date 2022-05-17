plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 22
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            buildConfigField("String", "MAIN_BASE_URL", "\"https://kitsu.io/api/edge/\"")
            buildConfigField("String", "AUTHENTICATION_BASE_URL", "\"https://kitsu.io/api/oauth/\"")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":domain"))
    //OkHttp

    
    implementation(libs.bundles.okHttp)
    //Retrofit


    implementation(libs.bundles.retrofit)
    //Coroutines


    implementation(libs.coroutines.android)
    // Paging 3


    api(libs.paging.paging)
}