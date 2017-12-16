import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Mercadito {
    /**
     * @param args the command line arguments
     */
    public static int posicionUsuario =-1;
    public static ListaDE listaUsuarios = new ListaDE();
    public static ListaDE listaProductosUsuario = new ListaDE();
    public static String nombreUsuario = "";
    public static String mensajeMandadoUsuario = "";
    public static final String nombreListaU = "USUARIOS";
    public static final String NOMBRELISTACOMENTARIOS = "COMENTARIOS";
    public static ListaDE listaComentarios = new ListaDE();
    public static ListaDE listaWalmart = new ListaDE();
    public static ListaDE listaSoriana = new ListaDE();
    public static ListaDE listaAlsuper = new ListaDE();
    
    public static void main(String[] args) {
        
    }
    //METODO PARA LLENAR LA LISTA DE WALMART
    public static void llenarWalmart(){
    
      
        Producto café = new Producto("cafe", "nescafe", 77, 2);
        Nodo<Producto> nTemp = new Nodo(café);
        listaWalmart.agregarNodo(nTemp);
        
        Producto panblancobimbo = new Producto("pan blanco bimbo", "bimbo", 30, 2);
        Nodo<Producto> nTemp2 = new Nodo(panblancobimbo);
        listaWalmart.agregarNodo(nTemp2);
        
        Producto lecheentera = new Producto("leche", "Lala", 17, 2);
        Nodo<Producto> nTemp3 = new Nodo(lecheentera);
        listaWalmart.agregarNodo(nTemp3);
        
        Producto mantequilla = new Producto("mantequilla", "sin sal lala", 11.50, 2);
        Nodo<Producto> nTemp4 = new Nodo(mantequilla);
        listaWalmart.agregarNodo(nTemp4);
        
        Producto huevoblanco= new Producto("huevo", "san juan",50.50, 2);
        Nodo<Producto> nTemp5 = new Nodo(huevoblanco);
        listaWalmart.agregarNodo(nTemp5);
        
        Producto crema= new Producto("crema", "lala", 46, 2);
        Nodo<Producto> nTemp6 = new Nodo(crema);
        listaWalmart.agregarNodo(nTemp6);
        
        Producto naranja= new Producto("naranja", "valencia", 15.90, 0);
        Nodo<Producto> nTemp7 = new Nodo(naranja);
        listaWalmart.agregarNodo(nTemp7);
        
        Producto limon= new Producto("limon", "limon agrio", 25.90, 0);
        Nodo<Producto> nTemp8 = new Nodo(limon);
        listaWalmart.agregarNodo(nTemp8);
        
        Producto manzana= new Producto("manzana", "red delicious", 39.90, 0);
        Nodo<Producto> nTemp9 = new Nodo(manzana);
        listaWalmart.agregarNodo(nTemp9);
        
        Producto plátano = new Producto("platano", "chiapas", 13.90, 0);
        Nodo<Producto> nTemp10 = new Nodo(plátano);
        listaWalmart.agregarNodo(nTemp10);
        
        Producto papaya= new Producto("papaya", "maradol",27.90, 0);
        Nodo<Producto> nTemp11 = new Nodo(papaya);
        listaWalmart.agregarNodo(nTemp11);
        
        Producto uva= new Producto("uva", "roja sin semilla", 59, 0);
        Nodo<Producto> nTemp12 = new Nodo(uva);
        listaWalmart.agregarNodo(nTemp12);
        
        Producto chiledelarbol= new Producto("chile del arbol", "verde valle", 20, 2);
        Nodo<Producto> nTemp13 = new Nodo(chiledelarbol);
        listaWalmart.agregarNodo(nTemp13);
        
        Producto piernaymuslodepollo = new Producto("pierna y muslo de pollo", "bachoco", 34, 1);
        Nodo<Producto> nTemp14 = new Nodo(piernaymuslodepollo);
        listaWalmart.agregarNodo(nTemp14);
        
        Producto pechugadepollo= new Producto("pechuga de pollo", "bachoco", 114, 1);
        Nodo<Producto> nTemp15 = new Nodo(pechugadepollo);
        listaWalmart.agregarNodo(nTemp15);
        
        Producto costilladecerdo= new Producto("costilla de cerdo", "pork loin", 114, 1);
        Nodo<Producto> nTemp16 = new Nodo(costilladecerdo);
        listaWalmart.agregarNodo(nTemp16);
        
        Producto carnemolida= new Producto("carne molida", "premium", 152, 1);
        Nodo<Producto> nTemp17 = new Nodo(carnemolida);
        listaWalmart.agregarNodo(nTemp17);
        
        Producto chuletadecostilla= new Producto("chuleta de costilla", "premium", 219, 1);
        Nodo<Producto> nTemp18 = new Nodo(chuletadecostilla);
        listaWalmart.agregarNodo(nTemp18);
        
        Producto pescado= new Producto("pescado", "sierra del golfo", 89, 1);
        Nodo<Producto> nTemp19 = new Nodo(pescado);
        listaWalmart.agregarNodo(nTemp19);
        
        Producto atun= new Producto("atun", "herdez", 18.50, 2);
        Nodo<Producto> nTemp20 = new Nodo(atun);
        listaWalmart.agregarNodo(nTemp20);
        
        Producto arroz = new Producto("arroz", "verde valle super extra", 22.50, 2);
        Nodo<Producto> nTemp21 = new Nodo(arroz);
        listaWalmart.agregarNodo(nTemp21);
        
        Producto frijol= new Producto("frijol", "verde valle", 30, 2);
        Nodo<Producto> nTemp22 = new Nodo(frijol);
        listaWalmart.agregarNodo(nTemp22);
        
        
        Producto azucar= new Producto("azucar", "zulka", 54, 2);
        Nodo<Producto> nTemp23 = new Nodo(azucar);
        listaWalmart.agregarNodo(nTemp23);
        
        Producto consome= new Producto("consome", "knorr", 7, 2);
        Nodo<Producto> nTemp24 = new Nodo(consome);
        listaWalmart.agregarNodo(nTemp24);
        
        Producto galletassaladas= new Producto("galletas saladas", "saladitas", 40, 2);
        Nodo<Producto> nTemp25 = new Nodo(galletassaladas);
        listaWalmart.agregarNodo(nTemp25);
    
        Producto sal= new Producto("sal", "la fina", 8.90, 2);
        Nodo<Producto> nTemp26 = new Nodo(sal);
        listaWalmart.agregarNodo(nTemp26);
        
        Producto pimienta= new Producto("pimienta", "mccormick", 47.50, 2);
        Nodo<Producto> nTemp27= new Nodo(pimienta);
        listaWalmart.agregarNodo(nTemp27);
        
        Producto comino= new Producto("comino", "mccormick", 30, 2);
        Nodo<Producto> nTemp28 = new Nodo(comino);
        listaWalmart.agregarNodo(nTemp28);
        
        Producto canela= new Producto("canela", "el cuernito", 4.50, 2);
        Nodo<Producto> nTemp29 = new Nodo(canela);
        listaWalmart.agregarNodo(nTemp29);
        
        Producto cebolla= new Producto("cebolla", "blanca", 31.90, 2);
        Nodo<Producto> nTemp30 = new Nodo(cebolla);
        listaWalmart.agregarNodo(nTemp30);
        
        Producto zanahoria= new Producto("zanahoria", "simple", 19.50, 2);
        Nodo<Producto> nTemp31 = new Nodo(zanahoria);
        listaWalmart.agregarNodo(nTemp31);
        
        Producto polvoparaprepararbebida= new Producto("polvo para preparar bebida", "zuko", 3.80, 2);
        Nodo<Producto> nTemp32 = new Nodo(polvoparaprepararbebida);
        listaWalmart.agregarNodo(nTemp32);
        
        Producto cereal= new Producto("cereal", "nestle", 39.90, 2);
        Nodo<Producto> nTemp33 = new Nodo(cereal);
        listaWalmart.agregarNodo(nTemp33);
        
        Producto sopa= new Producto("sopa", "aurrera ", 3.10, 2);
        Nodo<Producto> nTemp34 = new Nodo(sopa);
        listaWalmart.agregarNodo(nTemp34);
        
        
        Producto espagueti= new Producto("espagueti", "moderna", 5.20, 2);
        Nodo<Producto> nTem35 = new Nodo(espagueti);
        listaWalmart.agregarNodo(nTem35);
        
        Producto maquinaparaafeitar= new Producto("maquina para afeitar", "gillette prestobarba", 20, 3);
        Nodo<Producto> nTemp35 = new Nodo(maquinaparaafeitar);
        listaWalmart.agregarNodo(nTemp35);
        
        Producto shampoo= new Producto("shampoo", "ego black", 63.50, 3);
        Nodo<Producto> nTemp36 = new Nodo(shampoo);
        listaWalmart.agregarNodo(nTemp36);
        
        
        Producto pastadental= new Producto("pasta dental", "colgate", 43.50, 3);
        Nodo<Producto> nTemp37 = new Nodo(pastadental);
        listaWalmart.agregarNodo(nTemp37);
        
        Producto papelhigienico= new Producto("papel higienico", "elite", 17.50, 3);
        Nodo<Producto> nTemp38 = new Nodo(papelhigienico);
        listaWalmart.agregarNodo(nTemp38);
        
        Producto pañuelos = new Producto("pañuelos", "kleenex", 14.50, 3);
        Nodo<Producto> nTemp39 = new Nodo(pañuelos);
        listaWalmart.agregarNodo(nTemp39);
        
        Producto cremad = new Producto("crema", "pond´s", 56, 2);
        Nodo<Producto> nTemp40 = new Nodo(cremad);
        listaWalmart.agregarNodo(nTemp40);
        
        Producto desodorantemasculino= new Producto("desodorante masculino", "stefano", 41.50, 3);
        Nodo<Producto> nTemp41 = new Nodo(desodorantemasculino);
        listaWalmart.agregarNodo(nTemp41);
        
        Producto desodorantefemenino= new Producto("desodorante femenino", "lady speed stick", 23, 3);
        Nodo<Producto> nTemp42 = new Nodo(desodorantefemenino);
        listaWalmart.agregarNodo(nTemp42);
        
        Producto cloro= new Producto("cloro", "cloralex", 21, 3);
        Nodo<Producto> nTemp43 = new Nodo(cloro);
        listaWalmart.agregarNodo(nTemp43);
        
        Producto pinol= new Producto("pinol", "pinol", 29.90, 3);
        Nodo<Producto> nTemp44 = new Nodo(pinol);
        listaWalmart.agregarNodo(nTemp44);
        
        Producto lavatrastes= new Producto("lavatrastes", "axion", 36.90, 3);
        Nodo<Producto> nTemp45 = new Nodo(lavatrastes);
        listaWalmart.agregarNodo(nTemp45);
       
        Producto deterjente= new Producto("deterjente", "finish", 99, 3);
        Nodo<Producto> nTemp46 = new Nodo(deterjente);
        listaWalmart.agregarNodo(nTemp46);
        
        Producto queso= new Producto("queso", "chichuahua", 125, 1);
        Nodo<Producto> nTemp47 = new Nodo(queso);
        listaWalmart.agregarNodo(nTemp47);
        
        Producto lentejas= new Producto("lentejas", "verde valle", 25.50, 2);
        Nodo<Producto> nTemp48 = new Nodo(lentejas);
        listaWalmart.agregarNodo(nTemp48);
        
        Producto papitas= new Producto("papitas", "sabritas", 36, 2);
        Nodo<Producto> nTemp49 = new Nodo(papitas);
        listaWalmart.agregarNodo(nTemp49);
        
        Producto mole= new Producto("mole", "doña maria ", 33, 2);
        Nodo<Producto> nTemp50 = new Nodo(mole);
        listaWalmart.agregarNodo(nTemp50);
    }
    //METODO PARA LLENAR LA LISTA DE WALMART
    public static void llenarAlsuper(){
        Producto huevos = new Producto("huevos", "bachoco", 56.90, 1);
        Nodo<Producto>  ATemp = new Nodo(huevos);
        listaAlsuper.agregarNodo(ATemp);
        
        Producto chuletas = new Producto("chuletas", "Del Cero", 84.90, 1);
        Nodo<Producto>  ATemp2 = new Nodo(chuletas);
        listaAlsuper.agregarNodo(ATemp2);
        
        Producto carnemolida = new Producto("carne molida", "premium", 79.90, 1);
        Nodo<Producto>  ATemp3 = new Nodo(carnemolida);
        listaAlsuper.agregarNodo(ATemp3);
       
        Producto pollo = new Producto("pollo", "super pollo", 59.90, 1);
        Nodo<Producto>  ATemp4 = new Nodo(pollo);
        listaAlsuper.agregarNodo(ATemp4);
        
        Producto pescado = new Producto("pescado", "el pecesito", 63.90, 1);
        Nodo<Producto>  ATemp5 = new Nodo(pescado);
        listaAlsuper.agregarNodo(ATemp5);
        
        Producto atunagua = new Producto("atun en agua", "en agua", 9.90, 1);
        Nodo<Producto>  ATemp6 = new Nodo(atunagua);
        listaAlsuper.agregarNodo(ATemp6);
        
        Producto atunaceite = new Producto("atun en aceite", "en aceite", 9.90, 1);
        Nodo<Producto>  ATemp7 = new Nodo(atunaceite);
        listaAlsuper.agregarNodo(ATemp7);
        
        Producto leche = new Producto("leche", "nutri leche", 14.90, 1);
        Nodo<Producto>  ATemp8 = new Nodo(leche);
        listaAlsuper.agregarNodo(ATemp8);
        
        Producto arroz = new Producto("arroz", "mimarca", 13.90, 1);
        Nodo<Producto> ATemp9 = new Nodo(arroz);
        listaAlsuper.agregarNodo(ATemp9);
        
        Producto  frijol= new Producto("frijol", "pinto", 16.90, 1);
        Nodo<Producto> ATemp10 = new Nodo(frijol);
        listaAlsuper.agregarNodo(ATemp10);
        
        Producto azucar = new Producto("azucar", "mimarca", 17.90, 1);
        Nodo<Producto> ATemp11 = new Nodo(azucar);
        listaAlsuper.agregarNodo(ATemp11);
        
        Producto sal = new Producto("sal", "salada", 10.90, 1);
        Nodo<Producto> ATemp12 = new Nodo(sal);
        listaAlsuper.agregarNodo(ATemp12);
        
        Producto pimienta = new Producto("pimienta", "pimi", 3.90, 2);
        Nodo<Producto> ATemp13 = new Nodo(pimienta);
        listaAlsuper.agregarNodo(ATemp13);
        
        Producto limon = new Producto("limon", "verde", 5.90, 0);
        Nodo<Producto> ATemp14 = new Nodo(limon);
        listaAlsuper.agregarNodo(ATemp14);
        
        Producto tomate = new Producto("tomate", "rojo", 13.90, 0);
        Nodo<Producto> ATemp15 = new Nodo(tomate);
        listaAlsuper.agregarNodo(ATemp15);
        
        Producto zanahoria = new Producto("zanahoria", "goku", 8.90, 0);
        Nodo<Producto> ATemp16 = new Nodo(zanahoria);
        listaAlsuper.agregarNodo(ATemp16);
        
        Producto papas = new Producto("papas", "ochoa", 8.90, 0);
        Nodo<Producto> ATemp17 = new Nodo(papas);
        listaAlsuper.agregarNodo(ATemp17);
        
        Producto cebolla = new Producto("cebolla", "blanca", 17.90, 1);
        Nodo<Producto> ATemp18 = new Nodo(cebolla);
        listaAlsuper.agregarNodo(ATemp18);
         
        Producto aceitecocina = new Producto("aceite de cocina", "123", 29.90, 1);
        Nodo<Producto> ATemp19 = new Nodo(aceitecocina);
        listaAlsuper.agregarNodo(ATemp19);
        
        Producto panblanco = new Producto("pan blanco", "blanco", 2.90, 1);
        Nodo<Producto> ATemp20 = new Nodo(panblanco);
        listaAlsuper.agregarNodo(ATemp20);
        
        Producto pan = new Producto("pan", "bimbo", 39.90, 1);
        Nodo<Producto> ATemp21 = new Nodo(pan);
        listaAlsuper.agregarNodo(ATemp21);
        
        Producto zuko = new Producto("zuko", "zuko", 4.90, 1);
        Nodo<Producto> ATemp22 = new Nodo(zuko);
        listaAlsuper.agregarNodo(ATemp22);
        
        Producto consome = new Producto("consome", "panchi", 10.90, 2);
        Nodo<Producto> ATemp23 = new Nodo(consome);
        listaAlsuper.agregarNodo(ATemp23);
        
        Producto cereal = new Producto("cereal", "nesquik", 40.90, 2);
        Nodo<Producto> ATemp24 = new Nodo(cereal);
        listaAlsuper.agregarNodo(ATemp24);
        
        Producto cereal2 = new Producto("cereal", "zucaritas", 50.90, 2);
        Nodo<Producto> ATemp25 = new Nodo(cereal2);
        listaAlsuper.agregarNodo(ATemp25);
        
        Producto cereal3 = new Producto("cereal", "kellogs", 35.90, 2);
        Nodo<Producto> ATemp26 = new Nodo(cereal3);
        listaAlsuper.agregarNodo(ATemp26);
        
        Producto chocomilk = new Producto("chocomilk", "pancho pantera", 60.90, 2);
        Nodo<Producto> ATemp27 = new Nodo(chocomilk);
        listaAlsuper.agregarNodo(ATemp27);
        
         Producto apio = new Producto("apio", "pa el clamato", 1.90, 0);
        Nodo<Producto> ATemp28 = new Nodo(cereal);
        listaAlsuper.agregarNodo(ATemp28);
        
         Producto chocomilk2 = new Producto("chocomilk", "el dinosaurio", 15.90, 2);
        Nodo<Producto> ATemp29 = new Nodo(chocomilk2);
        listaAlsuper.agregarNodo(ATemp29);
        
         Producto chile = new Producto("chile", "amor", 7.90, 0);
        Nodo<Producto> ATemp30 = new Nodo(chile);
        listaAlsuper.agregarNodo(ATemp30);
        
         Producto chilaca = new Producto("chilaca", "chihuahua", 8.80, 0);
        Nodo<Producto> ATemp31 = new Nodo(chilaca);
        listaAlsuper.agregarNodo(ATemp30);
        
        Producto cafe= new Producto("cafe", "nescafe",.90, 2);
        Nodo<Producto> ATemp32 = new Nodo(cafe);
        listaAlsuper.agregarNodo(ATemp32);
        
         Producto sopa = new Producto("sopa", "de coditos", 4.90, 2);
        Nodo<Producto> ATemp33 = new Nodo(sopa);
        listaAlsuper.agregarNodo(ATemp33);
        
         Producto sopa2 = new Producto("sopa", "estrellas", 3.90, 2);
        Nodo<Producto> ATemp34 = new Nodo(sopa2);
        listaAlsuper.agregarNodo(ATemp34);
        
         Producto sopa3 = new Producto("sopa", "moñitos", 3.90, 2);
        Nodo<Producto> ATemp35 = new Nodo(sopa3);
        listaAlsuper.agregarNodo(ATemp35);
        
         Producto sopa4 = new Producto("sopa", "letras", 3.90, 2);
        Nodo<Producto> ATemp36 = new Nodo(sopa4);
        listaAlsuper.agregarNodo(ATemp36);
        
         Producto pasta = new Producto("pasta", "spaguetti", 15.90, 2);
        Nodo<Producto> ATemp37 = new Nodo(pasta);
        listaAlsuper.agregarNodo(ATemp37);
        
         Producto shampoo = new Producto("champu", "palmolive", 36.90, 3);
        Nodo<Producto> ATemp38 = new Nodo(shampoo);
        listaAlsuper.agregarNodo(ATemp38);
        
         Producto desodorante = new Producto("desodorante", "old spice", 50.90, 3);
        Nodo<Producto> ATemp39 = new Nodo(desodorante);
        listaAlsuper.agregarNodo(ATemp39);
        
         Producto jabontrastes = new Producto("jabon para los trastes", "salvo", 40.90, 3);
        Nodo<Producto> ATemp40 = new Nodo(jabontrastes);
        listaAlsuper.agregarNodo(ATemp40);
        
         Producto jaboncuerpo = new Producto("jabon para el cuerpo", "jabonzote", 6.90, 3);
        Nodo<Producto> ATemp41 = new Nodo(jaboncuerpo);
        listaAlsuper.agregarNodo(ATemp41);
        
         Producto rastrillo = new Producto("rastrillo", "gillette", 60.90, 3);
        Nodo<Producto> ATemp42 = new Nodo(rastrillo);
        listaAlsuper.agregarNodo(ATemp42);
        
         Producto detergente = new Producto("detergente", "downy", 38.90, 3);
        Nodo<Producto> ATemp43 = new Nodo(detergente);
        listaAlsuper.agregarNodo(ATemp43);
        
         Producto puredetomate = new Producto("pure de tomate", "tomax", 9.90, 3);
        Nodo<Producto> ATemp44 = new Nodo(puredetomate);
        listaAlsuper.agregarNodo(ATemp44);
        
         Producto mole = new Producto("mole", "doña maria", 25.90, 3);
        Nodo<Producto> ATemp45 = new Nodo(mole);
        listaAlsuper.agregarNodo(ATemp45);
        
         Producto papel = new Producto("papel", "petalo", 6.90, 3);
        Nodo<Producto> ATemp46 = new Nodo(papel);
        listaAlsuper.agregarNodo(ATemp46);
        
         Producto servilletas = new Producto("servilletas", "mimarca", 12.90, 3);
        Nodo<Producto> ATemp47 = new Nodo(servilletas);
        listaAlsuper.agregarNodo(ATemp47);
       
         Producto manzana = new Producto("manzanas", "roja", 20.90, 0);
        Nodo<Producto> ATemp48 = new Nodo(manzana);
        listaAlsuper.agregarNodo(ATemp48);
            
         Producto platano = new Producto("platano", "meagarras", 19.90, 0);
        Nodo<Producto> ATemp50 = new Nodo(platano);
        listaAlsuper.agregarNodo(ATemp50);
        
         Producto papaya = new Producto("papaya", "naranja", 0.90, 0);
        Nodo<Producto> ATemp51 = new Nodo(papaya);
        listaAlsuper.agregarNodo(ATemp51);
        
         Producto pastadedientes = new Producto("pasta de dientes", "colgate", 30.90, 0);
        Nodo<Producto> ATemp52 = new Nodo(pastadedientes);
        listaAlsuper.agregarNodo(ATemp52);
        
         Producto desodorante2 = new Producto("desodorante", "axe", 50.90, 3);
        Nodo<Producto> ATemp53 = new Nodo(desodorante2);
        listaAlsuper.agregarNodo(ATemp53);
        
         Producto cremacuerpo = new Producto("crema", "real", 30.90, 3);
        Nodo<Producto> ATemp54 = new Nodo(cremacuerpo);
        listaAlsuper.agregarNodo(ATemp54);
       
         Producto cremacomer = new Producto("crema", "lala", 29.90, 2);
        Nodo<Producto> ATemp55 = new Nodo(cremacomer);
        listaAlsuper.agregarNodo(ATemp55);
        
         Producto cloro = new Producto("cloro", "cloralex", 9.90, 3);
        Nodo<Producto> ATemp56 = new Nodo(cloro);
        listaAlsuper.agregarNodo(ATemp56);
        
         Producto pinol = new Producto("pinol", "pinol", 28.90, 0);
        Nodo<Producto> ATemp57 = new Nodo(pinol);
        listaAlsuper.agregarNodo(ATemp57);
        
        Producto amonia = new Producto("amonia", "amonio", 666.66, 3);
        Nodo<Producto> ATemp58 = new Nodo(amonia);
        listaAlsuper.agregarNodo(ATemp58);
        
        Producto tortillas = new Producto("tortillas", "caseras", 18.90, 2);
        Nodo<Producto> ATemp59 = new Nodo(tortillas);
        listaAlsuper.agregarNodo(ATemp59);
        
        Producto winni = new Producto("winni", "chimex", 30.90, 1);
        Nodo<Producto> ATemp60 = new Nodo(winni);
        listaAlsuper.agregarNodo(ATemp60);
        
        Producto salchicha = new Producto("salchicha", "chimex", 60.90, 1);
        Nodo<Producto> ATemp61 = new Nodo(salchicha);
        listaAlsuper.agregarNodo(ATemp61);
        
        Producto jamon = new Producto("jamon", "chimex", 70.90, 1);
        Nodo<Producto> ATemp63 = new Nodo(jamon);
        listaAlsuper.agregarNodo(ATemp63);
        
        Producto queso = new Producto("queso", "camargo", 90.90, 1);
        Nodo<Producto> ATemp64 = new Nodo(queso);
        listaAlsuper.agregarNodo(ATemp64);
        
        Producto saladas = new Producto("saladas", "saladitas", 15.90, 2);
        Nodo<Producto> ATemp65 = new Nodo(saladas);
        listaAlsuper.agregarNodo(ATemp65);
        
        Producto galletas = new Producto("galletas", "emperador", 18.90, 2);
        Nodo<Producto> ATemp66 = new Nodo(galletas);
        listaAlsuper.agregarNodo(ATemp66);
        
        Producto lentejas = new Producto("lentejas", "mimarca", 10.90, 2);
        Nodo<Producto> ATemp67 = new Nodo(lentejas);
        listaAlsuper.agregarNodo(ATemp67);
        
        Producto puredepapa = new Producto("pure de papa", "mi marca", 20.90, 2);
        Nodo<Producto> ATemp68 = new Nodo(puredepapa);
        listaAlsuper.agregarNodo(ATemp68);
        
        Producto trapos = new Producto("trapos", "trapitos", 15.90, 3);
        Nodo<Producto> ATemp69 = new Nodo(trapos);
        listaAlsuper.agregarNodo(ATemp69);
        
        Producto soda = new Producto("soda", "cocacola", 31.90, 2);
        Nodo<Producto> ATemp70 = new Nodo(soda);
        listaAlsuper.agregarNodo(ATemp70);
        
        Producto jugo = new Producto("jugo", "jumex",19.90, 2);
        Nodo<Producto> ATemp71 = new Nodo(jugo);
        listaAlsuper.agregarNodo(ATemp71);
        
        Producto cerbeza = new Producto("cerbeza", "indio", 11.90, 2);
        Nodo<Producto> ATemp72 = new Nodo(cerbeza);
        listaAlsuper.agregarNodo(ATemp72);
        
        Producto hielo = new Producto("hielo", "pinguino", 10.90, 2);
        Nodo<Producto> ATemp73 = new Nodo(hielo);
        listaAlsuper.agregarNodo(ATemp73);
        
        Producto salsa = new Producto("salsa", "maggi", 60.90, 2);
        Nodo<Producto> ATemp74 = new Nodo(salsa);
        listaAlsuper.agregarNodo(ATemp74);
        
        Producto desechables = new Producto("desechables", "mimarca", 10.90, 2);
        Nodo<Producto> ATemp75 = new Nodo(desechables);
        listaAlsuper.agregarNodo(ATemp75);
        
        Producto chicharo = new Producto("chicharo", "chicharo", 10.90, 2);
        Nodo<Producto> ATemp76 = new Nodo(chicharo);
        listaAlsuper.agregarNodo(ATemp76);
        
        Producto elotes = new Producto("elotes", "elotin", 2.90, 2);
        Nodo<Producto> ATemp77 = new Nodo(elotes);
        listaAlsuper.agregarNodo(ATemp77);
        
        Producto champiñones = new Producto("champiñones", "toat", 14.90, 2);
        Nodo<Producto> ATemp78 = new Nodo(champiñones);
        listaAlsuper.agregarNodo(ATemp78);
        
        Producto sardina = new Producto("sardina", "sardinota", 31.90, 2);
        Nodo<Producto> ATemp79 = new Nodo(sardina);
        listaAlsuper.agregarNodo(ATemp79);
        
        Producto hilodental = new Producto("hilo dental", "colgate", 40.90, 3);
        Nodo<Producto> ATemp80 = new Nodo(hilodental);
        listaAlsuper.agregarNodo(ATemp80);
        
        Producto cepillodedientes = new Producto("cepillo de dientes", "colgate", 25.90, 3);
        Nodo<Producto> ATemp81 = new Nodo(cepillodedientes);
        listaAlsuper.agregarNodo(ATemp81);
        
        Producto gel = new Producto("gel para el cabello", "ego", 16.90, 3);
        Nodo<Producto> ATemp82 = new Nodo(gel);
        listaAlsuper.agregarNodo(ATemp82);
        
        Producto cera = new Producto("cera", "ego", 47.90, 3);
        Nodo<Producto> ATemp83 = new Nodo(cera);
        listaAlsuper.agregarNodo(ATemp83);
        
        Producto aerosol = new Producto("aerosol", "paris", 75.90, 3);
        Nodo<Producto> ATemp84 = new Nodo(aerosol);
        listaAlsuper.agregarNodo(ATemp84);
        
        Producto acondicionador = new Producto("acondicionador", "loreal paris", 70.90, 3);
        Nodo<Producto> ATemp85 = new Nodo(acondicionador);
        listaAlsuper.agregarNodo(ATemp85);
        
        Producto cremaafeitar = new Producto("crema para afeitar", "yilet", 40.90, 3);
        Nodo<Producto> ATemp86 = new Nodo(cremaafeitar);
        listaAlsuper.agregarNodo(ATemp86);
    }
    //METODO PARA LLENAR LA LISTA DE WALMART
    public static void llenarSoriana(){
                Producto naranja1 = new Producto ("naranja", "el huertito", 25, 0);
        Nodo<Producto> nTemp1 = new Nodo(naranja1);
        listaSoriana.agregarNodo(nTemp1);
      
        Producto naranja2 = new Producto ("naranja", "el ranchito", 34, 0);
        Nodo<Producto> nTemp2 = new Nodo (naranja2);
        listaSoriana.agregarNodo(nTemp2);
         
        Producto manzana3 = new Producto ("manzana", "el rancho de don chuy", 24, 0);
        Nodo<Producto> nTemp3 = new Nodo (manzana3);
        listaSoriana.agregarNodo(nTemp3);
        
        Producto manzana4 = new Producto ("manzana", "la costeña", 15, 0);
        Nodo<Producto> nTemp4 = new Nodo(manzana4);
        listaSoriana.agregarNodo(nTemp4);
        
        Producto platano5 = new Producto ("platano", "el Huertito", 26, 0);
        Nodo<Producto> nTemp5 = new Nodo (platano5);
        listaSoriana.agregarNodo(nTemp5);
        
        Producto platano6 = new Producto ("platano", "granjita dorada", 36, 0);
        Nodo<Producto> nTemp6 = new Nodo (platano6);
        listaSoriana.agregarNodo (nTemp6);
        
        Producto pera7 = new Producto ("pera", "el rancho de don chuy", 38, 0);
        Nodo<Producto> nTemp7 = new Nodo (pera7);
        listaSoriana.agregarNodo(nTemp7);
        
        Producto pera8 = new Producto ("pera", "la costeña", 8,0);
        Nodo<Producto> nTemp8 = new Nodo (pera8);
        listaSoriana.agregarNodo(nTemp8);
        
        Producto durazno9 = new Producto ("durazno", "el huertito", 12.50, 0);
        Nodo<Producto> nTemp9 = new Nodo (durazno9);
        listaSoriana.agregarNodo(nTemp9);
        
        Producto fresa10 = new Producto ("fresa", "el rancho de don chuy", 35.99,0);
        Nodo<Producto> nTemp10 = new Nodo (fresa10);
        listaSoriana.agregarNodo(nTemp10);
        
        Producto fresa11 = new Producto ("fresa", "grajita dorada", 29.99,0);
        Nodo<Producto> nTemp11 = new Nodo (fresa11);
        listaSoriana.agregarNodo(nTemp11);
        
        Producto melon12 = new Producto ("melon", "la costeña", 18.50, 0);
        Nodo<Producto> nTemp12 = new Nodo (melon12);
        listaSoriana.agregarNodo(nTemp12);
       
        Producto melon13 = new Producto ("melon", "el huertito", 8.50, 0);
        Nodo<Producto> nTemp13 = new Nodo (melon13);
        listaSoriana.agregarNodo(nTemp13);
         
        Producto elote14 = new Producto ("elote", "el ranchito", 6, 0);
        Nodo<Producto> nTemp14 = new Nodo (elote14);
        listaSoriana.agregarNodo(nTemp14);
        
        Producto elote15 = new Producto ("elote", "moctezuma", 12, 0);
        Nodo<Producto> nTemp15 = new Nodo (elote15);
        listaSoriana.agregarNodo(nTemp15);
        
        Producto aguacate16 = new Producto ("aguacate", "la costeña", 35, 0);
        Nodo<Producto> nTemp16 = new Nodo (aguacate16);
        listaSoriana.agregarNodo(nTemp16);
        
        Producto cebolla17 = new Producto ("cebolla", "granjita dorada", 8.99, 0);
        Nodo<Producto> nTemp17 = new Nodo (cebolla17);
        listaSoriana.agregarNodo(nTemp17);
        
        Producto tomate18 = new Producto ("tomate", "el costeñito feliz", 10.50, 0);
        Nodo<Producto> nTemp18 = new Nodo (tomate18);
        listaSoriana.agregarNodo(nTemp18);
        
        Producto tomate19 = new Producto ("tomate", "el ranchito", 8.99, 0);
        Nodo<Producto> nTemp19 = new Nodo (tomate19);
        listaSoriana.agregarNodo(nTemp19);
        
        Producto limon20 = new Producto ("limon", "la costeña", 3.50, 0);
        Nodo<Producto> nTemp20 = new Nodo (limon20);
        listaSoriana.agregarNodo(nTemp20);
       
        Producto limon21 = new Producto ("limon", "el ranchito", 10.99, 0);
        Nodo<Producto> nTemp21 = new Nodo (limon21);
        listaSoriana.agregarNodo(nTemp21);
        
        Producto papas22 = new Producto ("papas", "la costeña", 11, 0);
        Nodo<Producto> nTemp22 = new Nodo(papas22);
        listaSoriana.agregarNodo(nTemp22);
        
        Producto papas23 =  new Producto ("papas", "granjita dorada", 4.99, 0);
        Nodo<Producto> nTemp23 = new Nodo(papas23);
        listaSoriana.agregarNodo(nTemp23);
        
        Producto chile24 = new Producto ("chile", "el rancho de don chuy", 2.99, 0);
        Nodo<Producto> nTemp24 = new Nodo (chile24);
        listaSoriana.agregarNodo(nTemp24);
        
        Producto chile25 = new Producto ("chile","la costeña", 12, 0);
        Nodo<Producto> nTemp25 = new Nodo (chile25);
        listaSoriana.agregarNodo(nTemp25);
        
        Producto jamon26 = new Producto ("jamon","fud", 25, 1);
        Nodo<Producto> nTemp26 = new Nodo(jamon26);
        listaSoriana.agregarNodo(nTemp26);
        
        Producto jamon27 = new Producto("jamon", "kir", 13.99, 1);
        Nodo<Producto> nTemp27 = new Nodo(jamon27);
        listaSoriana.agregarNodo(nTemp27);
        
        Producto peperoni28 = new Producto ("peperoni28", "fud", 32, 1);
        Nodo<Producto> nTemp28 = new Nodo (peperoni28);
        listaSoriana.agregarNodo(nTemp28);
        
        Producto salchicha29 = new Producto ("salchicha", " san rafael", 23.99, 1);
        Nodo<Producto> nTemp29 = new Nodo (salchicha29);
        listaSoriana.agregarNodo(nTemp29); 
        
        Producto huevos30 = new Producto ("huevos", "san rafael", 30.99, 1);
        Nodo<Producto> nTemp30 = new Nodo (huevos30);
        listaSoriana.agregarNodo(nTemp30);
        
        Producto chuletas31 = new Producto ("chuletas", "la res dorada", 55, 1);
        Nodo<Producto> nTemp31 = new Nodo (chuletas31);
        listaSoriana.agregarNodo(nTemp31);
        
        Producto carnemolida32 = new Producto ("carne molida", "san rafael", 34, 1);
        Nodo<Producto> nTemp32 = new Nodo (carnemolida32);
        listaSoriana.agregarNodo(nTemp32);
        
        Producto carnemolida33 = new Producto ("carne molida", "la res dorada", 32.99, 1);
        Nodo<Producto> nTemp33 = new Nodo (carnemolida33);
        listaSoriana.agregarNodo(nTemp33);
         
        Producto pollo34 = new Producto ("pollo", "pollito feliz", 38, 1);
        Nodo<Producto> nTemp34 = new Nodo (pollo34);
        listaSoriana.agregarNodo(nTemp34);
        
        Producto pescado35 = new Producto ("pescado", "pescadito", 32.99, 1);
        Nodo<Producto> nTemp35 = new Nodo (pescado35);
        listaSoriana.agregarNodo(nTemp35);
         
        Producto quesolaurel36 = new Producto ("queso", "laurel", 23.50, 1);
        Nodo<Producto> nTemp36 = new Nodo (quesolaurel36);
        listaSoriana.agregarNodo(nTemp36);
         
        Producto leche37 = new Producto ("leche", "nutrileche", 12.99, 1);
        Nodo<Producto> nTemp37 = new Nodo (leche37);
        listaSoriana.agregarNodo(nTemp37);
        
        Producto lechedeslactosada38 = new Producto ("leche deslactosada", "lala", 17.50, 1);
        Nodo<Producto> nTemp38 = new Nodo (lechedeslactosada38);
        listaSoriana.agregarNodo(nTemp38);
        
        Producto panblanco39 = new Producto ("pan blanco", "bombo", 23.99, 2);
        Nodo<Producto> nTemp39 = new Nodo (panblanco39);
        listaSoriana.agregarNodo(nTemp39);
        
        Producto atun40 = new Producto ("atun", "la aleta feliz", 12, 2);
        Nodo<Producto> nTemp40 = new Nodo (atun40);
        listaSoriana.agregarNodo(nTemp40);
        
        Producto atun41 = new Producto ("atun", "el barco", 10.99, 2);
        Nodo<Producto> nTemp41 = new Nodo (atun41);
        listaSoriana.agregarNodo(nTemp41);
        
        Producto arroz42 = new Producto ("arroz", "mi marca", 12.50, 2);
        Nodo<Producto> nTemp42 = new Nodo (arroz42);
        listaSoriana.agregarNodo(nTemp42);
        
        Producto arroz43 = new Producto ("arroz", "soriana", 9.99, 2);
        Nodo<Producto> nTemp43 = new Nodo (arroz43);
        listaSoriana.agregarNodo(nTemp43);
        
        Producto frijol44 = new Producto ("frijol", "mi marca", 10.99, 2);
        Nodo<Producto> nTemp44 = new Nodo (frijol44);
        listaSoriana.agregarNodo(nTemp44);
       
        Producto frijol45 = new Producto ("frijol", "soriana", 15.99, 2);
        Nodo<Producto> nTemp45 = new Nodo (frijol45);
        listaSoriana.agregarNodo(nTemp45);
        
        Producto azucar46 = new Producto ("azucar", "mi marca", 12.50, 2);
        Nodo<Producto> nTemp46 = new Nodo (azucar46);
        listaSoriana.agregarNodo(nTemp46);
        
        Producto azucar47 = new Producto ("azucar", "zulka", 15.99, 2);
        Nodo<Producto> nTemp47 = new Nodo (azucar47);
        listaSoriana.agregarNodo(nTemp47);
       
        Producto servilletas48 = new Producto ("servilletas", "esponjosas",10.50, 2);
        Nodo<Producto> nTemp48 = new Nodo (servilletas48);
        listaSoriana.agregarNodo(nTemp48);
        
        Producto sal49 = new Producto ("sal", "mar azul", 3.99, 2);
        Nodo<Producto> nTemp49 = new Nodo (sal49);
        listaSoriana.agregarNodo(nTemp49);
        
        Producto aceitedecocina50 = new Producto ("aceite de cocina", "123", 15.99, 2);
        Nodo<Producto> nTemp50 = new Nodo (aceitedecocina50);
        listaSoriana.agregarNodo(nTemp50);
        
        Producto caffe51 = new Producto ("caffe", "nescafe", 23, 2);
        Nodo<Producto> nTemp51 = new Nodo (caffe51);
        listaSoriana.agregarNodo(nTemp51);
        
        Producto puredetomate52 = new Producto ("pure de tomate", " la costeña", 12.99, 2);
        Nodo<Producto> nTemp52 = new Nodo (puredetomate52);
        listaSoriana.agregarNodo(nTemp52);
        
        Producto lentejas53 = new Producto ("lentejas", "la granjita", 8.99, 2);
        Nodo<Producto> nTemp53 = new Nodo (lentejas53);
        listaSoriana.agregarNodo(nTemp53);
        
        Producto zuko54 = new Producto ("zuko", "zuko", 2.99, 2);
        Nodo<Producto> nTemp54 = new Nodo (zuko54);
        listaSoriana.agregarNodo(nTemp54);
        
        Producto champu55 = new Producto ("champu", "loreal", 32, 3);
        Nodo<Producto> nTemp55 = new Nodo (champu55);
        listaSoriana.agregarNodo(nTemp55);
         
        Producto champu56 = new Producto ("champu", "el risueño", 29.99, 3);
        Nodo<Producto> nTemp56 = new Nodo (champu56);
        listaSoriana.agregarNodo(nTemp56);
        
        Producto desodorante57 = new Producto ("desodorante", "nivea", 23.50, 3);
        Nodo<Producto> nTemp57 = new Nodo (desodorante57);
        listaSoriana.agregarNodo(nTemp57);
        
        Producto pastadedientes58 = new Producto("pasta de dientes", "colgate", 17.50, 3);
        Nodo<Producto> nTemp58 = new Nodo (pastadedientes58);
        listaSoriana.agregarNodo(nTemp58);
        
        Producto pastadedientes59 = new Producto ("pasta de dientes", "el diente blanco", 29, 3);
        Nodo<Producto> nTemp59 = new Nodo (pastadedientes59);
        listaSoriana.agregarNodo(nTemp59);
        
        Producto rastrillos60 = new Producto ("rastrillos", "el filosito", 33.99, 3);
        Nodo<Producto> nTemp60 = new Nodo (rastrillos60);
        listaSoriana.agregarNodo(nTemp60);
        
        Producto rastrillos61 = new Producto ("rastrillos", "barba de oro", 23.99, 3);
        Nodo<Producto> nTemp61 = new Nodo (rastrillos61);
        listaSoriana.agregarNodo(nTemp61);
        
        Producto hilodental62 = new Producto ("hilo dental", "el diente blanco", 32.99, 3);
        Nodo<Producto> nTemp62 = new Nodo (hilodental62);
        listaSoriana.agregarNodo(nTemp62);
        
        Producto cepillodedientes63 = new Producto ("cepillo de dientes", "OBBM", 17.99, 3);
        Nodo<Producto> nTemp63 = new Nodo (cepillodedientes63);
        listaSoriana.agregarNodo(nTemp63);
        
        Producto cloro64 = new Producto ("cloro", "cloralex", 23.50, 3);
        Nodo<Producto> nTemp64 = new Nodo (cloro64);
        listaSoriana.agregarNodo(nTemp64);
        
        Producto acondicionador65 = new Producto ("acondicionador", "sedal", 28.99, 3);
        Nodo<Producto> nTemp65 = new Nodo (acondicionador65);
        listaSoriana.agregarNodo(nTemp65);
        
        Producto acondicionador66 = new Producto ("acondicionador", "pantene", 23.99, 3);
        Nodo<Producto> nTemp66 = new Nodo (acondicionador66);
        listaSoriana.agregarNodo(nTemp66);
         
        Producto pinol67 = new Producto("pinol", "mi piso limpio", 15, 3);
        Nodo<Producto> nTemp67 = new Nodo (pinol67);
        listaSoriana.agregarNodo(nTemp67);
        
        Producto pinol68 = new Producto ("pinol", "eficaz", 18.99, 3);
        Nodo<Producto> nTemp68 = new Nodo (pinol68);
        listaSoriana.agregarNodo(nTemp68);
        
        Producto tortillas69 = new Producto ("tortillas", "maizena", 8.99, 2);
        Nodo<Producto> nTemp69 = new Nodo (tortillas69);
        listaSoriana.agregarNodo(nTemp69);
        
        Producto cremaparacuerpo70 = new Producto ("crema para cuerpo", "dove", 13.50, 3);
        Nodo<Producto> nTemp70 = new Nodo (cremaparacuerpo70);
        listaSoriana.agregarNodo(nTemp70);
        
        Producto maizoro71 = new Producto ("maizoro", "special k", 35.99, 2);
        Nodo<Producto> nTemp71 = new Nodo (maizoro71);
        listaSoriana.agregarNodo(nTemp71);
        
        Producto maizoro72 = new Producto ("maizoro","azucaradas", 43, 2);
        Nodo<Producto> nTemp72 = new Nodo (maizoro72);
        listaSoriana.agregarNodo(nTemp72);
        
        Producto zanahoria73 = new Producto ("zanahoria", "el huertito", 12.99, 0);
        Nodo<Producto> nTemp73 = new Nodo (zanahoria73);
        listaSoriana.agregarNodo(nTemp73);
        
        Producto maizoro74 = new Producto ("maizoro", "cherrios", 45, 2);
        Nodo<Producto> nTemp74 = new Nodo (maizoro74);
        listaSoriana.agregarNodo(nTemp74);
        
        Producto mayonesa75 = new Producto ("mayonesa", "helmans", 23, 2);
        Nodo<Producto> nTemp75 = new Nodo (mayonesa75);
        listaSoriana.agregarNodo(nTemp75);
    }
}
/**
 * Esta clase es para tener control de los comentarios
 * nomUser(nombre del usuario que hizo el comentario)
 * comentario(el comentario que se va a guardar)
 * veredicto(el valor del comentario)
 * dia(el dia que se hizo el comentario)**No se implemento
 * @author jofie
 */
