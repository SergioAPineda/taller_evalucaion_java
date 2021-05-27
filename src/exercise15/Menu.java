package exercise15;

public class Menu {
    private String options;
    private  int selection;
    private boolean showingMenu = true;

    public Menu(String options, int selection) {
        this.options = options;
        this.selection = selection;
    }

    public boolean isShowingMenu() {
        return showingMenu;
    }

    public void showMenu(){
        System.out.println(this.options);
    }

    public void answerSelection(){
        switch (this.selection){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7: {
                System.out.println("\nEscogio la opción "+this.selection+"\n");
                showMenu();
                break;
            }
            case 8:{
                System.out.println("\nEscogio la opción SALIR\n");
                this.showingMenu = false;
                break;
            }
            default:{
                System.out.println("\nSelección equivocada, seleccione una opcion del menú\n");
                showMenu();
                break;
            }
        }
    }
}
