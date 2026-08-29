# ASCII Alphabet

A simple Java application that renders letters as ASCII art.

The application uses predefined ASCII representations for uppercase and lowercase letters and displays them in the terminal.

## Requirements

* Java 21
* Gradle Wrapper

## Run the application

Clone or download the project and open a terminal in the project directory.

Run:

```bash
./gradlew run -q --console=plain
```

### Windows

If `./gradlew` does not work in your terminal, you can use:

```bash
gradlew.bat run -q --console=plain
```

## How it works

The application converts characters into their ASCII decimal values and uses those values to find the corresponding ASCII art representation.

For example:

* `A` → ASCII `65`
* `B` → ASCII `66`
* `a` → ASCII `97`
* `b` → ASCII `98`
* Space → ASCII `32`

Each character is normalized so that it can be displayed correctly alongside other characters.

## Project structure

```text
src/
└── main/
    └── java/
        └── L1/
            ├── App.java
            └── AsciiAlphabet.java
```

## Technologies

* Java 21
* Gradle
* ASCII art
* JavaDoc
