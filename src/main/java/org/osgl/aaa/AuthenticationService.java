package org.osgl.aaa;

/**
 * Created by luog on 8/01/14.
 */
public interface AuthenticationService {
    /**
     * Authenticate using username and password. Returns a {@link org.osgl.aaa.Principal} if
     * the username and password can be authenticated. or {@code null} if no principal found
     * matching the username and password combination.
     *
     * @param username the name of the principal
     * @param password the password
     * @return the principal matches the username and password
     */
    Principal authenticate(String username, String password);
}
