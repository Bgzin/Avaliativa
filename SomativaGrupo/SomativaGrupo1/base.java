package SomativaGrupo1;

import java.util.Scanner;



public class base {
    Scanner sc = new Scanner(System.in); 
    
public void imc2() {

System.out.println("Qual sua idade");
double idade = sc.nextDouble();
System.out.println("Qual seu genero? 1-feminino 2-masculino");
double genero = sc.nextDouble();
System.out.println("Qual sua altura? em cm");
double altura = sc.nextDouble();
System.out.println("Qual seu peso? em kg" );
double peso = sc.nextDouble();
altura /=100;
double imcF = peso / (altura * altura);
double imcM = peso / (altura * altura);



if (genero==1){
  altura*=100;
    double pesoIdealF= 52 + (0.75 *(altura - 152.4));
    System.out.println("O seu peso ideal é " + pesoIdealF + "Kg's");
  if( peso<pesoIdealF){
    System.out.println("Voce precisa engordar " + (pesoIdealF-peso)+ "Kg's");}

    else{System.out.println("Voce precisa emagrecer " + (peso-pesoIdealF)+ "Kg's");

    }
  }if(genero==2){
    altura*=100;
    double pesoIdealM= 52 + (0.92 *(altura - 152.4));
    System.out.println("O seu peso ideal é " + pesoIdealM + "Kg's");
    if( peso<pesoIdealM){
      System.out.println("Voce precisa engordar " + (pesoIdealM-peso)+ "Kg's");}
  
      else{System.out.println("Voce precisa emagrecer " + (peso-pesoIdealM)+ "Kg's");
   }
   
   }
  System.out.println("Agora iremos calcular o Seu IMC");
  if(genero==1){
    System.out.println("o seu IMC é de " + imcF);
  }else{
    System.out.println("o seu IMC é de " +imcM);

    

  }if(imcF<20 && idade>16 && idade<25){
    System.out.println("Voce Esta abaixo do peso recomendados que pratique algum esporte relacionado á LUTA");

  }
  double faixaEtaria = idade;  
  System.out.println("Faixa Etaria"+ faixaEtaria);
   
 

}
}




 
 

  