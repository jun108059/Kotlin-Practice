apply(plugin= "kotlin-jpa")

tasks.jar {
    manifest {
        attributes["Main-Class"] = "youngjun.me.issueservice.IssueServiceApplication"
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
}
