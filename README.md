# login_d

An Android demo of a login and registration flow.

## Screens

- Splash screen with a pop-up animation
- Login screen with email and password fields
- Registration screen
- Main screen shown after logging in

The login screen checks only that both fields are filled in; there is no account storage or server, so any email and password are accepted. It is a UI demo, not a working authentication system.

## Build and run

Requirements: Android Studio (Hedgehog or newer) or JDK 17 with the Android SDK, `compileSdk` 34.

```bash
./gradlew assembleDebug    # APK in app/build/outputs/apk/debug/
./gradlew installDebug     # install on a connected device or emulator
```

Minimum Android version: API 30 (Android 11).

## Author

Vivek Datla
