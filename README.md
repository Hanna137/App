# Travel App - Ho Chi Minh City 🇻🇳

A mobile app built using Kotlinand Jetpack Compose, providing travel information for various cultural and entertainment spots in Ho Chi Minh City, Vietnam.

## Features

- Interactive map with clickable markers for each destination.
- Offline images and descriptions of famous places.
- View detailed information for each place in a clean interface.
- Navigate through different screens (Home, Main, About).

## Project Structure

```
apptravel/
├── ui/
│   ├── MainActivity.kt         # Entry point of the app
│   ├── screen/
│   │   ├── HomeScreen.kt       # The first screen, introducing the main functions of the application
│   │   ├── AboutScreen.kt      # map + topic location filter buttons, information dialog box: displaying name + description + photo, GPS location button: navigating to the user's location.
│   │   └── MainScreen.kt       # ntroducing members
│   └── theme/
│       ├── Color.kt
│       ├── Theme.kt
│       └── Type.kt             # Custom typography


## Tech Stack

- Kotlin + Jetpack Compose
- osmdroid for displaying map and markers
- GeoJSON for spatial data
- Assets for offline images and content
- Modular architecture with Compose screens

# How to Run

1. Clone or download this repository.
2. Open the project in Android Studio (Arctic Fox or later).
3. Connect an Android emulator or physical device.
4. Build and run the app.

##  Assets

- All images are stored in the 'assets/images/' folder and loaded dynamically.
- Place info is likely in a '.geojson' file, parsed on runtime.


