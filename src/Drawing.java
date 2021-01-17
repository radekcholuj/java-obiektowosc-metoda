public class Drawing {
    void drawingProgram(int number, char drawing){

        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                System.out.print(drawing);
            }
            System.out.println("");
        }
    }
}