class Comentario implements Serializable {
    private String nomUser;
    private String comentario;
    private int veredicto; 
    private int dia ;

    public Comentario(String nomUser, String comentario) {
        this.nomUser = nomUser;
        this.comentario = comentario;
        veredicto = 3;
        dia = (new Date()).getDay();
    }
    
    public void aumentarVeredicto(){
        veredicto = veredicto + 1;
    }
    
    public void disminuirVeredicto(){
        veredicto = veredicto - 1;
    }

    public String getNomUser() {
        return nomUser;
    }

    public String getComentario() {
        return comentario;
    }

    public int getVeredicto() {
        return veredicto;
    }

    public int getDia() {
        return dia;
    }
    
}
/**
 * Clase para mantener el control de los usuarios
 * Nombre (nombre del usuario)
 * Apellido (apellido del usuario)
 * Contraseña (contraseña del usuario)
 * ultimaListaP (ultima lista de mandado que hizo el usuario)
 * listaProductos (lista que guarda los productos que esta haciendo)
 * @author jofie
 */
class User implements Serializable{
    private String Nombre;
    private String Apellido;
    private String Contraseña;
    private String ultimaListaP;
    private ListaDE listaProductos;

    public User(String Nombre, String Apellido, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Contraseña = Contraseña;
        ultimaListaP = "";
        listaProductos = new ListaDE();
    }

