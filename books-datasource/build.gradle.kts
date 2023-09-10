plugins {
    `android-library`
    `kotlin-android`
}

apply<MainGradlePlugin>()

android {
    namespace = "com.plcoding.books_datasource"
}

dependencies {
    room()
    retrofit()
    hilt()
}