# Isso claro em tempo de execução!
class Singleton1(object):

    __instance = None

    def __new__(self, nome):
        if Singleton1.__instance is None:
            Singleton1.__instance = object.__new__(self)
            Singleton1.__instance.__nome = nome

        return Singleton1.__instance

    @property
    def nome(self):
        return self.__nome


if __name__ == "__main__":

    foo = Singleton1("Maria")
    print(foo.nome)
    print(foo)

    bar = Singleton1("Joao")
    print(bar.nome)
    print(bar)

    print(foo is bar)
