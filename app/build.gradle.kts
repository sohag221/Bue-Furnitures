plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.parcelize)
    id ("kotlin-parcelize")
    id("androidx.navigation.safeargs.kotlin")
    id ("kotlin-kapt")
    alias(libs.plugins.google.gms.google.services)

}

android {
    namespace = "com.example.buyfurniture"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.buyfurniture"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    //firebaseAuthentication
    implementation(libs.firebase.auth)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //dagger hilt
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")

    //ktx
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")


    implementation ("com.github.shuhart:stepview:1.5.1")

    //viewpager2
    implementation ("androidx.viewpager2:viewpager2:1.1.0")

    //loading button
    implementation ("br.com.simplepass:loading-button-android:2.2.0")

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    //circular image
    implementation ("de.hdodenhof:circleimageview:3.1.0")

}