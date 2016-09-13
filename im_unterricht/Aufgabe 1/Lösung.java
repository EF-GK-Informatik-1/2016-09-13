    public void aufgabe1() {
        drehe("rechts");
        for(int i = 0; i<2; i++) { 
            for(int j = 0; j < 4; j++) fahre(); 
            if(i == 0) {
                analysiereGestein();
                drehe("rechts");
                drehe("rechts");
            }
        }
        drehe("rechts");
        
    }