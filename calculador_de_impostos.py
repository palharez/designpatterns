from impostos import ICMS, ISS


class CalculadorDeImpostos(object):

  def realiza_calculo(self, orcamento, imposto):
      return imposto.calcula(orcamento)


if __name__ == '__main__':
    from orcamento import Orcamento

    calculador = CalculadorDeImpostos()
    orcamento = Orcamento(500)

    print(calculador.realiza_calculo(orcamento, ISS()))
    print(calculador.realiza_calculo(orcamento, ICMS()))

