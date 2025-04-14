mint_int x = 10;
mint_int y = 5;

sayln(x + y);

mint_if (x > y) {
    sayln("X is greater");
} mint_else {
    sayln("Y is greater or equal");
}

mint_for (mint_int i = 0; i < 3; i = i + 1) {
    say("loop: ");
    sayln(i);
}