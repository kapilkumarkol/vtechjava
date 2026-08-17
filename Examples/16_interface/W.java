class A { }

class B { }

class C { }

// not ok
// interface D extends B { }
// interface D extends B, C { }

// ok
// interface D extends E { }
// interface D extends E, F { }

// interface D implements B { }
// interface D implements B, C { }
// interface D implements E { }
interface D implements E, F { }

interface E { }

interface F { }