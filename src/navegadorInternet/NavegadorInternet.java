package navegadorInternet;

/**
 * @author argosmaia
 *
 */
public interface NavegadorInternet {
    void abrirURL(String url);
    void fecharNavegador();
    void pesquisar(String termo);
}
