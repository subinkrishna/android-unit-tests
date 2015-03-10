# android-unit-tests

**Work in progress!**

Basic Android project template that uses [Jacoco](https://github.com/jacoco/jacoco), [Mockito](https://code.google.com/p/mockito/) and [JUnit](http://junit.org/) for unit testing and code coverage. 
  
```sh
// Runs unit tests
gradlew clean test
gradlew clean check
gradlew clean build

// Prepares code coverage report
gradlew clean codeCoverageReport
```

> **NOTE:** In version 1.1 of Android build tools, **test** doesn't **build**. It is NOT recommended to use `gradlew clean test` or `gradlew clean codeCoverageReport` until they fix it. Use **`gradlew clean build codeCoverageReport`** instead. More information on this issue: [https://code.google.com/p/android/issues/detail?id=140180](https://code.google.com/p/android/issues/detail?id=140180). This issues is expected to be resolved in version 1.2.

### Usefil links
* Android unit testing support - http://tools.android.com/tech-docs/unit-testing-support
* Mockito - http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html
* Using Mockito with Android - https://corner.squareup.com/2012/10/mockito-android.html
* Mockito Verify - http://www.baeldung.com/mockito-verify
