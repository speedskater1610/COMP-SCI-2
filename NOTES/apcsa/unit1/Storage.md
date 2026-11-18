# Unit 1: Storage

## File reading:

The `Scanner` object can be used to read data from different sources...

- `System.in` : Keyboard
- File Object
- `String`

## File object
A **File** is a type of Object that references a file stored on the computer system. We must import the following to read from a File:
- `import java.io.File;`
- `import java.io.IOException;`

#### Method setup:
```java
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example {
    public static void main(String... args) throws IOException {
        Scanner fileReader = new Scanner(new File("path/to/file"));
    }
}
```


## Considerations for File Reading:
- How many Lines of data? *In about 2 weeks when we learn `ArrayLists` this will become obsolete*
    - Size an array (or equivalent data structure) for the data
- Format of data stored in the file
    - For using `.split()` after lines are read.
- Type of data being stored / read.
    - Data conversion

