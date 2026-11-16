package servico;
import modelo.Transacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Repositorio <T extends Transacao> {

    private final List<T> itens = new ArrayList<>();
    
    public void guardar(T item) {
        if(item == null) {
            throw new IllegalArgumentException("Item nulo não pode ser guardado");
        }
        itens.add(item);
    }

    public Optional<T> buscarPorId(int id) {
        for(T item : itens) {
            if(item.getId() == id) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public Optional<T> remover(int id){
        for(int i = 0; i < itens.size(); i++){
            if(itens.get(i).getId() == id){
                return Optional.of(itens.remove(i));
            }
        }
        return Optional.empty();
    }


    public boolean substituir(int id, T novo) {
        for(int i = 0; i < itens.size(); i++) {
            if(itens.get(i).getId() == id){
                itens.set(i, novo);
                return true;
            }
        }
        return false;
    }

    public List<T> listar() {
        return Collections.unmodifiableList(itens);
    }

    public int tamanho() {
        return itens.size();
    }


}