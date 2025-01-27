# Kotlin Symbol Processing (KSP)

KSP is an API that helps developers generate new code based on annotations. KSP looks at various parts of the code such as **classes, functions, and properties.** It's up to **2x faster than KAPT** because it directly processes Kotlin code, whereas KAPT first converts Kotlin code to Java, making it slower. KSP fully supports Kotlin and understands its features better.

## Example

```kotlin
@Entity  
class User(  
    val id: String,  
    val name: String  
)
```
In this case, KSP automatically generates additional code that allows the `User` class to be stored in a Room database.
