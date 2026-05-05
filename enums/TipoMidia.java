package enums;

import utils.Feedbacks;

public enum TipoMidia {
    IMAGEM(1),
    VIDEO(2),
    DOCUMENTO(3);

    private final int codigo;

    TipoMidia(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static TipoMidia escolherTipo(int codigo){
        for(TipoMidia tipo: values()){
            if(tipo.getCodigo() == codigo){
                return tipo;
            }
        }

        Feedbacks.opcaoInvalida();
        throw new IllegalArgumentException();
    }
}
