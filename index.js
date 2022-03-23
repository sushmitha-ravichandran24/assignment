"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const GitHubApiService_1 = require("./GitHubApiService");
console.log("hello");
let abc = new GitHubApiService_1.GitHubApiService();
abc.getUserInfo('koushikkothagal', (user) => {
    console.log(user);
});
abc.getRepo('koushikkothagal', (repo) => {
    console.log(repo);
});
//API -> to retrieve some information from anyonline service. 