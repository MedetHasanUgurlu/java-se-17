# Notes
``` java
public class Test {
    public static void main(String [] args) {
        byte var = 127;
        System.out.println(/*INSERT*/);
    }   
}
```
Range of byte data type is from -128 to 127.


1. var = var - 1

2. var = var + 1

3. ++var

4. --var

5. var *= 2

6. var -= 10

7. var += 2

8. var

var = var - 1: 'var - 1' results in int type and it cannot be assigned to byte type without explicit casting, hence it causes compilation error.

var = var + 1: 'var + 1' results in int type and it cannot be assigned to byte type without explicit casting, hence it causes compilation error.

Please note that implicit casting is added by the compiler for prefix, postfix and compound assignment operators.

++var: Compiler converts it to var = (byte) (var + 1) and hence it compiles successfully.

--var: Compiler converts it to var = (byte) (var - 1) and hence it compiles successfully.

var *= 2: Compiler converts it to var = (byte) (var * 2) and hence it compiles successfully.

var -= 10: Compiler converts it to var = (byte) (var - 10) and hence it compiles successfully.

var += 2: Compiler converts it to var = (byte) (var + 2) and hence it compiles successfully.

var: No issues at all, it also compiles successfully.