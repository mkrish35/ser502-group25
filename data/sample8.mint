// Demonstrates nested loops and compound control flow
mint_int x = 15;
mint_int y = 8;
mint_bool flag = true;

mint_if (x > 10 and y < 10) {
    sayln("First condition met");

    mint_if (flag and not (x == y)) {
        sayln("Nested condition true");
    } mint_else {
        sayln("Nested condition false");
    }

} mint_else {
    sayln("First condition failed");
}
