package avlK;

public class AVL {

    private No noRaiz;

    // CONSTRUTORES
    public AVL() {
        this.noRaiz = null;
    }

    public AVL(int info) {
        this.noRaiz = new No(info);
    }

    // Verifica se a árvore é vazia
    public boolean isEmpty() {
        return this.noRaiz == null;
    }

    // CALCULAR ALTURA
    public int calcularAltura(No noParaCalcAltura) {
        
        if (noParaCalcAltura == null) {
            return 0;
        }
        // altura do nó: 1 + altura do filho mais alto
        return 1 + Math.max(calcularAltura(noParaCalcAltura.getEsquerda()), calcularAltura(noParaCalcAltura.getDireita()));
    }

    // CALCULAR BALANCEAMENTO
    public int getBalanceamento(No noParaBalancear) {
        
        if (noParaBalancear == null) {
            return 0;
        }
        // fator de balanceamento = alturaEsq - alturaDir
        return calcularAltura(noParaBalancear.getEsquerda()) - calcularAltura(noParaBalancear.getDireita());
         
    }

    public void calcularFatorDeBalanceamento(No fatorDeBalanceamentoDoNo) {

        // Nó Balanceado
        if (getBalanceamento(fatorDeBalanceamentoDoNo) == 0) {
            return;
        }
        // Subárvore Esquerda mais alta
        else if (getBalanceamento(fatorDeBalanceamentoDoNo) == 2) {

        }
        // Subárvore Direita mais alta
        else if (getBalanceamento(fatorDeBalanceamentoDoNo) == -2) {

        }
    }

    // INSERE():
    public void insere(int info) {
        No aSerInserido = new No(info);

        // árvore vazia
        if (isEmpty()) {
            System.out.println("Inseri o nó de valor: " + aSerInserido.getInfo());
            this.noRaiz = aSerInserido;
        } else {
            inserirNaArvore(aSerInserido, this.noRaiz);
        }
    }

    public void inserirNaArvore(No infoParaInserir, No noRaiz) {

        // inserção à esquerda
        if (infoParaInserir.getInfo() < noRaiz.getInfo()) {
            // subárvore esquerda vazia
            if (noRaiz.getEsquerda() == null) {
                noRaiz.setEsquerda(infoParaInserir);
                System.out.println("Inseri o nó de valor: " + infoParaInserir.getInfo());
                calcularFatorDeBalanceamento(noRaiz);
            }
            // contém filho à esquerda
            else {
                // passo responsabilidade para subárvore esquerda
                inserirNaArvore(infoParaInserir, noRaiz.getEsquerda());
            }
        }

        // inserção à direita
        else if (infoParaInserir.getInfo() > noRaiz.getInfo()) {
            // subárvore direita vazia
            if (noRaiz.getDireita() == null) {
                noRaiz.setDireita(infoParaInserir);
                System.out.println("Inseri o nó de valor: " + infoParaInserir.getInfo());
                calcularFatorDeBalanceamento(noRaiz);
            }
            // contém filho à direita
            else {
                // passo a responsabilidade para subárvore direita
                inserirNaArvore(infoParaInserir, noRaiz.getDireita());
            }
        }
    }

    // REMOVE():
    public void remove(int info) {

    }


    // IMPRIME():

    public String preOrdem() {
        return stringPreOrdem(this.noRaiz);
    }

    public String stringPreOrdem(No no) {
        StringBuilder stringPreOrdem = new StringBuilder();
        if (!isEmpty()) {
            stringPreOrdem.append(no.getInfo()).append("(" + getBalanceamento(no)+ ") ");
            if (no.getEsquerda() != null) {
                stringPreOrdem.append(stringPreOrdem(no.getEsquerda()));
            }
            if (no.getDireita() != null) {
                stringPreOrdem.append(stringPreOrdem(no.getDireita()));
            }
        } else {
            stringPreOrdem.append("");
        }
        return stringPreOrdem.toString();
    }

    // GETTERS AND SETTERS

    public No getNoRaiz() {
        return noRaiz;
    }

    public void setNoRaiz(No noRaiz) {
        this.noRaiz = noRaiz;
    }
}
