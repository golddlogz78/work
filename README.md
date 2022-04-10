Lab - Input Output
==========

Before you start
----------
The purpose of this lab is to practice reading and writing object to file. Various classes in java.io will be used to accomplish the exercises. Please read the instruction below.s


Exercise One - Read characters
-------------
Complete the ​ printNumEsWithFileReader() method in the ​ lab.oodp.io.numchar.CharCounter class,
which should use a ​ FileReader to read input1.txt and print out the following
information:
1. The total number of characters in the file
2. The number of e’s and E’s in the file

Please use TestCharCounter to test your code.

Exercise Two - Movie Read and Write
-------------
In the lab.oodp.io.movie package you’ll see the Movie class from a previous lab. In this exercise, we’ll create two programs: *MovieWriter* will create a file containing data for lots of movies, while *MovieReader* one will read that file and create Movie objects.

1. Complete MovieWriter’s *saveMovies* method. This method should use a DataOutputStream to write the contents of the films array to the given file. ​ 

2. Complete MovieReader’s *loadMovies* method. This method should use a
DataInputStream to read the contents of the given file and use it to create, fill and
return an array of Movie objects.

**Note: You should not make any assumptions about the number of movies in the array – your program (and the one in part 2) should work for any number of movies!** 

Below is expected output when running MovieReader.

```
Movies loaded successfully from movies.dat!
Movie Collection
================
Meet the Parents (2000), 107 minutes, Director: Jay Roach
The Parent Trap (1961), 129 minutes, Director: David Swift
Alice In Wonderland (2009), 109 minutes, Director: Tim Burton
Dark Shadows (2012), 113 minutes, Director: Tim Burton
The Iron Lady (2011), 105 minutes, Director: Phylliday Lloyd
The Help (2011), 137 minutes, Director: Tate Taylor
From Russia With Love (1963), 110 minutes, Director: Terence Young
The King's Speech (2011), 118 minutes, Director: Tom Hooper
Charlie and the Chocolate Factory (2005), 115 minutes, Director: Tim Burton
Easy Rider (1969), 94 minutes, Director: Dennis Hopper
Walk the Line (2005), 136 minutes, Director: James Mangold
Kaikohe Demolition (2004), 52 minutes, Director: Florian Habicht
Brokeback Mountain (2005), 134 minutes, Director: Ang Lee
Gladiator (2000), 154 minutes, Director: Ridley Scott
The Long Voyage Home (1940), 105 minutes, Director: John Ford
Happy-Go-Lucky (2008), 118 minutes, Director: Mike Leigh
The Big Wedding (2013), 89 minutes, Director: Justin Zackham
The Intouchables (2011), 112 minutes, Director: Olivier Nakache and Eric Toledano
Searching for Sugar Man (2012), 86 minutes, Director: Malik Bendjelloul

The most recent movie is: Searching for Sugar Man (2012), 86 minutes, Director: Malik Bendjelloul
The longest movie is: The Intouchables (2011), 112 minutes, Director: Olivier Nakache and Eric Toledano

Searching for Sugar Man was directed by Malik Bendjelloul
Liberal Arts is not in the collection.
The Intouchables was directed by Olivier Nakache and Eric Toledano

```

You can use **TestMovie** class to test this exercise. The file movies.dat will be created as a result from running this test.

Submit this lab
------------------
You can submit this lab by simply pushing the code to the Github. 
