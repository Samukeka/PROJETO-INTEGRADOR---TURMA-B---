package com.mycompany.projeto_integrador;

import java.util.Scanner;

public class Projeto_integrador {
    
    
    static int bloqueio_arquibancadas = 0;
    static int bloqueio_academia = 0;
    static int bloqueio_quadra = 0;
    static int bloqueio_chefe = 0;
    static int chave = 0;
    static int remo = 0;
    static int solitaria = 1;
    static int bloqueio_codigo = 0;
    static int honra = 0;
    static int remedio = 0;
    static int cont = 0;
    static int repete_fase4e5 = 0;
    
    public static void main(String[] args) {
        
       int loop;
     
        fase1();
        fase2();
        fase3();
        do{   
        int r_menu4 = fase4();
        int ultima = controlador_ambientes(r_menu4);
        loop = ultima;
        }while(loop != 6);
        fase5();
        
        if(repete_fase4e5 == 1){
            
        do{   
        int r_menu4 = fase4();
        int ultima = controlador_ambientes(r_menu4);
        loop = ultima;
        }while(loop != 6);
        fase5();
        
        }
        
        
     
        
      
        
       
    }
    
    
    public static void fase1 (){
        
        System.out.println(" \t                                      Fase 1: A cela \n "); 
        System.out.println(" O sol bate em seu rosto, o barulho das gaivotas voando e do mar batendo nas rochas ao longe o despertam.\n Mais um dia surge na prisão de alcatraz, na noite anterior os guardas o haviam arrastado pelos corredores \n escuros da prisão e te lançado em uma cela pequena e úmida, o desespero de ter sido preso injustamente e o \n cansaço após o longo percurso até a prisão o deixaram exaustos, após uma noite conturbada de sono você acorda \n e pensa, o que me espera neste lugar? Você se levanta da cama sem saber ao certo o que fazer, uma coisa é certa... \n \n Você precisa FUGIR... \n \n  ");
        
        Scanner sc = new Scanner(System.in);
        int menu1;
        
        do{
        System.out.println("Escolha uma das opções:\n");
        System.out.println("1 - Olhar pela janela da cela");
        System.out.println("2 - Chamar o guarda");
        System.out.println("3 - Falar com o prisioneiro da cela a frente");
        System.out.println("\n Insira um valor (1-3): ");
        menu1 = sc.nextInt();
        
        if (menu1 == 1){
            System.out.println("\n Você enxerga o mar, ao longe um barco pequeno amarrado em um cais de madeira e uma praia deserta sem sinal de vida. \n");
        }
        
        else if(menu1 < 0 || menu1 > 3){
            System.out.println("\n Número inserido inválido. \n");   
        }
        
        }
        while( menu1 < 2 || menu1 > 3);
        
        switch (menu1){
            
            case 2: 
                
                System.out.println(" \n Você grita pelo guarda, ele aparece e diz: \n \n  - “então você finalmente acordou”  \n \n  ele abre a cela do prisioneiro da frente um homem ja de idade com semblante triste e apontando um rifle para vocês ordenando: \n \n  - “andem logo!” \n \n vocês são levados para o que parece ser um refeitório. \n ");
                break;
       
            case 3: 
                System.out.println(" \n Você chama pelo prisioneiro da cela a frente, um velho de mais ou menos uns 70 anos. \n \n - “Senhor vim parar aqui injustamente, sou inocente”  \n \n O velho sorri e responde:  \n \n - “todos nós somos inocentes filho...”  \n \n Você fica desapontado com a resposta do velho, mas fala: \n \n - “preciso sair daqui...”  \n \n O velho com desdém responde: \n \n - “É impossível fugir daqui, mas mesmo que conseguisse o mar é cheio de tubarões, não seria prudente ir a nado... enfim, estou com fome!” \n \n O velho se debruça para perto das grades e grita \n \n - “GUARDA! ANDE LOGO ESTOU COM FOME!” \n \n Um guarda aparece e abre a cela do velho e a sua, com um rifle na mão ele os obriga a seguir por um corredor até um lugar que parece um refeitório. \n ");
                break;
        }       
    }
   
    
    public static void fase2(){
        
        System.out.println("\n \n \n \t                                      Fase 2: O refeitório \n ");
        System.out.println("\n Ao chegar no refeitório você olha ao redor, diversos presos diferentes estão espalhados por ali, \n alguns estão sentados comendo, outros em pé, juntos em rodas de três ou quatro presos, eles cochicham \n enquanto olham pra você. Você entra na fila para pegar o café da manhã, ao chegar sua vez na sua bandeja é \n despejada uma mistura nojenta que a cozinheira diz ser mingau. Você se senta em uma mesa próxima, enquanto come \n sua refeição um prisioneiro branco, forte, com a cabeça raspada e uma cicatriz no olho direito se aproxima e diz: \n \n - “Ei, baixinho, me dê sua comida!” \n");
        
   int menu2;
   Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Escolha uma das opções:\n");
        System.out.println("1 - Entregar comida para o brutamontes ");
        System.out.println("2 - Não entregar a comida ");
        System.out.println("\n Insira um valor (1-2): ");
        menu2 = sc.nextInt();
        
        if(menu2 < 0 || menu2 > 2){
            System.out.println("\n Número inserido inválido.");   
        }
        
        }
        
