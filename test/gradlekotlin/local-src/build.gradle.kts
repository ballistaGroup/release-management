plugins {
	id 'org.springframework.boot' version '2.4.5'
	id 'io.spring.dependency-management' version '1.0.11.RELEASE'
	id 'java'
}

group = "com.ballistagroup"
version = "1.0.0-pre.0"
sourceCompatibility = "11"
project.ext.ignoreTests = true

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-web'
}
