public class Start {

    // Définition de lvar1 fonction main
    public static void main(String[] args){
        Pile my_pile = new Pile();
        int var1 = 0, var2 = 0, res = 0;;
        // Affichage du commentaire Hello world dans la fenêtre de commande
        for(int i=0 ; i < args.length ; i++){
            try{
                my_pile.empiler(Integer.parseInt(args[i]));
            }catch(NumberFormatException e){
                var1 = my_pile.sommet();
                my_pile.depiler();
                var2 = my_pile.sommet();
                my_pile.depiler();
                switch(args[i]){ 
                    case "+": res = var1 + var2; break;
                    case "-": res = var1 - var2; break;
                    case "x": res = var1 * var2; break;
                    case "/": res = var2 / var1; break;
                }
                my_pile.empiler(res);
            }
        }
        System.out.println("Le résultat est : "+res);
    }

}