package com.project.bd.error.dto;

public class LoginDto {
        private String userName;
        private String password;
        private Boolean rememberMe;
        private boolean registrationSuccessful;

        public boolean isRegistrationSuccessful() {
                return registrationSuccessful;
        }

        public void setRegistrationSuccessful(boolean registrationSuccessful) {
                this.registrationSuccessful = registrationSuccessful;
        }

        public String getUserName() { return userName; }
        public void setUserName(String userName) { this.userName = userName; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }

        public Boolean getRememberMe() { return rememberMe; }
        public void setRememberMe(Boolean rememberMe) { this.rememberMe = rememberMe; }


}
