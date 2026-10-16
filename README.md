# Dessert Clicker con ViewModel

Proyecto final de la practica PEA para Android Basics con Jetpack Compose. Parte del
proyecto oficial de Dessert Clicker y completa estas dos actividades:

1. [Ciclo de vida de una Activity](https://developer.android.com/codelabs/basic-android-kotlin-compose-activity-lifecycle)
2. [Agregar un ViewModel a Dessert Clicker](https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-viewmodel)

## Resultado

- Registra en Logcat los callbacks principales del ciclo de vida de `MainActivity`.
- Mantiene ventas, ingresos, precio e imagen dentro de `DessertViewModel`.
- Expone un `StateFlow<DessertUiState>` inmutable para que Compose observe la interfaz.
- Conserva el estado cuando la actividad se recrea por un cambio de configuracion.
- Incluye pruebas unitarias del estado inicial y de la progresion de ventas.
- Presenta las etiquetas de la interfaz en espanol.

## Ejecutar el proyecto

1. Abrir la carpeta del proyecto en Android Studio.
2. Esperar la sincronizacion de Gradle.
3. Seleccionar un emulador o dispositivo con Android 7.0 o superior.
4. Ejecutar la configuracion `app`.

Para verificarlo desde consola:

```powershell
.\gradlew.bat testDebugUnitTest assembleDebug
```
