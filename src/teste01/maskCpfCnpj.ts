formatarCpfCnpj(numero) {
    if (numero.length === 11) {
      numero = numero.replace(/\D/g, '');
      numero = numero.replace(/(\d{3})(\d)/, '$1.$2');
      numero = numero.replace(/(\d{3})(\d)/, '$1.$2');
      numero = numero.replace(/(\d{3})(\d{1,2})$/, '$1-$2');
      return numero;
    } else {
      numero=numero.replace(/^(\d{2})(\d)/,"$1.$2");
      numero=numero.replace(/^(\d{2})\.(\d{3})(\d)/,"$1.$2.$3");
      numero=numero.replace(/\.(\d{3})(\d)/,".$1/$2");
      numero=numero.replace(/(\d{4})(\d)/,"$1-$2");
      return numero;
    }