        while( menu2 < 1 || menu2 > 2);
        
        switch (menu2){
            
            case 1: 
                
                System.out.println("\n -“Tome, já está quase acabando mesmo” \n \n Você entrega a bandeja a ele... Ele pega a bandeja e com um sorriso maldoso em um movimento rápido acerta ela em sua cabeça, \n você cai, tudo fica escuro... \n ");  
                honra = 1;
                break;
       
            case 2: 
                System.out.println("\n -“Não vou entregar nada seu idiota!” \n \n O brutamontes parte para cima de você, ele te agarra pelo pescoço, você tenta se desvencilhar, mas com um soco ele te apaga, tudo fica escuro... \n");
                honra = 2;
                break;
        }       
         

       
}
    
    public static void fase3(){
    
        System.out.println("\n \n \n \t                                      Fase 3: O ambulatório \n ");
    System.out.println(" Tudo está girando, você tenta abrir os olhos, mas sua cabeça dói. Quando finalmente consegue enxergar algo percebe que \n esta deitado em uma maca, uma enfermeira loira bem bonita aparece e olha para você: \n \n - “Parece que você se meteu em uma briga, fique deitado vou aplicar uma medicação para dor” \n \n Ela vai até um armário no canto da pequena sala em que vocês estão, abre a gaveta e pega uma agulha e um pequeno vidro \n com um líquido claro, ela extrai o medicamento do vidro e aplica no seu braço, uma sensação de alivio te preenche: \n \n - “Isso vai ajudar com a dor, vou te dar mais uns remédios para você ir tomando na semana quando sentir a dor voltando” \n \n Ela abre outra gaveta do armário, você enxerga dois potes de medicamento, ela pega um fecha a gaveta e te entrega: \n \n - “Segure isso, espere um pouco enquanto vou chamar o guarda”  \n \n  ");
    
    
       int menu3;
   Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Escolha uma das opções:\n");
        System.out.println("1 - Se levantar e pegar o outro pote de remédio na gaveta ");
        System.out.println("2 - Aguardar a enfermeira retornar ");
        System.out.println("\n Insira um valor (1-2): ");
        menu3 = sc.nextInt();
        
        if(menu3 < 1 || menu3 > 2){
            System.out.println("\n Número inserido inválido.");   
        }
        
        }
        
        while( menu3 < 1 || menu3 > 2);
        
        switch (menu3){
            
            case 1: 
                
                System.out.println("\n Você se levanta e abre a gaveta, pega o outro pote de remédios e guarda no bolso, você escuta os passos \n da enfermeira se aproximando com o guarda, você se deita novamente na maca, a porta se abre e o guarda ordena \n \n -“Ande logo prisioneiro! Se levanta daí!” \n \n Ele te leva por um outro corredor até um portão grande, ao abrir o portão você se depara com o pátio da prisão: \n \n -“boa sorte, você vai precisar...”  diz o guarda \n");  
                remedio = 2;
                break;
       
            case 2: 
                System.out.println("\n Você permanece deitado, a enfermeira volta com o guarda, a porta se abre e o guarda ordena “Ande logo prisioneiro! Se levanta daí!”, \n ele te leva por um outro corredor até um portão grande, ao passar pelo portão você se depara com o pátio da prisão \n \n");
                remedio = 1;
                break;
                
        }       

    }

    
    
    public  static int fase4(){
    
    for ( int i = 0; i == 1; i++){    
        System.out.println("\n \n \n \t                                      Fase 4: O pátio \n ");
        System.out.println("\n O pátio da prisão era um quadrado enorme, os presos se dividiam em pequenos grupos, alguns deles estavam sentados numa \n arquibancada no canto direito do pátio, outros malhavam em um tipo de academia improvisada com pesos de concreto do lado \n esquerdo e alguns jogavam basquete com uma bola meio murcha em uma quadra simples do outro lado do pátio... \n A sua frente encontrava-se um grande portão de ferro, que levava a saída da prisão, torres de vigia com guardas armados \n nos quatro cantos vigiavam os detentos, da saída ainda existia uma pequena porta com uma placa escrito “Sala do carcereiro chefe”. \n \n Você viu um velho se aproximando de você, era o prisioneiro da cela a frente: \n \n  -“Ei, filho, vi que você se meteu em uma confusão, aquele grandalhão foi parar na solitária, mas quando sair de lá vai matar você! \n   Sei que lá fora em algum lugar tem um barco, porém você vai precisar de um remo pois os guardas os trazem para cá para evitar fugas. \n   Espero que consiga fugir a tempo”  ");
    }
        
        Scanner sc = new Scanner(System.in);
        int r_menu4;
        
        do{
            System.out.println("Escolha uma das opções:\n");
            System.out.println("1 - Ir para as arquibancadas");
            System.out.println("2 - Ir para a academia");
            System.out.println("3 - Ir para a quadra de basquete");
            System.out.println("4 - Ir para a sala do carcereiro chefe");
            System.out.println("5 - Ir para a saída");
            System.out.println("\n Insira um valor (1-5): ");
            r_menu4 = sc.nextInt();
            
            if(r_menu4 > 5 || r_menu4 < 1){
                System.out.println("Número inserido inválido");
            }
            
        }while( r_menu4 < 1 || r_menu4 > 5);
        
        return r_menu4;
            
    }
    
    public static int controlador_ambientes(int r_menu4){
        
        int retorno = 0;
        
        switch(r_menu4){
            
            case 1:
                
                if(bloqueio_arquibancadas == 1){
                    
                    System.out.println("\n Você já conseguiu todas as informações necessárias neste ambiente \n");
                    
                    retorno = 0; 
                }
                else{
                arquibancadas();
                }
                
                break;
           
              
            case 2:
                
                   if(bloqueio_academia == 1){
                    
                    System.out.println("\n Você já conseguiu todas as informações necessárias neste ambiente \n");
                    
                    retorno = 0; 
                }
                else{
                academia();
                }
                
                break;
                
             
            case 3:
                
                   if(bloqueio_quadra == 1){
                    
                    System.out.println("\n Você já conseguiu todas as informações necessárias neste ambiente \n");
                    
                    retorno = 0; 
                }
                else{
                quadra();
                }
                
                break;
                
            case 4:
                
                  if(bloqueio_chefe == 1){
                    
                    System.out.println("\n Você já conseguiu todas as informações necessárias neste ambiente. \n \n Código para o portão de saída: '1945' \n");
                    
                    retorno = 0; 
                }
                else{
                chefe();
                }
                  
                  break;
                  
                  
                
            case 5:     
            
                retorno = saida();
               
                
                break;
     
        }

        return retorno;
        
        
        }
    
    
   
    public static int arquibancadas(){
        
        
        
        Scanner sc = new Scanner (System.in);
        
        int escolha;
        int contador = 0;
        int voltar_m4 = 0;
        int retorno = 0;

        switch(honra){

            // SEM HONRA:
            
            case 1:
              
           // MENU PRESO DICAS 1:   
           System.out.println("\n Você se aproxima das arquibancadas, um preso dos cabelos pretos longos e cara fechada olha para você e diz “Ei seu covarde, saia daqui não queremos pessoas como você por perto! Se você não luta nem pelo seu alimento não é digno de estar conosco”. \n ");     
                
            do{    

                do{
                System.out.println("\n Escolha uma das opções:\n");
                System.out.println("1 - “Desculpe senhor, mas preciso sair daqui de alguma forma, me ajude eu imploro!”");
                System.out.println("2 - “Tudo bem vou embora” - voltar para o pátio ");
                System.out.println("\n Insira um valor (1-2): ");
                escolha = sc.nextInt();
                
                if(escolha > 2 || escolha < 1){
                System.out.println("\n Número inserido inválido \n");
                
                }
                
                }while( escolha < 1 || escolha > 2 );
                
                //FUNÇÃO INSISTIR:
                
                switch(escolha){
                    
                    case 1: 
                        
                        if(contador == 0){
                        System.out.println("\n “Não vou te ajudar, saia daqui ande logo!” \n");
                        
                        contador++;
                        }
                        
                        else if (contador == 1){
                            System.out.println("\n “Como você é insistente, quer que eu te dê uma surra?!” \n");  
                        contador++;    
                        }
                            
                        else if (contador == 2){
                            System.out.println("\n “está bem! Sei que o carcereiro chefe guarda o código para o portão de saída em sua sala, \n sei que o código não está na prateleira de livros! Agora saia daqui antes que você se arrependa!” \n");    
                        contador++;
                        }
                        
                        else if (contador == 3){
                            System.out.println("“\n Já te disse o que sei, agora saia daqui!” \n");
                        }
                        
                        bloqueio_arquibancadas = 1;

                        break;
                   
                // FUNÇÃO VOLTAR PARA MENU 4:
                        
                    case 2: 
                        
                        retorno = 1;
                        voltar_m4 = 1;
                                
                        break;
              }
               
        }while(voltar_m4 != 1);

            break;
            

             // COM HONRA:
            
            case 2: 
                
            System.out.println("\n Você se aproxima das arquibancadas, um preso dos cabelos pretos longos e cara fechada olha para você e diz: \n \n -“Ei vi você enfrentar aquele cara grande lá no refeitório, você tem culhões, precisa de algo?”. \n");    
            
            do{    

                do{
                    
                System.out.println(" \n Escolha uma das opções:\n");
                System.out.println("1 - Preciso arranjar um jeito de sair daqui! você tem alguma informação?");
                System.out.println("2 - não preciso de nada, obrigado! - voltar para o pátio");
                System.out.println("\n Insira um valor (1-2): ");
                escolha = sc.nextInt();
                
                if(escolha > 2 || escolha < 1){
                System.out.println("\n Número inserido inválido \n");
                
                }
                
                }while( escolha < 1 || escolha > 2 );
                
                switch(escolha){
                    
                    case 1: 
                        if(contador == 0){
                        System.out.println("\n“O carcereiro chefe guarda o código para o portão de saída em sua sala, sei que o código não está na prateleira de livros nem dentro do armário de armas!” \n");
                        contador++;
                        }
                        else{
                            System.out.println("\n “ isso é tudo que sei amigo” \n");
                            bloqueio_arquibancadas = 1;
                        }
                    
                    break;
                
                    case 2: 
                        
                        retorno = 1;
                        voltar_m4 = 1;
                        
                        break;
  
                }

        }while (voltar_m4 != 1);
            
        break;

    }
        
        return retorno;
    
}
    
    
    public static int academia (){
        
        System.out.println("\n Você chega na academia, um homem grande a alto se aproxima de você: \n \n “Você não tem cara que malha com esses braços finos, deixa eu te perguntar, vi que você saiu do ambulatório por acaso você tem algum remédio? \n Caso tenha, nós podemos fazer uma troca, tenho algo que pode lhe interessar” \n \n Você olha para ele desconfiado, mas responde: \n ");
        
        
        Scanner sc = new Scanner (System.in);
        int retorno = 0, escolha, voltar_m4 = 0,contador = 0; 
        
        
    do{
       
    
        do{
        System.out.println("\n Escolha uma das opções: \n ");
        System.out.println("1 -  “Sim tenho " + remedio +" remédio(s)” - Realizar troca ");
        System.out.println("2 -  “Não tenho remédios” - voltar para o pátio");
        System.out.println("\n Insira um valor (1-2): ");
        escolha = sc.nextInt();
        
            if(escolha > 2 || escolha < 1){
            System.out.println("\n Número inserido inválido \n");
            }
            
        }while( escolha < 1 || escolha > 2 );
        
         switch(escolha){

                    case 1: 
                        
                        if(remedio == 0){
                            System.out.println("\n “Sem remédios sem ajuda... desculpe amigo!” \n");
                        }
                        
                        else{
                            
                        if(contador == 0){
                        System.out.println("\n “Aqui está a chave para a sala do carcereiro chefe, mas tome cuidado, pois se ele te pegar você pode ir parar na solitária ou até mesmo receber pena de morte” - você recebeu uma chave dourada \n");
                        chave = 1;
                        remedio--;
                        contador++;
                        
                        if(remedio == 0){
                            bloqueio_academia = 1;
                        }
                        }
                        
                        
                        else {
                           System.out.println(" \n “Sei que a senha para o portão de saída não está nem no Baú, nem no cofre do carcereiro chefe” \n");
                           remedio--;
                           bloqueio_academia = 1;
                        }
                        
                        }
                       
                    
                    break;
                
                    case 2: 
                        
                        retorno = 2;
                        voltar_m4 = 1;
                        
                        break;
                        
         }
                        
  }while(voltar_m4 != 1);  
       
 return retorno;   
}
    
