# Groovy NullPointerException in Loosely Typed Methods

This example demonstrates a common error in Groovy: unexpected null pointer exceptions due to loose typing and improper null handling.  The `myMethod` function returns `null` if either input parameter is `null`. While this may seem straightforward, it highlights a potential pitfall if the calling code doesn't anticipate and explicitly check for the possibility of a null return value.  Improper handling could lead to runtime errors further down the application's execution path.

The solution demonstrates safe null handling using the Elvis operator (`?:`) for graceful handling of potential null values. 

## Related Issues
* NullPointerExceptions are common in dynamically typed languages
* Careful consideration of nulls is crucial in avoiding runtime errors

## How to Use
Clone the repository and run the Groovy scripts using a Groovy compiler (e.g., `groovy bug.groovy` and `groovy bugSolution.groovy`). Observe the different outputs and how the solution improves null handling.