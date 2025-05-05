// Demonstrates use of ternary conditional expressions and logical chaining
mint_int a = 10;
mint_int b = 20;

mint_string result = (a > b) ? "A is bigger" : "B is bigger or equal";
sayln(result);

mint_bool logicTest = (a < b and true) or (a == b);
sayln(logicTest);
