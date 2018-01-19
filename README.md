# Running

```
javac *.java && java -ea Test
```

Your implementation is correct when there's no output after running `java -ea Test`.

# Operation cost

After you're done try these to get a feel for computational cost.

## Access cost

Description: `java Main <number of elements> access <index to access>`

```
java Main 100000000 access 0
java Main 100000000 access 1234
java Main 100000000 access 99999999
```

## Search cost

Description: `java Main <number of elements> search <number to search for>`

```
java Main 100000000 search 0
java Main 100000000 search 1234
java Main 100000000 search 99999999
```

## Insertion cost

Description: `java Main <number of elements> insert <index to insert at> <number to insert>`

```
java Main 100000000 insert 0 42
java Main 100000000 insert 1234 42
java Main 100000000 insert 99999999 42
```

## Deletion cost

Description: `java Main <number of elements> delete <index to delete at>`

```
java Main 100000000 delete 0
java Main 100000000 delete 1234
java Main 100000000 delete 99999999
```