public static int quadra(){
    
          
        System.out.println("\n Você se dirige até a quadra onde encontra um homem negro, magro e alto com o cabelo Black Power jogando. Ao tentar fazer uma cesta o homem acaba \n prendendo a bola entre o aro e a tabela, ele se dirige até uma parede próxima, pega um remo que estava encostada nela, com o remo ele remove a bola \n presa e continua a jogar... “É isso!!!” você pensa “preciso daquele remo para minha fuga!” Você se aproxima do homem e fala: \n \n “Com licença, preciso desse remo, posso pegá-lo?” \n \n  O homem olha de cima pra baixo para você e responde “Eu deixo você ficar com ele se você acertar minha pergunta”: \n \n 'Quantos jogadores participam de cada time em um jogo de basquete?'  ");
        
        
        Scanner sc = new Scanner (System.in);
        int retorno = 0, escolha, voltar_m4 = 0,contador = 0, resposta = 0; 
        
        
    do{
       
    
        do{
        System.out.println("\n Escolha uma das opções: \n ");
        System.out.println("1 -  “Eu aceito o desafio” ");
        System.out.println("2 -  “Ande me dê logo esse remo” - tomar a força ");
        System.out.println("3 -  Voltar para o pátio");
        System.out.println("\n Insira um valor (1-2): ");
        escolha = sc.nextInt();
        
            if(escolha > 3 || escolha < 1){
            System.out.println("\n Número inserido inválido \n");
            }
            
        }while( escolha < 1 || escolha > 3 );
        
         switch(escolha){

                    case 1: 
                        
                        if(bloqueio_quadra == 0){
                        
                        do{
                        
                        System.out.println("\n Insira uma resposta (Digite 0 para sair): \n");
                        resposta = sc.nextInt();
                        
                        if(resposta == 5){
                            System.out.println("\n “Parabéns amigo, você acertou! - Você recebeu um remo!” \n");
                            remo = 1;
                            bloqueio_quadra = 1;
                        }
                        else if(resposta == 0){
                            break;
                        }
                        else{
                            System.out.println("Resposta errada! (Digite 0 para sair)" );
                        }
                        
                        }while(resposta != 5);
                        }
                        else{
                            System.out.println("\n Você já venceu o desafio e conseguiu o remo \n");
                        }
                        
                        
                    break;
                
                    case 2: 
                        
                        if(remo == 0){
                        
                        System.out.println("\n Você tenta tomar o remo do homem negro, porém ele te da um soco, você revida, um tumulto começa e os guardas correm em sua direção...");
                        solitaria_game_over();
                        voltar_m4 = 1;
                        }
                        else{
                            System.out.println("\n Você já venceu o desafio e conseguiu o remo \n");
                        }
                        
                        break;
                        
                    case 3: 
                        
                        retorno = 3;
                        voltar_m4 = 1;
                        
                        break;
                        
         }
                        
  }while(voltar_m4 != 1);  
       
 return retorno;  
        
}


