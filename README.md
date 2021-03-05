# Score Names

This is a command line program created in order to learn Scala.

It accepts a path to a text file of names as an argument.
It prints a score calculated using a simple algorithm.

Execute the program by running `sbt "run ./test-names.txt"` from the project root.

## Problem Definition

Create a command line utility that will compute a score for a list of first names.

The list of names will be provided as a text file. The full path to the names file will be specified as a command line argument. The names file will contain a single line of quoted, comma-separated names. A small sample of data can be found in the test-names.txt file.

To score a list of names, you must sort it alphabetically and sum the individual scores for all the names.
To score a name, sum the alphabetical value of each letter (A=1, B=2, C=3, etc...) and multiply the sum by the name's position in the list (1-based).

For example, when the sample data is sorted into alphabetical order, LINDA, which is worth 12 + 9 + 14 + 4 + 1 = 40, is the 4th name in the list. So, LINDA would obtain a score of 40 x 4 = 160. The correct score for the sample list is 3194. The correct score for the full data is 871198282.

### Future Requirements Changes

Keep the following in mind while implementing your design to make future changes easy.

- Another department will want to use this utility as well, but they have a much more complex name scoring algorithm.
- This scoring feature will be added to the company's intranet web-app, allowing employees to upload and score files from their desktop.
- The company will be switching from first names only to both first and last names in the file.

### Assumptions

- I made the assumption that lowercasing the names was going to be okay for calculating the score. The input is all in uppercase, but I didn't want to rely on that so I explicitly lowercase.