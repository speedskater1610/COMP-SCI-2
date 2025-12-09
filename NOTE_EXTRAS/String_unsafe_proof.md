You are probably coming from here [Condition notes](https://github.com/speedskater1610/COMP-SCI-2/NOTES/JavaControls_Dec_9.md)
## We will use unsafe java `sun.misc.Unsafe` to prove that 2 `String` objects declared in the same scope with the same value both refernce the same part of memory
First we will make a file `UnsafeStringAddress.java` which we will make the method `getUnsafe()` 
This method provides a way to acquire the `Unsafe` singleton instance, 
even though `Unsafe` is typically restricted and not intended for direct public use in standard Java programs. 

<strong><ins>UnsafeStringAddress.java</ins></strong>
```java
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class UnsafeStringAddress {
    public static Unsafe getUnsafe() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }
}
```

Then a main file is needed where we will use this method and find the memory adress of 2 `String` varaibles `str1` & `str2` 
this will prove that they are stored in the same location


<strong><ins>StringMemoryAddress.java</ins></strong>
```java
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class StringMemoryAddress {
    public static void main(String[] args) throws Exception {
        Unsafe unsafe = UnsafeStringAddress.getUnsafe();

        String str1 = "Hello!";
        String str2 = "Hello!";

        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true); 

        
        long arrayBaseAddress = unsafe.objectFieldOffset(valueField
        
        // str1
        Object charArrayObject_str1 = valueField.get(str1);

        long firstCharAddress_str1 = unsafe
                                        .baseAddress(charArrayObject_str1) + 
                                    unsafe
                                        .arrayBaseOffset(char[].class);
        System.out.println(
            "Address of str1: 0x" + 
            Long.toHexString(firstCharAddress_str1)
        );
        
        // str2
        Object charArrayObject_str2 = valueField.get(str2);

        long firstCharAddress_str2 = unsafe
                                        .baseAddress(charArrayObject_str2) + 
                                    unsafe.
                                        arrayBaseOffset(char[].class);
                                        
        System.out.println(
            "Address of str2: 0x" + 
            Long.toHexString(firstCharAddress_str2)
        );
    }
}
```
### the Addresses should be the same and will change every time you rerun the program. 

*NOTE this program is not portable since it uses the `Unsafe` java API*
