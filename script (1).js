document.addEventListener('DOMContentLoaded', function () {
    const loginLink = document.getElementById('loginLink');
    const logoutLink = document.getElementById('logoutLink');

    // Check if user is logged in
    const isLoggedIn = localStorage.getItem('isLoggedIn');
    if (isLoggedIn) {
        loginLink.style.display = 'none';
        logoutLink.style.display = 'inline';
    }

    loginLink.addEventListener('click', function () {
        const username = prompt('Enter your username:');
        if (username) {
            // Perform login, e.g., send data to server
            // For simplicity, we'll just set a local storage flag
            localStorage.setItem('isLoggedIn', true);
            loginLink.style.display = 'none';
            logoutLink.style.display = 'inline';
        }
    });

    logoutLink.addEventListener('click', function () {
        // Perform logout, e.g., send request to invalidate session
        localStorage.removeItem('isLoggedIn');
        loginLink.style.display = 'inline';
        logoutLink.style.display = 'none';
    });
});

function login() {
    // Perform login, e.g., send data to server
    // For simplicity, we'll just set a local storage flag
    localStorage.setItem('isLoggedIn', true);
    document.getElementById('loginLink').style.display = 'none';
    document.getElementById('logoutLink').style.display = 'inline';
}
