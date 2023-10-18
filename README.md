# vscode-gradle-includebuild-bug

Demonstrates a bug when using Gradle's `includeBuild` feature with the v3.13.0 version of `microsoft/vscode-gradle`

### Versions

* Visual Studio Code v1.83.1
* Gradle for Java v3.13.0
* Language Support for Java v1.23.0

### Setup

* Spring Initializr was used to create two simple Spring Boot packages, package-1 and package-2
* package-1/build.gradle line 19 specifies a dependency on package-2
* package-1/settings.gradle line 3 specifies `includeBuild '../package-2'`

### Problems

```json
[{
	"resource": "vscode-gradle-includebuild-bug/package-1/src/main/java/com/example/package1/Package1Application.java",
	"owner": "_generated_diagnostic_collection_name_#3",
	"code": "268435846",
	"severity": 8,
	"message": "The import com.example.package2 cannot be resolved",
	"source": "Java",
	"startLineNumber": 6,
	"startColumn": 8,
	"endLineNumber": 6,
	"endColumn": 28
},{
	"resource": "vscode-gradle-includebuild-bug/package-1/src/main/java/com/example/package1/Package1Application.java",
	"owner": "_generated_diagnostic_collection_name_#3",
	"code": "16777218",
	"severity": 8,
	"message": "Package2Class cannot be resolved to a type",
	"source": "Java",
	"startLineNumber": 12,
	"startColumn": 3,
	"endLineNumber": 12,
	"endColumn": 16
},{
	"resource": "vscode-gradle-includebuild-bug/package-1/src/main/java/com/example/package1/Package1Application.java",
	"owner": "_generated_diagnostic_collection_name_#3",
	"code": "16777218",
	"severity": 8,
	"message": "Package2Class cannot be resolved to a type",
	"source": "Java",
	"startLineNumber": 12,
	"startColumn": 37,
	"endLineNumber": 12,
	"endColumn": 50
}]
```
