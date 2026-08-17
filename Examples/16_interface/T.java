class LivingBeing {  }

class Human extends LivingBeing { }

class Plant extends LivingBeing {  }

class Animal  extends LivingBeing {  }

interface Smart { }

interface Intelligent { }

// not ok
// class American implements Smart, Intelligent extends Human { }
class American extends Human, Animal, Plant implements Smart, Intelligent { }

// ok
// class American implements Smart, Intelligent { }
class American extends Human implements Smart, Intelligent { }