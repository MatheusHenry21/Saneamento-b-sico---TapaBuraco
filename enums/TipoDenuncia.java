package enums;

public enum TipoDenuncia {
    BURACO(1),
    LIXO(2),
    ESGOTO(3),
    ILUMINACAO(4),
    OUTROS(5);

    private final int codigo;

    TipoDenuncia(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static TipoDenuncia escolherTipo(int codigo){
        for(TipoDenuncia tipoDenuncia: values()){
            if(tipoDenuncia.getCodigo() == codigo){
                return tipoDenuncia;
            }
        }
        return null;
    }
}