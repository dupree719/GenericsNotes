# GenericsNotes

Generics offer the ability to have one class that is flexible for many different types...
Generics allow the author of a class or method to introduce "type parameters", which are symbols that can be substituted for any concrete type.

"public class Test <T>" 
                            ^ Type parameter "T" is the convention, stands for TYPE
                            
Under main: 
 
"Test<String> test = new Test("Test);"
        ^ Going to be used as "T" type
                           

Benefits:
- Eliminates casts
- Provide stronger checks at compile-time

Generic Naming conventions:
K = Keys
E = Element
V = Values
N = Numbers
T = Type

