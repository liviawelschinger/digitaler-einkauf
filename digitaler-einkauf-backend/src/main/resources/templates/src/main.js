"use strict";

const AppState = {
    activePage: "login",
    userRole: "demo"
};

function doLoginCheck() {
    let isLoggedIn = false; // @todo

    if(!isLoggedIn) {
        navigateTo("welcome");
    } else {
        // check user type
        switch(AppState.userRole) {
            case "buyer": navigateTo("categories"); break;
            default: navigateTo("welcome");
        }
    }
}

function registerEvents() {
    $('#login_as_buyer').on('click', (e) => {
        e.preventDefault();
        navigateTo('categories')
    });
}

function navigateTo(pageName) {
    // @fixme: This is incredibly slow in Firefox. Probably because of CSS parsing.
    // 'style: none;' may be faster than adding/removing classname
    // use framework in best case
    document.querySelectorAll('.active.page')[0].classList.remove('active');
    const nextPage = document.getElementById('page_'+pageName);
    if(!nextPage) console.error("Page: " + pageName + " does not exist.");
    nextPage.classList.add('active');
    AppState.activePage = pageName;
}

function main()
{
    doLoginCheck();
    registerEvents();
}

main();