Rabbit Companion App 🐰

An Android app built with Jetpack Compose that consumes the Rabbit API to display random rabbit information. Demonstrates modern Android development practices with API integration.

FEATURES ✨
- Fetches random rabbit data from Ktor backend API
- Displays rabbit image, name, and description
- Modern UI with Jetpack Compose
- Dependency injection with Hilt
- Loading states and error handling

TECH STACK 🛠️
- Jetpack Compose - Modern declarative UI toolkit
- Retrofit 2.9.0 - Type-safe HTTP client
- Hilt 2.38.1 - Dependency injection
- Coil 1.3.2 - Image loading
- Coroutines - Asynchronous operations
- ViewModel - UI-related data holder
- Ktor API Integration - Connection to backend service

SETUP ▶️
1. Clone both repositories:
    - API Server: git clone [your-api-repo-url]
    - Android App: git clone [your-android-repo-url]

2. Run API server first (from API repo):
   ./gradlew run

3. Update BASE_URL in Android app:
   Modify BASE_URL in RabbitsApi.kt to match your local IP:
   const val BASE_URL = "http://YOUR_LOCAL_IP:9090"

4. Android app dependencies:
   ./gradlew build

5. Run Android app in emulator/device

API INTEGRATION 🔌
The app consumes these endpoints from the Ktor API:
- GET /randomrabbit - Returns random rabbit JSON
  Sample response:
  {
  "name": "Carl",
  "description": "A cute brown rabbit",
  "imageUrl": "http://localhost:9090/rabbits/rabbit1.jpg"
  }

PROJECT STRUCTURE 📂
app/
├── src/
│   ├── main/
│   │   ├── java/com/sahitya/ktorsupportingapp/
│   │   │   ├── data/            # API interfaces and models
│   │   │   ├── di/              # Dependency injection setup
│   │   │   ├── ui/              # Composable components
│   │   │   ├── MainActivity.kt  # Entry point
│   │   │   └── MainViewModel.kt # Business logic
│   │   └── res/                 # Android resources
│   └── test/                    # Unit tests
└── build.gradle                 # Dependency configurations

KEY COMPONENTS 🔑
- MainViewModel: Manages API state and data fetching
- RabbitsApi: Retrofit interface for API communication
- MainActivity: Compose UI with image and text display
- AppModule: Hilt dependency provider
- CoilImage: Async image loading implementation

DEPENDENCIES 📦
dependencies {
// Core Android
implementation 'androidx.core:core-ktx:1.7.0'
implementation 'androidx.appcompat:appcompat:1.4.1'

    // Compose
    implementation "androidx.compose.ui:ui:$compose_version"
    implementation "androidx.compose.material:material:$compose_version"
    
    // Networking
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    
    // DI
    implementation "com.google.dagger:hilt-android:2.38.1"
    kapt "com.google.dagger:hilt-android-compiler:2.37"
    
    // Async
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1'
}

TESTING 🧪
1. Ensure API server is running
2. Update BASE_URL for test environment
3. Run instrumented tests:
    - API connectivity tests
    - UI interaction tests
    - ViewModel unit tests

CONTRIBUTING 🤝
- Follow Kotlin style guide
- Use descriptive branch names
- Add tests for new features
- Update API documentation accordingly

TROUBLESHOOTING 🔧
- Check API server connectivity
- Verify correct BASE_URL configuration
- Ensure CORS is enabled on API server
- Check Android network permissions

---
Made with ❤️ using Jetpack Compose + Ktor