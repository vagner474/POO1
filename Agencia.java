import java.util.*;


public class Agencia {
    
    private int numero;
    private Banco banco;
    private List<ContaIF> contas = new ArrayList<ContaIF>();
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public Cliente pesquisarContaPorCPF(String cpf) {
        
        for (Cliente cliente : clientes) {
            
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        
        throw new RuntimeException("Cliente não encontrado: " + cpf);
    }
    
    public void cadastrarConta(ContaIF conta) {
        contas.add(conta);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

}
