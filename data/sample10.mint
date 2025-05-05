// Demonstrates type mismatch errors caught at runtime during assignments
mint_int number = 10;
mint_bool flag = true;
mint_string text = "hello";

// This should work
sayln(number);

// This will cause a type mismatch (trying to assign bool to int)
number = flag;         // ERROR: Type mismatch

// This will also cause a type mismatch (trying to assign string to bool)
mint_bool test = text; // ERROR: Type mismatch (Comment line 9 if you want to test line 12 Error)