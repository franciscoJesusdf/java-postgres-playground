package com.example;

class Cliente{
    double renda;
    char sexo;
    int anoNascimento;

    double getRenda(){
        return renda;
    }

        void setRenda(double renda){
            if(renda >=0 )
                this.renda = renda;
           else System.out.println("A Renda deve ser Maior que ZERO");
        }
        
}

public class AppClasses {


    public static void main(String[] args) {
        System.out.println("Criando Classes");
        Cliente cliente = new Cliente();
        cliente.setRenda(-10000);
        cliente.sexo = 'M';
        cliente.anoNascimento = 1975;
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.sexo);
        System.out.println("Ano de Nasc: " + cliente.anoNascimento);

        Cliente cliente2 = new Cliente();
        cliente2.setRenda(9500);
        cliente2.sexo = 'F';
        cliente2.anoNascimento = 1968;
        System.out.println();
        System.out.println("Renda: " + cliente2.renda);
        System.out.println("Sexo: " + cliente2.sexo);
        System.out.println("Ano de Nasc: " + cliente2.anoNascimento);
    }
}
