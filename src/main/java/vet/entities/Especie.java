package vet.entities;

public enum Especie {
    CAO(1),
    GATO(2),
    AVE(3),
    ROEDOR(4),
    REPTIL(5);

    private int code;

    private Especie(int code){this.code = code;}

    public int getCode(){
        return code;
    }
    public static Especie valueOf(int code){
        for(Especie value: Especie.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Valor invalido");
    }

}
