    public void aufgabe2() {
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<4; j++) fahre();
            drehe((i%2 == 0) ? "rechts" : "links");
            fahre();
            drehe((i%2 == 0) ? "rechts" : "links");
        }
    }