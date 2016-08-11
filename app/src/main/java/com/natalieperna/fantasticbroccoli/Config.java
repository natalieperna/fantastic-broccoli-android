package com.natalieperna.fantasticbroccoli;

public class Config {
    public class ApiUrl {
        private static final String BASE = "http://fantastic-broccoli.herokuapp.com/api/";

        public static final String LOGIN = BASE + "login";
    }

    public class SharedPref {
        // Key to store the boolean to track if user is logged in or not
        public static final String LOGGEDIN = "loggedin";

        // Key to store the API token of logged in user
        public static final String TOKEN = "token";

        // Key to store email of current logged in user
        public static final String EMAIL = "email";
    }
}
