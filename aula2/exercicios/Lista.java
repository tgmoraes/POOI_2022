package aula2.exercicios;

 class Lista {
	int tamanho = 0;
	int passo = 5;
	int[] valores = new int[passo];

	
	void add(int valor) {
		if(this.cheio()) this.altera(); 
		this.valores[this.tamanho]=valor;
		this.tamanho++;
	}

	void altera() {
		int novoTam = this.valores.length+this.passo;
		int[] aux = new int[novoTam];
		for(int i=0;i< this.valores.length;i++) {
			aux[i] = this.valores[i];  
		}
		this.valores=aux;
	}

	boolean cheio() {
		return this.tamanho == this.valores.length;
	}

	void remove(int index) {
		if(index>=0 && index < tamanho) {
			for(int i = index;i<tamanho-1;i++) {
				this.valores[i]=this.valores[i+1];
			}
			this.tamanho--;
		}
	}
	 
	int getTamanho() {
		return this.tamanho;
	}

	int get(int index) {
		if(index>=0 && index < tamanho) {
			return this.valores[index];
		}
		else if(index<0) return valores[0];
		else return valores[tamanho-1];
	}

	String paraTexto() {
		String ret = "tam:" + this.tamanho + " - tam físico:"
				+ this.valores.length + " -->[";
		for (int i = 0; i < this.tamanho; i++) {
			ret += this.valores[i] + " ";
		}
		ret += "]";
		return ret;
	}
}

 
 
 
 
 
//	void remove(int index) {
//		if (index >= 0 && index < this.tamanho) {
//			for (int i = index; i < this.tamanho - 1; i++) {
//				this.valores[i] = this.valores[i + 1];
//			}
//			this.tamanho--;
//		}
//	}
//
//	int getTamanho() {
//		return this.tamanho;
//	}
//
//	int get(int index) {
//		if (index >= 0 && index < this.tamanho) {
//			return this.valores[index];
//		}
//		if(index<0) return this.valores[0];
//		else return this.valores[this.tamanho];
//	}
 
 
 
 
 
 
 
// boolean cheio() {
//	 return this.tamanho == this.valores.length;
// }
// 
// void alteraVet() {
//	 int novoTamanho = this.valores.length + this.passo;
//	 int[] vetNovo = new int[novoTamanho];
//	 for (int i = 0; i < this.tamanho; i++) {
//		 vetNovo[i] = this.valores[i];
//	 }
//	 this.valores = vetNovo;	
// }