public static int chefe(){
    
    int sair = 0;
    
    System.out.println("\n Você se aproxima sorrateiramente para perto da porta da sala do carcereiro chefe:  \n ");
        
        
        Scanner sc = new Scanner (System.in);
        int retorno = 0, escolha = 0, opcao = 0 , voltar_m4 = 0,contador = 0, erro = 0; 
        
        
    do{
       
    
        do{
        System.out.println("\n Escolha uma das opções: \n ");
        System.out.println("1 - Abrir porta ");
        System.out.println("2 - Voltar para o pátio ");
        System.out.println("\n Insira um valor (1-2): ");
        escolha = sc.nextInt();
        
            if(escolha > 2 || escolha < 1){
            System.out.println("\n Número inserido inválido \n");
            }
            
        }while( escolha < 1 || escolha > 2 );
        
         switch(escolha){

             // Função fechadura 
             
                    case 1: 
                        
                        if(chave == 1){

                           if(bloqueio_codigo == 0){
                            
                            System.out.println("\n Você entra na sala do chefe, você precisa encontrar o código para o portão de saída caso queira fugir, \n você olha para o ambiente ");
                            do{
                            System.out.println("\n onde devo procurar:  \n \n");
                            System.out.println("1- Prateleira de livros ");
                            System.out.println("2- Armário de armas  ");
                            System.out.println("3- Escrivaninha ");
                            System.out.println("4- Baú  ");
                            System.out.println("5- Cofre  ");
                            opcao =  sc.nextInt();
                            
                            if(opcao == 3){
                                
                                System.out.println("\n \n  “Você encontra um caderno da capa vermelha, você o abre e encontra nele uma anotação”  \n \n");
                                System.out.println(" \n “Código do portão de saída: 1945”  \n ");
                                System.out.println(" \n Você sente que seu tempo está acabando... Sai da sala e volta para o pátio. \n ");
                                
                                sair = 1;
                                bloqueio_codigo = 1;
                                bloqueio_chefe = 1;
                            }
                            
                            else{
                                
                                if(erro < 3){
                                System.out.println(" \n Você procura mas não encontra nada! \n");
                                
                                erro++;
                                }
                                else{
                                    
                                    System.out.println(" \n Você procura mas não encontra nada! \n");
                                    System.out.println("\n O guarda chega e te pega na sala dele... \n");
                                    
                                    solitaria_game_over();
                                    retorno = 4;
                                    voltar_m4 = 1;
                                    sair =1;
                                }
                            }
                            
                            }while(sair != 1);
                                    
                                    }
                           else{
                               System.out.println("\n Você já conseguiu o código para o portão de saída: '1945' \n");
                               
                           }
                        }

                        else{
                            System.out.println("\n Você não tem a chave \n");
                        }

                    break;
                
                    case 2: 
   
                        retorno = 4;
                        voltar_m4 = 1;
                        
                        break;
                        
         }
                        
  }while(voltar_m4 != 1);  
       
 return retorno;  
 
}

