# Travel App - Ho Chi Minh City 🇻🇳

A mobile app built using Kotlinand Jetpack Compose, providing travel information for various cultural and entertainment spots in Ho Chi Minh City, Vietnam.

## Features

- Interactive map with clickable markers for each destination.
- Offline images and descriptions of famous places.
- View detailed information for each place in a clean interface.
- Navigate through different screens (Home, Map, About).

## Project Structure

```
apptravel/
├── ui/
│   ├── MainActivity.kt         # Entry point of the app
│   ├── screen/
│   │   ├── HomeScreen.kt       # Main content screen
│   │   ├── MapScreen.kt        # Map with markers
│   │   ├── AboutScreen.kt      # Info/about the app
│   │   └── MainScreen.kt       # Navigation between screens
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
2. Open the project in **Android Studio (Arctic Fox or later)**.
3. Connect an Android emulator or physical device.
4. Build and run the app.

##  Assets

- All images are stored in the `assets/images/` folder and loaded dynamically.
- Place info is likely in a `.geojson` file, parsed on runtime.


