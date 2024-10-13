package com.j2ee.vol_uni_edu.models;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

public class CustomUserDetails implements UserDetails {
    private final User user;

    public CustomUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Implement logic to return authorities (roles)
        return new ArrayList<>();
    }
    @Override
    public String getPassword() {
        return user.getPassword(); // Get the hashed password from your User entity
    }
    @Override
    public String getUsername() {
        return user.getEmail(); // Use email as the username
    }
    @Override
    public boolean isAccountNonExpired() {
        // Return true if the account is not expired
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // Return true if the account is not locked
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // Return true if credentials (password) are not expired
        return true;
    }

    @Override
    public boolean isEnabled() {
        // Return true if the user is enabled
        return user.getStatus().equals("active");
    }

    public String getRole() {
        return user.getRole(); // Additional method to get the role, if needed
    }
}