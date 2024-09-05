### Problems and code smells the given code contains

1. **No empty lines** (methods should be separated by empty lines, also usually related block of code should be
   separated as well, like properties initialization)
2. **Class name is starting from lower case (should be from upper)**
3. **Class should be located in a separate file (unless it is an inner one)**
4. **No package specified** (good practise to keep classes under folders/packages) for better structure organization
5. **One letter field name** (properties name should have meaningful names, like weight in this example)
6. **Public field** (Encapsulation should not be violated)
7. **Unnecessary static field** (static field belongs to class and shared among all objects)
8. **Incorrect method names** (method names should say what they do, like getResult/calculateResult, not Result, also
   start from lower case in case of Java)
9. **Static methods** (It is easier to manage and test non-static methods, also some of them use data that belongs to
   object, hence it will break in case of class reference (img is not initialized))
10. **Usage of & operator instead of &&**
11. **Abbreviations in names** (Better to have full names like HumanIndexMassBody instead of HumanIMB)
12. **Norm, Warning, Fat, Deficit as magic values** (it is quite unknown what it is, better to move it to an enum. Same
    applies 18.5,25...)
13. **Formatting is not applied fully** (some spaces are shifted here and there...)
14. **Insufficient field type** (debatable, but float type has enough precision to store human weight and height values,
    which saves few bits)