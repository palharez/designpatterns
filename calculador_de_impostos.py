from impostos import ICMS, ISS, ICPP, IKCV


class CalculadorDeImpostos(object):

    def realiza_calculo(self, orcamento, imposto):
        return imposto.calcula(orcamento)


if __name__ == '__main__':
    from orcamento import Orcamento, Item

    calculador = CalculadorDeImpostos()

    orcamento = Orcamento()
    orcamento.adiciona_item(Item('Item 1', 50))
    orcamento.adiciona_item(Item('Item 2', 200))
    orcamento.adiciona_item(Item('Item 3', 250))

    print("ISS e ICMS")
    print(calculador.realiza_calculo(orcamento, ISS()))
    print(calculador.realiza_calculo(orcamento, ICMS()))
    print(calculador.realiza_calculo(orcamento, ICMS(ISS())))

    print("ICPP e IKCV")
    print(calculador.realiza_calculo(orcamento, ICPP()))
    print(calculador.realiza_calculo(orcamento, IKCV()))
    print(calculador.realiza_calculo(orcamento, ICPP(IKCV())))
