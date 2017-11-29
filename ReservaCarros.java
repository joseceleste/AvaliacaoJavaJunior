package reservacarros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReservaCarros {

    public static void main(String[] args) {
    
    String segunda = "seg";
    String terca =  "ter";
    String quarta = "qua";
    String quinta = "qui";
    String sexta = "sex";
    String sabado = "sab";
    String domingo = "dom"; 
    
    int southCarSemanaNormal = 210;
    int southCarFdsNormal = 150;
    int westCarSemanaNormal = 530;
    int westCarFdsNormal = 150;
    int northCarSemanaNormal = 630;
    int northCarFdsNormal = 580;
    
    int southCarSemanaPremium = 200;
    int southCarFdsPremium = 90;
    int westCarSemanaPremium = 200;
    int westCarFdsPremium = 90;
    int northCarSemanaPremium = 600;
    int northCarFdsPremium = 590;
    
    int cont = 1;
    int soma1 = 0;
    int soma2 = 0;
    int soma3 = 0;
    int somaResult = 0;
    
    String loja = null;
    String carro = null;
    
    Scanner ler = new Scanner(System.in);
    String arquivo;
    System.out.printf("Informe o nome do arquivo texto a ser analisado:\n");
    arquivo = ler.next();
    
    try {
        try (FileReader arq = new FileReader(arquivo)) {
            BufferedReader lerArq = new BufferedReader(arq);
            
            String informacao = lerArq.readLine(); // lê a primeira linha
            String[] infor = informacao.split ((":"));
                String tipo_carro = infor[0];
                String quantidade = infor[1];
                int qtd = Integer.parseInt(quantidade);
                String datas = infor[2];
                               
                String [] semana = new String[3];
                
            for(int i = 0; semana.length > i; i++){
                semana = datas.split(",");
                String result;
                result = semana[i];
                String diaSemana = result.substring(10,13);
                                
                if((segunda.equals(diaSemana)) || (terca.equals(diaSemana)) || (quarta.equals(diaSemana)) || (quinta.equals(diaSemana)) || (sexta.equals(diaSemana))){
                    if("Normal".equals(tipo_carro)){
                        if(qtd <= 2){
                            soma1 = westCarSemanaNormal * cont;
                            soma2 = southCarSemanaNormal * cont;
                            soma3 = northCarSemanaNormal * cont;
                         
                            if(soma1 < soma2 && soma1 < soma3){
                                somaResult = soma1;
                                loja = "WestCar";
                                carro = "Ferrari";
                                
                            }
                            else if(soma2 < soma1 && soma2 < soma3){
                                somaResult = soma2;
                                loja = "SouthCar";
                                carro = "Gol";
                                
                            }
                            else if(soma3 < soma1 && soma3 < soma2){
                                somaResult = soma3;
                                loja = "NorthCar";
                                carro = "Navigator";
                                
                            }
                        }
                        else if (qtd > 2 && qtd <=4){
                            soma2 = southCarSemanaNormal * cont;
                            soma3 = northCarSemanaNormal * cont;
                            if(soma2 < soma3){
                                somaResult = soma2;
                                loja = "SouthCar";
                                carro = "Gol";
                                
                            }
                            else if(soma3 < soma2){
                                somaResult = soma3;
                                loja = "NorthCar";
                                carro = "Navigator";
                                
                            }
                        }
                        else if (qtd > 4 && qtd <=7){
                            soma3 = northCarSemanaNormal * cont;
                            somaResult = soma3;
                            loja = "NorthCar";
                            carro = "Navigator";
                            
                        }
                    }
                    else if("Premium".equals(tipo_carro)){
                        if(qtd <= 2){
                            soma1 = westCarSemanaPremium * cont;
                            soma2 = southCarSemanaPremium * cont;
                            soma3 = northCarSemanaPremium * cont;
                         
                            if(soma1 < soma2 && soma1 < soma3){
                                somaResult = soma1;
                                loja = "WestCar";
                                carro = "Ferrari";
                                
                            }
                            else if(soma2 < soma1 && soma2 < soma3){
                                somaResult = soma2;
                                loja = "SouthCar";
                                carro = "Gol";
                                
                            }
                            else if(soma3 < soma1 && soma3 < soma2){
                                somaResult = soma3;
                                loja = "NorthCar";
                                carro = "Navigator";
                                
                            }
                        }
                        else if (qtd > 2 && qtd <=4){
                            soma2 = southCarSemanaPremium * cont;
                            soma3 = northCarSemanaPremium * cont;
                            
                            if(soma2 < soma3){
                                somaResult = soma2;
                                loja = "SouthCar";
                                carro = "Gol";
                                
                            }
                            else if(soma3 < soma2){
                                somaResult = soma3;
                                loja = "NorthCar";
                                carro = "Navigator";
                                
                            }
                        }
                        else if (qtd > 4 && qtd <=7){
                            soma3 = northCarSemanaPremium * cont;
                            somaResult = soma3;
                            loja = "NorthCar";
                            carro = "Navigator";
                        }
                    }
                }
                else if((sabado.equals(diaSemana)) || (domingo.equals(diaSemana))){
                    if("Normal".equals(tipo_carro)){
                        if(qtd <= 2){
                            soma1 = westCarFdsNormal * cont;
                            soma2 = southCarFdsNormal * cont;
                            soma3 = northCarFdsNormal * cont;
                            if(soma1 < soma2 && soma1 < soma3){
                                somaResult = soma1;
                                loja = "WestCar";
                                carro = "Ferrari";
                                
                            }
                            else if(soma2 < soma1 && soma2 < soma3){
                                somaResult = soma2;
                                loja = "SouthCar";
                                carro = "Gol";
                                
                            }
                            else if(soma3 < soma1 && soma3 < soma2){
                                somaResult = soma3;
                                loja = "NorthCar";
                                carro = "Navigator";
                                
                            }
                        }
                        else if (qtd > 2 && qtd <=4){
                            soma2 = southCarFdsNormal * cont;
                            soma3 = northCarFdsNormal * cont;
                            if(soma2 < soma3){
                                somaResult = soma2;
                                loja = "SouthCar";
                                carro = "Gol";
                                
                            }
                            else if(soma3 < soma2){
                                somaResult = soma3;
                                loja = "NorthCar";
                                carro = "Navigator";
                                
                            }
                        }
                        else if (qtd > 4 && qtd <=7){
                            soma3 = northCarFdsNormal * cont;
                            somaResult = soma3;
                            loja = "NorthCar";
                            carro = "Navigator";
                            
                        }
                    }
                    else if("Premium".equals(tipo_carro)){
                        if(qtd <= 2){
                            soma1 = westCarFdsPremium * cont;
                            soma2 = southCarFdsPremium * cont;
                            soma3 = northCarFdsPremium * cont;
                            if(soma1 < soma2 && soma1 < soma3){
                                somaResult = soma1;
                                loja = "WestCar";
                                carro = "Ferrari";
                                
                            }
                            else if(soma2 < soma1 && soma2 < soma3){
                                somaResult = soma2;
                                loja = "SouthCar";
                                carro = "Gol";
                                
                            }
                            else if(soma3 < soma1 && soma3 < soma2){
                                somaResult = soma3;
                                loja = "NorthCar";
                                carro = "Navigator";
                                
                            }
                        }
                        else if (qtd > 2 && qtd <=4){
                            soma2 = southCarFdsPremium * cont;
                            soma3 = northCarFdsPremium * cont;
                            if(soma2 < soma3){
                                somaResult = soma2;
                                loja = "SouthCar";
                                carro = "Gol";
                                
                            }
                            else if(soma3 < soma2){
                                somaResult = soma3;
                                loja = "NorthCar";
                                carro = "Navigator";
                                
                            }
                        }
                        else if (qtd > 4 && qtd <=7){
                            soma3 = northCarFdsPremium * cont;
                            somaResult = soma3;
                            loja = "NorthCar";
                            carro = "Navigator";
                            
                        }
                    }
                }
                cont = cont + 1;
            }
        }
        System.out.println("\nSua melhor opção é: "+carro+":"+loja);
        System.out.println("\nTotal da locação é: R$ "+somaResult+",00");
    } 
    catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
  
}
  
}