public static int saida(){
    
    Scanner sc = new Scanner (System.in);
    
    int escolha = 0, senha = 0, voltar_m4 = 0, retorno = 0;
    
    System.out.println("\n Você chega próximo ao portão de saída, a liberdade está logo ali do outro lado do portão, \n basta apenas destravar o cadeado inserindo um código de 4 dígitos: ");
    
    do{
       do{
        System.out.println("\n Escolha uma das opções: \n ");
        System.out.println("1 -  Tentar inserir o código ");
        System.out.println("2 -  Voltar para o pátio ");
        System.out.println("\n Insira um valor (1-2): ");
        escolha = sc.nextInt();
        
            if(escolha > 2 || escolha < 1){
            System.out.println("\n Número inserido inválido \n");
            }
            
        }while( escolha < 1 || escolha > 2 );
       
       
       
       
       switch(escolha){

                    case 1: 
                        
                        do{
                        
                        System.out.println("INSIRA O CÓDIGO DE 4 DIGITOS  (Digite 0 para sair) :");
                        senha = sc.nextInt();
                        
                        if (senha == 1945){
                            
                            System.out.println("\n Você ouve o cadeado destravando... \n \n \n");
                            
                            retorno = 6;
                            voltar_m4 = 1;
  
                        }
                        else if (senha == 0){
                            
                            voltar_m4 = 1;
                        }
                        else{
                            
                            System.out.println("\n Codigo inserido incorreto! (Digite 0 para sair) \n");
                            
                            cont++;
                                    
                                if(cont == 3){
                                    
                                  System.out.println("\n \n \n Um guarda enxerga ao longe você tentando arrombar o cadeado e aciona o alarme, os guardas correm em sua direção...");
                                        
                                  solitaria_game_over();
                                  
                                  voltar_m4 = 1;
                                  
                                }
                            }
                        }while(voltar_m4 != 1);
                        
                        break;
                        
                    case 2: 
                    
                        retorno = 5;
                        voltar_m4 = 1;
                        
                        break;
       }
   
    }while(voltar_m4 != 1); 
    
    return retorno;
 
}

