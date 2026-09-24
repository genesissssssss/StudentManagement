package com.studentapp;

public class Main {
    public static void main(String[] args) {
        // Temporary debug
        io.github.cdimascio.dotenv.Dotenv dotenv =
                io.github.cdimascio.dotenv.Dotenv.configure().ignoreIfMissing().load();
        System.out.println("DB_USER from .env: " + dotenv.get("DB_USER"));
        System.out.println("DB_PASSWORD from .env: " + (dotenv.get("DB_PASSWORD") != null ? "loaded" : "MISSING"));

        // ... rest of your code
    }}
