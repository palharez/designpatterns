class SingletonClass {
  constructor(name  = "") {
    if(!!SingletonClass.instance) {
      return SingletonClass.instance;
    }

    SingletonClass.instance = this; // Static attribute

    this.name = name;

    return this;
  }

  getName() {
    return this.name;
  }
}

const instanceOne = new SingletonClass("One");
const instanceTwo = new SingletonClass("Two");
const instanceThree = new SingletonClass();

console.log(`Name of instanceOne is "${instanceOne.getName()}"`);
console.log(`Name of instanceTwo is "${instanceTwo.getName()}"`);
console.log(`Name of instanceThree is "${instanceThree.getName()}"`);