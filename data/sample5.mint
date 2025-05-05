// Demonstrates nested if-else blocks with multiple logical conditions
mint_int a = 5;
mint_int b = 10;
mint_float c = 2.5;
mint_string name = "Mint";

mint_if (a < b) {
    sayln("a is less than b");

    mint_if (c < b) {
        sayln("c is also less than b");
    } mint_else {
        sayln("c is not less than b");
    }
} mint_else {
    sayln("a is not less than b");
}

mint_float result = b + c;         // Mixing int and float
sayln(result);                     // 12.5

mint_string msg = name + " works well!";
sayln(msg);                        
