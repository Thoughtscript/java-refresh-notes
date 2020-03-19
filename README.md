# java-refresh-notes

Updated notes (and code samples) for Java 8. General refresh of core concepts.

## Objectives

1. Correct some typos in previous notes (e.g. - generic in ArrayList declaration using curly braces).
1. Move most notes to direct code samples.
1. Recapitulate a few older notes that are scattered in two or three sets now.

## Specific Corrections

1. Regex in notes not quite correct - **specialChar** and **strongEmail** - may have introduced an extra`/` when copying and pasting.
1. Removed generic diamond `<>` in **ArrayList** declaration using curly braces.
1. **Array** (and **Set**, **HashSet**) declarations to populate with a default value must be primitives (had `Boolean` instead of `boolean`).
1. Removed **Array** declaration using actual elements of **Array** by index.

## Use

Running non-Spring.io Java code in IntelliJ requires:

1. Proper classpath and source hierarchy - `src/io/thoughtscript/refresh`
1. Run the code in **Debug mode** for full logging (basic logging configuration here) if you have any issues.

## Out

```
   Test case: [\^\[\]{}$\\\/<>~`!@#$%^&*()\-_+=|?,."':;]+
   Test: a
   Expected: false
   Pass: pass


   Test case: [\^\[\]{}$\\\/<>~`!@#$%^&*()\-_+=|?,."':;]+
   Test: d#525%#
   Expected: true
   Pass: pass


   Test case: [\^\[\]{}$\\\/<>~`!@#$%^&*()\-_+=|?,."':;]+
   Test: aeg253
   Expected: false
   Pass: pass


   Test case: [\^\[\]{}$\\\/<>~`!@#$%^&*()\-_+=|?,."':;]+
   Test: %#$#
   Expected: true
   Pass: pass


   Test case: [\^\[\]{}$\\\/<>~`!@#$%^&*()\-_+=|?,."':;]+
   Test: #!
   Expected: true
   Pass: pass


   Test case: <[a-z0-9]+>.*<\/[a-z0-9]+>
   Test: <tag>
   Expected: false
   Pass: pass


   Test case: <[a-z0-9]+>.*<\/[a-z0-9]+>
   Test: <tag><tag>
   Expected: false
   Pass: pass


   Test case: <[a-z0-9]+>.*<\/[a-z0-9]+>
   Test: <a href=''>text</a>
   Expected: false
   Pass: pass


   Test case: <[a-z0-9]+>.*<\/[a-z0-9]+>
   Test: <span>text</span>
   Expected: true
   Pass: pass


   Test case: <[a-z0-9]+>.*<\/[a-z0-9]+>
   Test: <span>text</span>
   Expected: true
   Pass: pass


   Test case: <[a-z0-9]+>.*<\/[a-z0-9]+>
   Test: <h1></h1>
   Expected: true
   Pass: pass


   Test case: <[a-z0-9"'\s=]+>.+<\/[a-z0-9]+>
   Test: <tag>
   Expected: false
   Pass: pass


   Test case: <[a-z0-9"'\s=]+>.+<\/[a-z0-9]+>
   Test: <tag><tag>
   Expected: false
   Pass: pass


   Test case: <[a-z0-9"'\s=]+>.+<\/[a-z0-9]+>
   Test: <a href=''>text</a>
   Expected: true
   Pass: pass


   Test case: <[a-z0-9"'\s=]+>.+<\/[a-z0-9]+>
   Test: <span>text</span>
   Expected: true
   Pass: pass


   Test case: <[a-z0-9"'\s=]+>.+<\/[a-z0-9]+>
   Test: <h1></h1>
   Expected: false
   Pass: pass


   Test case: .+@.+\..+
   Test: as@.324.53253.c
   Expected: true
   Pass: pass


   Test case: .+@.+\..+
   Test: a@b.c
   Expected: true
   Pass: pass


   Test case: .+@.+\..+
   Test: adam.gerard@gmail.com
   Expected: true
   Pass: pass


   Test case: .+@.+\..+
   Test: 3ay4ya4y@@@@
   Expected: false
   Pass: pass


   Test case: .+@.+\..+
   Test: as
   Expected: false
   Pass: pass


   Test case: (?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])
   Test: as@.324.53253.c
   Expected: false
   Pass: pass


   Test case: (?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])
   Test: a@b.c
   Expected: true
   Pass: pass


   Test case: (?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])
   Test: adam.gerard@gmail.com
   Expected: true
   Pass: pass


   Test case: (?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])
   Test: 3ay4ya4y@@@@
   Expected: false
   Pass: pass


   Test case: (?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])
   Test: as
   Expected: false
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*$
   Test: a3536a3635#%#%
   Expected: false
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*$
   Test: asAAGGE323GE
   Expected: true
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*$
   Test: SFEF25353253zghhh
   Expected: true
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*$
   Test: 3a5353535ra3535253
   Expected: true
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*$
   Test: gage325353.
   Expected: false
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*[\.?!]{1}$
   Test: I am a sentence.
   Expected: true
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*[\.?!]{1}$
   Test: I kinda trail offfff!
   Expected: true
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*[\.?!]{1}$
   Test: gage325353rat2a325@@$#@
   Expected: false
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*[\.?!]{1}$
   Test: aggoageigjwegjgpoe...
   Expected: false
   Pass: pass


   Test case: ^[A-Za-z0-9\s]*[\.?!]{1}$
   Test: sfsfe!!!!
   Expected: false
   Pass: pass


   [A, B, C]
   [Animal, Baseball, Cat]
   [exampleOne, exampleTwo]


   false
   false
   false
   0
   0
   0
   0
   null
   null
   null
   null
   null
   33
   3
   4
   5


   0
   Parent


   Private - Class Only, Default - Package Only, Protected - Package and Subclasses, Public - All
   Default and Public can be assigned to classes
   I'm a private method
   I'm a default method
   I'm a protected method
   I'm a public method


   Concrete class example
   I'm the concrete class abstract method implementation
   I'm in the abstract child class implementation
   I am in the parent abstract class


   I am an interface implementation example
   ID set to: 4
   4
   I am the next hierarchy message



   Process finished with exit code 0
```