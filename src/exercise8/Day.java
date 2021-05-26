package exercise8;

public class Day {
    private String dayName;

    public Day(String dayName) {
        this.dayName = dayName;
    }

    public void defineKindOfDay() {
        switch (this.dayName) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes": {
                System.out.println("Día laboral");
                break;
            }
            case "Sabado":
            case "Domingo": {
                System.out.println("Día no laboral");
                break;
            }
        }
    }
}
