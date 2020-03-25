from descontos import DescontoPorCincoItens, DescontoPorMaisDeQuinhentosReais, SemDesconto


class CalculadorDeDescontos(object):

    def calcula(self, orcamento):
        desconto = DescontoPorCincoItens(
            DescontoPorMaisDeQuinhentosReais(
                SemDesconto()
            )
        ).calcula(orcamento)

        return desconto


if __name__ == "__main__":
    from orcamento import Orcamento, Item

    orcamento = Orcamento()
    orcamento.adiciona_item(Item('Item 1', 100))
    orcamento.adiciona_item(Item('Item 2', 50))
    orcamento.adiciona_item(Item('Item 3', 400))

    print(orcamento.valor)

    calculador = CalculadorDeDescontos()

    desconto = calculador.calcula(orcamento)
    print('Desconto calculado %.2f' % desconto)