public static void fase5 (){
        
        System.out.println(" \t                                      Fase 5: A fuga \n "); 
        System.out.println(" Finalmente você consegue abrir o cadeado, o seu coração dispara, você está a um passo da liberdade. Você abre um pouco o portão \n e se esgueira para fora, você sente o vento batendo em seu rosto, neste momento você ouve um barulho ensurdecedor..\n \n  “O prisioneiro está fugindo!!!” - grita um guarda, as sirenes estão soando. \n \n Você corre atravessando uma ponte bem na saída da prisão, o barulho dos latidos dos cachorros e dos guardas correndo te amedrontam.\n Você se depara com uma praia e com um cais de madeira... \n \n Qual caminho tomar?  ");
        
        Scanner sc = new Scanner(System.in);
        int escolha, decisao_praia = 0, encerrar_menu_praia = 0;
        
        do{
        System.out.println("Escolha uma das opções:\n");
        System.out.println("1 - Seguir pela praia");
        System.out.println("2 - Seguir pelo cais");
        System.out.println("\n Insira um valor (1-2): ");
        escolha = sc.nextInt();
        
     if(escolha > 2 || escolha < 1){
            System.out.println("\n Número inserido inválido \n");
            }
            
        }while( escolha < 1 || escolha > 2 );
        
         switch(escolha){
             
             
             
             case 1:
             
                 do{
                     
                 
                 System.out.println("\n \n Você corre para a praia, mas não consegue ver nada além de areia e o mar, os guardas estão chegando. O que fazer? \n \n ");
                 System.out.println(" 1 - Entrar no mar e tentar fugir nadando ");
                 System.out.println(" 2 - Se render e esperar na areia ");
                 
                 decisao_praia = sc.nextInt();
                 
                 if(decisao_praia == 1){
                 
                 System.out.println("\n Ao entrar no mar você tenta nadar para longe da praia, quando sente algo estranho passando próximo de você com um calafrio \n você distingue aquilo que parece ser... não, não só parece, É UM TUBARÃO!!! Ele vem em sua direção e com uma mordida arranca sua perna direita, \n a água é tomada pela cor vermelha do seu sangue, o tubarão faz a volta e com outra mordida morde seu corpo, o  arrastando para o fundo do mar..\n ");
             
                 System.out.println(" \n \n \t                                            GAME OVER \n \n \n");
                 
                     System.exit(cont);
                 }
                 else if (decisao_praia == 2){
                         
                         System.out.println("\n Você deita na praia e espera os guardas te prenderem, se perguntando, o que irá acontecer... \n");
                         solitaria_game_over();
                         repete_fase4e5 = 1;
                         encerrar_menu_praia = 1;
                         
                         }
                 else{
                  System.out.println("\n Número inserido inválido \n");
                 }
                 
                 }while(encerrar_menu_praia != 1);
                 
                 break;
                 
                 
                 
             case 2:
                 
                 System.out.println("\n Você corre para o cais ao chegar no final dele se depara com um pequeno barco, entrando dentro dele... \n");
                 
                 if(remo == 1){
                     
                     System.out.println("\n Você pega o remo que conseguiu na quadra de basquete da prisão e começa a remar para longe de alcatraz, \n os guardas disparam contra sua direção, mas você já está distante o suficiente, finalmente você conseguiu fugir... \n em seu coração um misto de sentimentos, você passa a sentir uma alegria imensa ao mesmo tempo se sentindo eufórico, na sua mente um único pensamento: \n \n “ninguém consegue me manter preso, eu sou incrível, eu sou... \n ");
                     System.out.println(" \n \n \t                               ... Jeffrey Dahmer...” ");
                     System.out.println(" \n \n \n \t                          VOCÊ CONCLUI O JOGO E CONSEGUIU FUGIR DE ALCATRAZ ");
                     System.exit(cont);
                 
                 }
                 
                 else{
                     
                     System.out.println("\n Você olha para os lados, mas não encontra nenhum remo, os guardas chegam até você e apontando os fuzis te tiram dele.\n ");
                     solitaria_game_over();
                     
                     repete_fase4e5 = 1;
                     
                     break;
                     
                 }
                     
         }
    }





public static void solitaria_game_over(){
    
    if(solitaria == 1){
    
    System.out.println("\n Você é levado para solitária e fica um mês inteiro sem ver a luz do dia... \n \n A loucura toma conta de você, mas a necessidade de sair dali não desaparece de sua mente, \n após um mês inteiro um guarda vem até você e te leva de volta para o pátio da prisão \n  \n");
    
    
    solitaria--;
    cont = 0;
    
    }
    
    else{
    
        System.out.println("\n Você é levado para o mesmo corredor da solitária, o que vai acontecer? Mais um mês sem ver a luz do sol? \n \n NÃO!!! \n \n Os guardas seguem até o final do corredor dessa vez e ao abrir a porta você se depara com o seu maior medo, a morte, a cadeira elétrica... \n Eles te colocam sentado na cadeira e posicionam os equipamentos na sua cabeça, um guarda puxa a alavanca e você se contorce, é o FIM... \n ");
    
        System.out.println(" \n \n \t                                            GAME OVER ");
        
        System.exit(solitaria);
    }
    
    
}

}

    
    
    
    

