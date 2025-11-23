Projekt „Moja Droga do Wolności” to aplikacja mobilna tworzona na platformę Android. Jej celem jest wspieranie użytkownika w rozwoju osobistym oraz budowaniu własnej drogi do wolności – w znaczeniu samodzielności, samorealizacji lub pracy nad własnymi celami.

Funkcjonalności

Ekran powitalny i podstawowa nawigacja.

Interfejs pozwalający śledzić postępy użytkownika.

Możliwość definiowania celów i zadań.

Powiadomienia wspierające użytkownika w codziennych działaniach.

Obsługa podstawowych funkcji Androida, z wykorzystaniem natywnych komponentów.

Technologie
Projekt oparty jest na:

Android SDK

Kotlin lub Java (w zależności od źródeł)

Gradle (pliki konfiguracyjne build.gradle.kts oraz settings.gradle.kts)

Instalacja

Sklonuj repozytorium:
git clone https://github.com/Piotrkaluga/Moja-Droga-do-Wolno-.git

Otwórz projekt w Android Studio.

Upewnij się, że masz zainstalowane wymagane wersje Android SDK i Gradle.

W razie potrzeby skonfiguruj plik local.properties, wskazując lokalizację SDK.

Uruchomienie

W Android Studio wybierz wariant „debug”.

Uruchom aplikację na emulatorze lub na prawdziwym urządzeniu.

Alternatywnie możesz użyć polecenia:
./gradlew installDebug

Struktura katalogów
app – główny moduł aplikacji
gradle – konfiguracja narzędzia Gradle
build.gradle.kts – główny plik konfiguracji projektu
settings.gradle.kts – konfiguracja modułów projektu
gradlew i gradlew.bat – wrappery Gradle
.idea – konfiguracja IDE