    public void setUltimaListaP(String ultimaListaP) {
        this.ultimaListaP = ultimaListaP;
    }

    public void setListaProductos(ListaDE listaNueva) {
        listaProductos = listaNueva;
    }

    public ListaDE getListaProductos() {
        return listaProductos;
    }
    
    
    
    public String getUltimaListaP() {
        return ultimaListaP;
    }
    
    
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getContraseña() {
        return Contraseña;
    }
    
}
/**
 * Clase para mantener control de los productos
 * Nombre(nombre del producto)
 * Marca(marca del producto)
 * Precio(precio del producto)
 * Clasificacion(clasificacion del producto)**No se implemento
 * @author jofie
 */
 class Producto implements Serializable{
     private String Nombre;
     private String Marca;
     private double Precio;
     /*
        0 Frutas y Verduras.
        1 Carnes frias, queso, jamon, etc.
        2 Cereles, papitas, cosas de la alacena, etc.
        3 Cosas de limpieza y del hogar, jabones, desodorantes, etc
     */
    private int clasificacion;
    
    
    public Producto(String nombre){
        Nombre = nombre;
        Marca = "";
        Precio = 0.0;
        clasificacion = -1;
                
    }
    
    public Producto(String Nombre, String Marca, double Precio, int clasificacion) {
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Precio = Precio;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getClasificacion() {
        return clasificacion;
    }
    
 }
class Nodo<T> implements Serializable{

    private T iVal;
    private Nodo nSIg;
    private Nodo nPrev;

    public Nodo() {
        iVal = null;
        nSIg = null;
        nPrev = null;
    }

    public Nodo(T valor) {
        iVal = valor;
        nSIg = null;
        nPrev = null;
    }

    public T getiVal() {
        return iVal;
    }

    public void setiVal(T iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSIg() {
        return nSIg;
    }

    public void setnSIg(Nodo nSIg) {
        this.nSIg = nSIg;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
}

class ListaDE implements Serializable{

    private Nodo nIni;
    private Nodo nFin;

    public ListaDE() {
        nIni = null;
        nFin = null;
    }

    public ListaDE(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void agregarNodo(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSIg(nNodo);//AGREGAMOS NUEVO NODO
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public void imprimirNodos() {
        if (nIni == null) {
            System.out.println("Lista Vacia"); // LISTA VACIA
        } else { //RECOOREMOS HASTA EL FINAL IMPRIMIENDO
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnSIg();
            }
        }
    }

    public void imprimirNodosInverso() {
        if (nIni == null) {
            System.out.println("Lista Vacia"); // LISTA VACIA
        } else { //RECOOREMOS HASTA EL FINAL IMPRIMIENDO
            Nodo nTemp = nFin;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnPrev();
            }
        }
    }

    public void vaciarLista() {
        nIni = null;
    }

    public int contarNodos() {
        int contador;
        if (nIni == null) {
            contador = 0;
        } else {
            contador = 0;
            Nodo nTemp = nIni;
            while (nTemp != null) {
                contador++;
                nTemp = nTemp.getnSIg();
            }
        }
        return contador;
    }

    public void insertarEn(int posicion, Nodo nInsertar) {
        //AL IGRESAR EN LA POSICION 0
        if (posicion == 0) {
            nInsertar.setnSIg(nIni);
            nIni.setnPrev(nInsertar);
            nIni = nInsertar;
        } //EN LA ULTIMA POSICION
        else if (posicion == contarNodos()) {
            agregarNodo(nInsertar);
        } //CUALQUIER OTRA POSICION
        else {
            int contador = 0;
            Nodo nTemp = nIni;
            while (contador < posicion - 1) {
                nTemp = nTemp.getnSIg();
                contador++;
            }
            nInsertar.setnSIg(nTemp.getnSIg());
            nInsertar.setnPrev(nTemp);
            nTemp.setnSIg(nInsertar);
            nTemp.setnPrev(nTemp.getnPrev());
        }
    }
    
    public Nodo get(int posicion) {
        int contador;

        Nodo nTemp = nIni;
        contador = 0;
        while (contador < posicion) {
            contador++;
            nTemp = nTemp.getnSIg();
        }
        return nTemp;
    }

}