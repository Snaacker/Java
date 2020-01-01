# Singleton pattern   

### Goal

### Pros   
1. Lazy Instantiate   
2. Static Initialization   
### Cons   
1. Generally used as a global instance, why is that so bad? Because you hide the dependencies of your application in your code, instead of exposing them through the interfaces. Making something global to avoid passing it around is a code smell.   
2. Singleton pattern violate the single responsibility principle: by virtue of the fact that they control their own creation and lifecycle.   
3. Singleton pattern inherently cause code to be tightly coupled. This makes faking them out under test rather difficult in many cases.   
4. Singleton pattern carry state around for the lifetime of the application. Another hit to testing since you can end up with a situation where tests need to be ordered which is a big no no for unit tests. Why? Because each unit test should be independent from the other.   
