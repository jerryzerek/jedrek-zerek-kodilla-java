package com.spring.kodilla.portfolio.reminder;

import java.util.Objects;

public class User {
    private final String username;
    private final String realname;

    public User(String username, String realname) {
        this.username = username;
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(realname, user.realname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, realname);
    }
}
