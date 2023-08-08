# RecyclerXView

## Usage 

```java
RecyclerXView recyclerXView = findViewById(R.id.x);
recyclerXView.init();
recyclerXView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL, false));
recyclerXView.setAdapter(adapter);

```
## installation

In your project’s build.gradle add the following line

maven { url 'https://jitpack.io' }

```
allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
and in your app’s build.gradle add the dependency
```
implementation 'com.github.Special-N9NE:RecyclerXView:1.0'
```
Enjoy :heart:
